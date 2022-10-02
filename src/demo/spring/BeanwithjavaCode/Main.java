package demo.spring.BeanwithjavaCode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Teacher teacher = (Teacher)context.getBean("teacherBean");
		teacher.testdep();
		teacher.getName();
	}

}
