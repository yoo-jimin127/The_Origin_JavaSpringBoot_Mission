# Mission 3
## 데이터를 Database에서 관리
이전 미션2에서 구현한 Post와 Board 관리 서비스에 JPA를 사용해 테이블을 구성하여
어플리케이션이 종료되어도 데이터가 유지될 수 있도록 구현할 것

### 공통 미션
- chapter 6의 Spring Boot Properties를 활용해 기초 개발 단계에서는 H2 데이터베이스 사용
- 개발 환경과 상용 환경의 데이터베이스를 구분하여 실행할 수 있도록 구현

### Basic Mission
- 커뮤니티 사이트에 데이터베이스 추가
- 이전 Basic Mission에서 구현하였던 서비스의 DTO를 기반으로 Entity를 만들어 관리
1. `PostEntity` 와 `BoardEntity` 생성
2. `PosetEntity` 와 `BoardEntity` 의 관계 표현
    1. `@ManyToOne` , `@OneToMany`, `@JoinColumn` 을 적절히 사용
3. `PostEntity` 의 작성자를 저장하기 위한 `UserEntity` 를 만들고 관계 표현

### 세부 조건

1. `UserEntity` 에 대한 CRUD 작성
2. `Post` 를 작성하는 단계에서 `User` 의 정보를 어떻게 전달할지 고민해볼 것

## Basic Mission 스크린샷
![image](https://user-images.githubusercontent.com/66112716/157456426-756734b3-3dfa-45de-8a62-260a55d25089.png)
