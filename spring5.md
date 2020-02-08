# Spring 5.x
: Kotlin, JUnit5, HTTP/2 지원    
: 스프링 핵심 모듈을 제외한 일부 모듈을 Kotlin으로 개발           
: 리액티브 프로그래밍으로 패러다임 전환     
: 리액티브 프로그래밍으로 인해 전통적인 JDBC 지원 불가   
: 리액티브 프로그래밍 지원으로 인해 WebFlux라는 리액티브 웹 프레임워크 등장  

- Reactive Programing
- Reactive Streams
- Reactor
- WebFlux


**최소 요구 사항**
- jdk 8
- servlet 3.1
- tomcat 8.5
- jetty 9.4
- ...


**spring4 vs spring5**

spring4 | spring5
---|---
@MVC  | RouterFunction, HandlerFunction
HttpServletRequset  | ServerRequest
HttpServletResponse | ServerResponse


```java
// java
@RequestMapping("/someUrl")
public String getSome(Model model) {
    model.addAttribute("key", "value");
    model.addAttribute("items", service.findItems());
    return "somePage";
}


// kotlin
@RequestMapping("/someUrl")
fun getSome(model: Model): String {
    model["key"] = "value"
    model["items"] = service.findItems()
    return "somePage"
}


// WebFlux
RouterFunction<String> route = route( GET("/some-url"),
    request -> Response.ok().body(fromObject("Hello World")) );
```


## Spring Project
https://spring.io/projects    
https://github.com/spring-projects     


프로젝트 | 설명
---|---
spring Boot             | 웹 어플리케이션 빠른 구축
spring Framework        | 웹 어플리케이션 핵심 기능 제공
spring Data             |
spring Cloud            |
spring Cloud Data Flow  | 메시징 교환 - SEDA
spring Security         |
spring Session          |
spring Integration      |
spring HATEOAS          | HATEOAS 템플릿 제공
spring REST Docs        |
spring Batch            |
spring IO Platform      |
spring AMQP             | AMQP(메시징 솔루션) 템플릿 제공
spring for Android      | 안드로이드 어플리케이션 개발을 위한 스프링 컴포넌트 제공
spring CredHub          |
spring Flo              |
spring for Apache Kafka | Apache Kafka(메시징 솔루션) 템플릿 제공
spring LDAP             |
spring Mobile           |
spring Roo              |
spring Shell            |
spring Statemachine     |
spring Test HtmlUnit    |
spring Vault            |
spring Web Flow         |
spring Web Services     |



[top](#)
