# Spring Framework Architecture
: 기능에 따라 모듈로 분리하여 지원    
: 약 20개의 모듈로 구성되어 있으며 필요한 모듈을 조합해 사용     


**모듈 그룹**
- [Core Container](#core-container)
- [AOP](#aop)
- [Messaging](#messaging)
- [Data Access and Integration](#data-access-and-intergraion)
- [Web](#web)
- [Test](#test)



## Core Container

모듈 | 아티팩트 | 설명
---|---|---
core            | spring-core  | 컨버터, 상수, cglib, asm, 유틸리티 등 제공   
beans           | spring-beans | DI 구현 제공  
context         | spring-context | DI, 애플리케이션 컨텍스트 구현, 국제화, 스케쥴링, Cache 등 제공
context support | spring-context-support | Mail, Quartz, Ehcache, Freemarker 등 부가 기능 제공   
expression      | spring-expression | EL을 확장한 스프링 표현식 언어(SpEL) 제공

! spring-core은 핵심 모듈로 모든 모듈이 의존   


**cblib**  
Code Generator Library  
: 프록시 객체 생성을 위한 라이브러리    



## AOP

모듈 | 아티팩트 | 설명
---|---|---
aop             | spring-aop	 | 스프링 빈즈를 위한 프록시 기반 aop 제공
aspects         | spring-aspects | AspectJ 연동 제공


**AspectJ**  
: 자바 언어를 위한 AOP 프레임워크   



## Messaging
: spring4 부터 지원하는 모듈      

모듈 | 아티팩트 | 설명
---|---|---
messaging       | spring-messaging | 메시징 아키텍처, 프로토콜 제공



## Data Access and Integration

모듈 | 아티팩트 | 설명
---|---|---
jdbc           | spring-jdbc | jdbc 레이어 제공
transaction    | spring-tx | 트랜잭션 처리를 위한 레이어 제공   
orm            | spring-orm | JPA, Hibernate 등 ORM을 위한 레이어 제공   
oxm            | spring-oxm | JAXB, XStream 등 OXM을 위한 레이어 제공  
jms            | spring-jms | JMS를 지원을 위한 모듈 제공  



## Web

모듈 | 아티팩트 | 설명
---|---|---
web          | spring-web | 웹 개발에 필요한 기능 제공    
servlet      | spring-webmvc | MVC와 REST 웹 개발에 필요한 기능 제공
websocket    | spring-websocket | 웹 소켓 연동을 위한 기능 제공  



## Test

모듈 | 아티팩트 | 설명
---|---|---
test            | spring-test | 단위 테스트와 통합 테스트를 위해 JUnit과 TestNG 제공   



[top](#)
