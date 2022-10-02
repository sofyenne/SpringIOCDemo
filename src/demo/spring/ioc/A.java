package demo.spring.ioc;

public class A {
	
	private ClassB classb ; 
	
	public A(ClassB classb) {
		this.classb = classb ;
	}
	public void testcallBeanA() {
		System.out.println("class A created ");
		classb.injected();
	}

}
