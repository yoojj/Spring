# Spring Bean
: 스프링 컨테이너가 생성하고 관리하는 객체 지칭     
: 스프링 빈즈 > 자바 빈즈   


**JavaBeans**  
: Java Beans API 스펙에 따라 만든 컴포넌트 모델 ≒ VO, DTO, POJO   

- POJO : 특정 환경에 종속되지 않는 객체
- POJI : 특정 환경에 종속되지 않는 인터페이스



## Spring Bean LifeCycle

- InitializingBean 빈 초기화 
- DisposableBean 빈 제거



## Spring Bean Scope
: 스프링 빈은 스프링 컨테이너에 의해 싱글톤으로 관리    
: 필요에 따라 scope 속성을 통해 상태 변경        

스코프 | 설명
---|---
singleton | 기본 스코프로 단일 인스턴스로 생성되어 전역에서 공유  
prototype | 빈 요청마다 새로운 인스턴스 생성
thread    | 스레드마다 인스턴스를 생성하며 해당 스레드에 종속  
request   | HTTP 요청마다 인스턴스를 생성하며 해당 요청에 종속
session      | HTTP 세션 생성시 인스턴스를 생성하며 해당 세션에 종속  
application  | 단일 인스턴스로 생성되어 서블릿 컨텍스트에 종속  
custom       | org.pringframework.beans.factory.config.Scope 구현

```xml
<bean id="SomeClass" class="ex.spring.SomeClass" scope="prototype" />
```



[top](#spring-bean)
