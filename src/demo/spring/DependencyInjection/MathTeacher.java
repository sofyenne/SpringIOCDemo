package demo.spring.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("Mathteacher")
public class MathTeacher implements Teacher{

	@Override
	public void getteachersp() {
		System.out.println("my name is sofien ,i am a computer Math teacher");
		
	}

}
