package com.example.secondweek.session.domain.session;

import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionRegisterInterfacesRequest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;


@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class SessionServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SessionRepository sessionRepository;

    @Autowired
    private SessionService sessionService;


    @Test
    void 특강신청_API_테스트() throws Exception {
        // given
        SessionRegisterInterfacesRequest request = new SessionRegisterInterfacesRequest(1L, 1L);

        // when
        when(sessionRepository.sessionRegister(any())).thenReturn(true);
        boolean result = sessionService.sessionRegister(request);

        //then
        assertTrue(result);
    }

    @Test
    void 동시_특강신청_테스트() throws InterruptedException {
        // given
        SessionRegisterInterfacesRequest request = new SessionRegisterInterfacesRequest(1L, 1L);

        // when
        int threadCount = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        when(sessionRepository.sessionRegister(any())).thenReturn(true);
        for (int i = 0; i < threadCount; i++) {
            executorService.execute(() -> {
                try {
                    boolean result = sessionService.sessionRegister(request);
                    assertTrue(result);
                } finally {
                    countDownLatch.countDown();
                }
            });
        }

        // then
        countDownLatch.await();
        executorService.shutdown();
    }

    @Test
    void 특강신청_확인조회_API_테스트() throws Exception {
        // given
        List<SessionStudentInfoEntity> infoEntityList = List.of(new SessionStudentInfoEntity());
        SessionInfoRegisterInfraRequest register = new SessionInfoRegisterInfraRequest(1L, "특강1", "영진", 30, LocalDate.of(2024, 10, 1));
        sessionRepository.sessionInfoRegister(register);
        // when
        when(sessionRepository.findByStudentId(anyLong())).thenReturn(infoEntityList);
        List<SessionStudentInfoEntity> result = sessionService.findByStudentId(1L);

        // then
        assertNotNull(result);
        assertEquals(1, result.size());
    }

}