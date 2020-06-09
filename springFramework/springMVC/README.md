# Spring MVC
: MVC 패턴을 웹 환경에 적용하기 위해 Front Controller 패턴을 도입한 Model2 MVC 패턴 사용      

**Front Controller 패턴**    
: 모든 요청을 하나의 컨트롤러가 받아서 처리   


- [Spring MVC Architecture](#spring-mvc-architecture)
- [Spring MVC Layer](#spring-mvc-layer) 
 


## Spring MVC Architecture

![spring mvc](https://docs.spring.io/spring/docs/4.3.x/spring-framework-reference/html/images/mvc.png)


구성 요소  | 설명
---|---
DispatcherServlet | 요청을 받아 컨트롤러에 위임하고 결과를 받아 뷰에 전달
HandlerMapping    | 요청을 처리할 컨트롤러를 찾음
Controller        | 전달받은 요청을 처리하고 결과를 전달  
ViewResolver      | 처리 결과를 보여줄 뷰를 결정
View              | 처리 결과를 보여줄 응답 생성



## Spring MVC Layer 

레이어 | 패키지 | 설명 | 
---|---|---
Presentation Layer  | view | 표현 계층 : 사용자 인터페이스, 이벤트 처리, 데이터 렌더링 
Control Layer       | web, controller | 제어 계층 : 진입점, 데이터 흐름 제어, 유효성 검사, 익셉션 처리
Business Layer      | service | 로직 계층 : API 제공, 핵심 기능 구현, 트랜잭션 등 부가 기능 구현
Persistence Layer   | repository, DAO | 영속 계층 : DB 접근, 데이터 CRUD 
Domain Model Layer  | domain, model | Domain, Entity, VO 


**anemic domain model**   
: 빈약한 도메인 모델    
: 상태만 존재하는 도메인 모델  

https://martinfowler.com/bliki/AnemicDomainModel.html



[top](#spring-mvc)