package demo.spring.DependencyInjection.setterAndConstracor;

import java.util.List;

public interface IUserService {
	
	List<UserModel>getUserList();
	UserModel saveUser(UserModel model) throws Exception;

}
