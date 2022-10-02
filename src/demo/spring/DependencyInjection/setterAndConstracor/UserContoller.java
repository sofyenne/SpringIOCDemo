package demo.spring.DependencyInjection.setterAndConstracor;

import java.util.List;

public class UserContoller {
	
	private UserServiceImp userService ; 
	
	//inject user service by setter method 
	
	public void  setUserServiceImp(UserServiceImp userService) {
		this.userService = userService ; 
	}
	
	public List<UserModel>getUser(){
		return userService.getUserList();
	}
	public UserModel saveUser(UserModel user) throws Exception {
		return userService.saveUser(user);
	}

}
