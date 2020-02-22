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



[top](#)
