# Spring DI 

**XmlConfig**

```
lib/
├── spring-core.jar
├── spring-beans.jar
└── common-logging.jar 
```



** JavaConfig**   

```
lib/
├── spring-core.jar
├── spring-beans.jar
├── spring-context.jsr
├── spring-aop.jar
├── spring-expression.jar
└── common-logging.jar 
```



## Constructor Injection

**java** 

```java
public class A {
	
	private B b;
	
	public A (B b){
		this.b = b;
	}
	
}
```

**xml**   

```xml 
<bean id="beanA" class="A">
	<constructor-arg ref="beanB"/>
</bean>

<bean id="beanB" class="B" />
```
