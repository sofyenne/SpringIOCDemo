package demo.spring.BeanScopeAndLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@ComponentScan
public class MyApp {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(MyApp.class);
		 Student student = context.getBean("student",Student.class);
		 Student student1 = context.getBean("student",Student.class);

		 PrototypeClass prototype = context.getBean("prototype",PrototypeClass.class);
		 PrototypeClass prototype1 = context.getBean("prototype",PrototypeClass.class);
		 
		 System.out.println(student == student1);
		 System.out.println("the location memory of student class is"+student);
		 System.out.println("the location memory of student1 class is"+student1);
		 System.out.println("the location memory of Prototype class is"+prototype);
		 System.out.println("the location memory of Prototype 1  class is"+prototype1);
		 System.out.println("the location memory of Prototype 1  class is"+prototype1);




		 

		 
	}

}
