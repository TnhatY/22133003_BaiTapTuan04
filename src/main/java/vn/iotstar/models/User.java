package vn.iotstar.models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
@SuppressWarnings("serial")
public class User implements Serializable{
	 private int id;
	 private String email;
	 private String userName;
	 private String fullName;
	 private String passWord;
	 private String avatar;
	 private int roleid;
	 private String phone;
	 private Date createdDate;
	 
	 
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email2, String username2, String fullname2, String password2,String image, int i,
			String phone2, Date birthDate) {
		email=email2;
		userName=username2;
		fullName=fullname2;
		passWord=password2;
		avatar=image;
		roleid=i;
		phone=phone2;
		createdDate=birthDate;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	 

}
