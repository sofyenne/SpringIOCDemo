package demo.spring.BeanScopeAndLifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototype")
@Scope("prototype")
public class PrototypeClass {
	
	public PrototypeClass() {
		System.out.println("i am inside the prototype class constractor ");
	}

}
