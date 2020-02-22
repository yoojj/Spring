# Spring Container
: IoC 원칙과 DI를 구현하는 주체      
: 설정 메타데이터를 통해 Spring Bean 생성, 초기화, 제거 등 라이프 사이클 관리  
: Spring Bean 간의 의존 관계 관리    


**컨테이너 종류**   
- [BeanFactory](#beanfactory)
- [ApplicationContext](#applicationcontext)


**패키지**  
- org.springframework.beans
- org.springframework.context


컨테이너 | 설명 | 특징  
---|---
BeanFactory        | DI 구현 | lazy loading : 요청받는 시점에 빈 인스턴스를 생성하고 로드
ApplicationContext | 추가 기능 제공  | free loading : 설정 파일과 함께 모든 빈 인스턴스를 생성하고 로드



## BeanFactory
: spring bean을 인스턴스화하고 구성 및 관리하는 컨테이너    
: Factory 디자인 패턴 구현   


**구현**     
- XmlBeanFactory
- XmlWebApplicationContext
- ...



## ApplicationContext  
: BeanFactory 인터페이스를 상속한 인터페이스   
: AOP, 메시지 처리 등 여러 추가 기능을 제공  


**구현**    
- ClassPathXmlApplicationContext
- FileSystemXmlApplicationContext
- WebApplicationContext
- ...


[top](#)
