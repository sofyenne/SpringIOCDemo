package demo.spring.DependencyInjection.setterAndConstracor;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppContext {
   public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyAppConfig.xml");
		UserContoller controller = context.getBean("userController" , UserContoller.class);
		controller.saveUser(new UserModel(1,"sofien",30));
		controller.saveUser(new UserModel(2,"ali",30));
		List<UserModel> userList = controller.getUser();
		for(UserModel user : userList) {
			System.out.println(user.getName());
		}
		context.close();
		

}
}
