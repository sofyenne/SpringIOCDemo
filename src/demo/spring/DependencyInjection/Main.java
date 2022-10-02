package demo.spring.DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(Main.class);
		 // Teacher teacher = context.getBean("Mathteacher",Teacher.class);
		 // teacher.getteachersp(); 
		
		ServiceTeacher service = context.getBean("service" ,ServiceTeacher.class );
		service.printteacher();
	}

}
