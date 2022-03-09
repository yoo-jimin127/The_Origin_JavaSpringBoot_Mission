# Mission 1
## Interface 사용해보기

### Basic Mission 구현 명세
1. 사람을 나타내는 `Person` 인터페이스 정의
2. 사람을 구현하는 추상 클래스 `AbstractPerson` 구현
3. `AbstractPerson`을 확장하는 `Student` & `Lecturer` 클래스 구현

### 세부 조건
1. `Person` 인터페이스는 사람을 나타내는 인터페이스로 `void speak()` 함수를 가짐
   `Person` 인터페이스의 구현체는 `speak` 함수를 통해 자신의 정보를 출력
2. `AbstractPerson` 추상 클래스는 사람이라면 공통적으로 가지는 정보, 기능 등을 구현하기 위한 클래스
   이름, 나이 정보 등을 가지고 있으며, `speak` 함수도 사용 가능
3. `Student` 와 `Lecturer` 는 `AbstractPerson` 을 extend 하며, 
  `speak` 함수를 사용할 때 자신의 이름과 학생인지, 강사인지 판별
