# Spring Configuration Metadata   
: 설정 메타데이터    
: 어떤 객체를 어떻게 인스턴스화하고 설정하고 조합하는 지에 대한 정보   


**Configuration 종류**   
- XML-based
- Annotation-based
- Java-based



## XML Config

```xml
<bean id="" class="">
```



## Annotation Config
: spring 2.5 도입   

```java
@Component
public class SomeClass {
}

@ComponentScan
public class ComponentScanApp {
}
```



## Java Config
: spring 3.0 도입

```java
@Configuration
public class AppConfig {

    @Bean
    public SomeBean someBean(){
        return new SomeBeanImpl();
    }

}
```



[top](#)
