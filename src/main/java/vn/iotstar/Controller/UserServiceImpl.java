package vn.iotstar.Controller;

import vn.iotstar.models.User;

import vn.iotstar.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	UserDaoImpl a = new UserDaoImpl();
	UserDaoImpl userDao = new UserDaoImpl();
	UserDaoImpl y =new UserDaoImpl();

	@Override
	public User get(String username) {

		return a.get(username);
	}

	public User login(String username, String password) {
		User user = this.get(username);

		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	public boolean register(String email, String password, String username, String fullname, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new User(email, username, fullname, password, null, 5, phone, date));
		return true;
	}
	public boolean forgetPass(String username,String password) {		
		try {
			userDao.update(username, password);
			return true;
		}catch(Exception e) {
			return false;
		  }		
	}

	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}
}
