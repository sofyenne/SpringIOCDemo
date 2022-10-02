package demo.spring.DependencyInjection.setterAndConstracor;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	List<UserModel> userlist = new ArrayList<UserModel>();
	
	public UserModel save(UserModel user) throws Exception{
		try {
			this.userlist.add(user);
			return user ; 
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw new Exception(e);
		}
		
	}
	public List<UserModel> get(){
		return this.userlist ;
	}

}
