package demo.spring.BeanwithjavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("demo.spring.beanwithjavaCode")
@PropertySource("classpath:test.properties")
public class MyAppConfig {
	
	
	@Bean
	public TeacherDependency depBean() {
		return new TeacherDependency();
	}
	
	@Bean
	public Teacher teacherBean() {
		return new Teacher(depBean());
	}

}
