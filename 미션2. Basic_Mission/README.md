# Mission 2
## Spring Boot로 만드는 간단한 서비스

---

### Basic Mission 구현 명세
커뮤니티 사이트 만들어보기

1. 게시판에 대한 CRUD 작성
    1. 게시판은 게시판 이름에 대한 정보를 가짐
2. 게시글에 대한 CRUD를 작성
    1. 게시글에는 제목, 본문, 작성자, 비밀번호에 대한 정보가 존재
    2. 작성된 게시글은 게시판에 속해 있어야 함
    3. 게시글을 삭제하기 위해서는 게시글의 비밀번호가 함깨 제공되어야 함

### 세부 조건

1. 관계형 데이터베이스의 Primary Key와 같은 정보 데이터에 포함하여, 각 자원을 쉽게 식별할 수 있도록 할 것
2. REST API와 URL의 구조를 잘 생각하여 `@RequestMapping` 구성을 할 수 있도록 할 것
    1. 특히, `post` 와 `board` 의 관계가 요청하는 URL 상에 나타날 수 있도록 할 것

------
### Mission 2. Basic Level 구현 - 동작 과정
------

1. 게시판 생성 기능(Create Board)
![image](https://user-images.githubusercontent.com/66112716/155154519-25fcc631-2ab2-42fd-99df-208b403fa8af.png)

2. 게시물 생성 기능(Create Post)
![image](https://user-images.githubusercontent.com/66112716/155154994-c4f2032f-5a72-4dc6-a096-6551c480c58d.png)

3. 게시판 전체 보기 기능(Read All Board)
![image](https://user-images.githubusercontent.com/66112716/155155466-ac5b2652-a133-45b0-b6bf-e825539533a6.png)
![image](https://user-images.githubusercontent.com/66112716/155155522-f786b72e-8a5c-4ee1-a8e0-c83e7a64c91e.png)

4. 게시판의 read one 기능(Read One Board)
![image](https://user-images.githubusercontent.com/66112716/155155709-dd535650-37ef-4120-8846-e35922e5997b.png)

5. 게시물 전체 보기 기능(Read All Post)
![image](https://user-images.githubusercontent.com/66112716/155156177-17fc36b1-c6b4-478f-b6ca-7c88cef80c56.png)

6. 게시물의 read one 기능(Read One Post)
![image](https://user-images.githubusercontent.com/66112716/155156581-d796f731-ef78-41f3-a98b-c225f01dfb34.png)

7. 게시판의 업데이트 기능(Update Board)
![image](https://user-images.githubusercontent.com/66112716/155157196-96796806-44de-436e-84a0-a4e30a9fe1ba.png)
![image](https://user-images.githubusercontent.com/66112716/155157323-9a562fbc-c24e-46e7-aab2-b4b3e8cdfbd6.png)

8. 게시물의 업데이트 기능(Update Post)
![image](https://user-images.githubusercontent.com/66112716/155157643-c676c8d0-d18c-475b-9855-bc4d444b5998.png)
![image](https://user-images.githubusercontent.com/66112716/155157723-6a8d62ff-2c29-4eaf-9e55-8232f18dbf1d.png)

9. 게시판 삭제 기능(Delete Board)
![image](https://user-images.githubusercontent.com/66112716/155157898-db5e2c76-b9aa-49f5-93d5-bcbca930b77e.png)
![image](https://user-images.githubusercontent.com/66112716/155157974-963013d8-d7b9-40c9-b363-07d3c17b6421.png)

10. 게시물 삭제 기능(Delete Post)
![image](https://user-images.githubusercontent.com/66112716/155158344-742d47bc-a7ca-41fa-a963-c796c712d124.png)
![image](https://user-images.githubusercontent.com/66112716/155158427-a784d1a9-0192-4aad-bb29-917983101fc3.png)
