package demo.spring.DependencyInjection.setterAndConstracor;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements IUserService {
	
	private UserDao userdao ; 
	
	public UserServiceImp(){
		
	}
    public UserServiceImp(UserDao userdao){
		this.userdao = userdao ; 
	}
	@Override
	public List<UserModel> getUserList() {
		return userdao.get();
	}

	@Override
	public UserModel saveUser(UserModel model)throws Exception {
		 return userdao.save(model);
	}

}
