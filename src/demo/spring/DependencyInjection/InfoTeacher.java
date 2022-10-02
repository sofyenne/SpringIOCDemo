package demo.spring.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("scteacher")
public class InfoTeacher implements Teacher {

	@Override
	public void getteachersp() {
		System.out.println("my name is sofien ,i am a computer science teacher");
		
	}

}
