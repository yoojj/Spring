# IoC
Inversion of Control    
= Hollywood Principle     
: 제어 역전, 제어 반전   
: 외부에 의해 프로그램 흐름이 제어되는 개념-설계 원칙 (Design Principle)     
: 객체 간 느슨한 결합을 위해 일부 객체 생성과 의존성 관리 등을 외부에서 제어   


**IoC Container**    
: IoC 원칙에서 흐름을 제어하는 주체    

ex.
- servlet container : 서블릿 인터페이스를 구현한 객체 관리
- spring container : 스프링 빈즈 관리  


**IoC 구현**  
- [Dependency Injection](#di)
- [Dependency Lookup](#dl)
- Service Locator
- Template
- Factory
- Strategy


```
DI Container
IoC Container    Framework
-------------
DI               Pattern
-------------
DIP
IoC              Principle
```

\+ [DIP](https://github.com/yoojj/CS/blob/master/Software/Design/design-principle-oop.md#dip)



## DI
Dependency Injection    
: 의존성 주입   
: IoC 원칙을 구현한 디자인 패턴    
: 객체 간 의존 관계를 설정 정보를 통해 정의    
: constructor, property(setter), method를 통해 의존성 주입     
! 스프링은 constructor와 property를 통해 DI 지원   


**DI Container**      
: DI 기능을 제공하는 라이브러리나 프레임워크    



### Pure DI   
: 컨테이너가 없는 의존성 주입   

https://blog.ploeh.dk/2014/06/10/pure-di/



## DL
Dependency Lookup   
: 의존성 조회, 의존성 검색       
: 저장소(ex. JNDI)에 저장된 객체에 접근하기 위해 컨테이너가 제공하는 API 사용    



[top](#)
