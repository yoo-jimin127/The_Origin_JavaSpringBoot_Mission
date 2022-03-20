# Misson 4

# 로그인, 사용자 데이터 다루기

## Basic Mission

---

**로그인, 회원가입 구현**

Spring Security를 활용하여, 로그인, 회원가입 기능 구현 <br>
강의에서 사용한 UserDetailsService를 활용하되, 필요한 정보를 다 포함할 수 있도록 구현 <br>

1. `UserEntity` 는 저희가 사용자를 저장하기 위해 정의했던 `Entity` 입니다. 잠시 리뷰를 해봅시다.
    1. `username` , `password` 는 일반적인 서비스의 아이디, 비밀번호로 활용됩니다.
    2. `residence` 는 `AreaEntity` 를 필요로 합니다.
    3. `isShopOwner` 는 회원가입 시에 추가되어야 합니다.
2. `CommunityUserDetailsService` 클래스를 정의하고, `UserDetailsService` 의 구현체로 선언합시다.
    1. `UserRepository` 를 멤버 객체로 가지고 있어, `loadByUsername` 등의 함수에서 사용할 수 있어야 합니다.
    2. 주어진 `username` 에 해당하는 사용자가 없다면, `UsernameNotFoundException` 을 throw 할 수 있도록 작성합시다.
3. `UserRepository` 를 통해 받아온 `UserEntity` 를 `UserDetails` 의 형태로 반환할 수 있어야 합니다.
    1. `UserDetails` 는 인터페이스로서, Spring Security에서 요구하는 정보를 제공할 수 있는 getter 함수들을 구현하도록 명시되어 있습니다.
    2. 강의에서 사용한 미리 구현된 `User` 객체를 사용하거나,
    3. 직접 `UserDetails` 를 구현하여, 필요한 내용을 전달하면 됩니다.
4. `UserController` 라고 `@Controller` Bean을 만들고, 강의와 유사하게 로그인, 회원가입 등의 기능을 추가합시다.
    1. 강의에서 사용한 `signup-form.html` 을 적당히 수정하면, shop owner를 form에 추가할 수 있습니다. `type="checkbox"` 는 `Boolean` 형으로 Controller 에서 받을 수 있습니다.
        
        ```html
        <form th:action="@{/user/signup}" method="post">
            <input type="text" name="username" placeholder="아이디"><br>
            <input type="password" name="password" placeholder="비밀번호"><br>
            <input type="password" name="password_check" placeholder="비밀번호 확인"><br>
            is shop owner&nbsp;<input type="checkbox" name="is_shop_owner"><br>
            <button type="submit">회원가입</button>
        </form>
        ```
        
    2. `AreaEntity` 는 편의상 랜덤으로 지정해 줍시다.

### 세부 사항

1. `AreaEntity` 의 경우, 더미 데이터를 우선 활용합니다.
    1. 서울시 서초구 서초동, 37.4877° N, 127.0174° E
    2. 서울시 강남구 역삼동, 37.4999° N, 127.0374° E
    3. 서울시 강남구 삼성동, 37.5140° N, 127.0565° E
2. `UserDetailsService` 를 구현할때, `UserEntity` 의 모든 정보가 `UserDetails` 에 포함될 필요는 없습니다. 기본적으로 `UserDetails` 는 인터페이스이며, 정의된 함수들이 다 구현되어 있는 어떤 클래스든 상관없이 사용할 수 있습니다.
