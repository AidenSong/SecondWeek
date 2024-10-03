



# 강의 정보 테이블
* 강의 최대 인원 설정을 위한 CAPACITY
* 날짜 검색을 위한 DATE
```
SESSION_INFO ( 
    ID,
    NAME,
    PROFESSOR_NAME,
    CAPACITY,
    DATE,
)
```

# 학생 정보 테이블
```
STUDENT_INFO (
    ID,
    NAME,
)
```

# 수강 테이블
* 중복 신청을 막기 위한 SESSION 과 STUDENT의 통합 테이블
```
SESSION_STUDENT_INFO (
    SESSION_ID,
    SESSION_NAME,
    PROFESSOR_NAME,
    CAPACITY,
    DATE,
    STUDENT_ID,
    STUDENT_NAME,
)
```



