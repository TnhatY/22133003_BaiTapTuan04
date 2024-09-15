package vn.iotstar.Controller;

import vn.iotstar.models.User;

public interface UserService {
	User get(String username);
	User login(String username, String password);
	boolean forgetPass(String username,String password);
	 void insert(User user);
	 boolean register(String email, String password, String username, String 
	fullname, String phone);
	 boolean checkExistEmail(String email);
	 boolean checkExistUsername(String username);
	 boolean checkExistPhone(String phone);
}
