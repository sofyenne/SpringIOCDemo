package demo.spring.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("service")
public class ServiceImpl implements ServiceTeacher {
	@Qualifier("scteacher")
	@Autowired
	private Teacher teacher ; 
	

	@Override
	public void printteacher() {
		teacher.getteachersp();
		
	}

}
