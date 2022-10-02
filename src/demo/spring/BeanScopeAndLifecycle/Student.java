package demo.spring.BeanScopeAndLifecycle;

import org.springframework.stereotype.Component;



@Component
public class Student {
	
	
	
	public Student(){
		System.out.println("i'm inside the constractor of student class ");
	}
	
	public void init() {
		System.out.println("i'm inside the init methode of student class ");

	}
	
	

}
