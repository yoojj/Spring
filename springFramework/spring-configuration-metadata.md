# Spring Configuration Metadata   
: 설정 메타데이터    
: 어떤 객체를 어떻게 인스턴스화하고 설정하고 조합하는 지에 대한 정보   


**종류**   
- [XML-based](#xml-configuration)
- [Java Annotation-based](#annotation-configuration)
- [Java Code-based](#java-configuration)



## XML Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 빈이 정의된 다른 파일 로드 -->
    <import resource="some.xml" />

    <!-- 스프링 컨테이너가 관리할 빈 정의 -->
    <bean id="" name="" class="" singleton="" lazy-init="" />

</beans>
```


**bean tag**

속성 | 설명
---|---|---
id    | 빈 식별을 위한 고유 이름 정의  
name  | (여러 식별자가 필요한 경우) 알리아스 정의
class | 빈으로 등록할 (패키지를 포함한) 클래스 지정  
scope | 빈 범위 지정
abstract   | 빈 추상 클래스 여부 지정, 기본값은 false
singleton  | 빈 싱글톤 여부 지정, 기본값은 true
depends-on | 의존되는 빈 지정   
lazy-init  | 빈 로딩 지연 여부 지정
default-lazy-init |
constructor-arg   |
property          |
lookup-method     |
init-method       | 인스턴스를 초기화 할 메소드 지정
destroy-method    | 인스턴스를 소멸시킬 메소드 지정  



## Annotation Configuration
: spring 2.5 도입   

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 어노테이션 사용을 위한 태그 등록-->
    <context:annotation-config />

</beans>
```


```java
@Component
public class SomeClass {
    @Autowired
    private SomeBean bean;
}
```



## Java Configuration
: spring 3.0 도입

```java
@Configuration
@ComponentScan(basePackages="")
public class AppConfig {

    // 스프링 컨테이너가 관리할 빈
    @Bean
    public SomeBean someBean(){
        return new SomeBeanImpl();
    }

}
```



[top](#)
