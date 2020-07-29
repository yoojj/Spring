# Spring Framework Architecture
: 기능을 모듈로 분리해 지원    
: 약 20개의 모듈로 구성되어 있으며 필요한 모듈을 조합해 사용     
: 스프링 버전에 따라 지원하는 모듈이 조금씩 다름   


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
core            | spring-core  | 컨버터, cglib, asm, 유틸리티 등 제공   
beans           | spring-beans | DI 구현 제공  
context         | spring-context | 애플리케이션 컨텍스트 구현, 국제화, 스케쥴링, 캐시 등 기능 제공
context support | spring-context-support | Mail, Quartz, Ehcache, Freemarker 등 부가 기능 제공   
expression      | spring-expression | EL을 확장한 스프링 표현식 언어(SpEL) 제공

! spring-core은 핵심 모듈로 모든 모듈이 의존   

```
context --> bean, aop, expression --> core
context-support --> context
```


**cblib**  
Code Generator Library  
: 프록시 객체 생성을 위한 라이브러리    


**asm**   
: 바이트 코드 조작과 분석을 위한 라이브러리   

https://asm.ow2.io/



## AOP

모듈 | 아티팩트 | 설명
---|---|---
aop          | spring-aop	 | 스프링 빈즈를 위한 프록시 기반 aop 제공
aspects      | spring-aspects | AspectJ 기반 aop 제공


```
aop --> beans --> core
```



## Messaging
: spring4 부터 지원하는 모듈      

모듈 | 아티팩트 | 설명
---|---|---
messaging    | spring-messaging | 메시징 아키텍처, 프로토콜 제공


```
messaging --> websocket --> webmvc --> context
```



## Data Access and Integration

모듈 | 아티팩트 | 설명
---|---|---
transaction  | spring-tx | 트랜잭션 처리를 위한 레이어 제공   
jdbc         | spring-jdbc | jdbc 레이어 제공
orm          | spring-orm | JPA, Hibernate 등 ORM을 위한 레이어 제공   
oxm          | spring-oxm | JAXB, XStream, JiBX, Castor 등 OXM을 위한 레이어 제공  
jms          | spring-jms | JMS 사용을 위한 기능 제공  


```
jdbc --> tx --> context
```



## Web

모듈 | 아티팩트 | 설명
---|---|---
web          | spring-web | 웹 개발에 필요한 기능 제공    
servlet      | spring-webmvc | JSP 등 템플릿 엔진과 연동하기 위한 기능 제공
websocket    | spring-websocket | 웹 소켓 연동을 위한 기능 제공  


```
webmvc --> web --> context
```



## Test

모듈 | 아티팩트 | 설명
---|---|---
test         | spring-test | 단위 테스트와 통합 테스트를 위해 JUnit과 TestNG 제공   



[top](#)
