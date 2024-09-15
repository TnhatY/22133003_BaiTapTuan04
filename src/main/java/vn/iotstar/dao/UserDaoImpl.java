package vn.iotstar.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import vn.iotstar.config.DBconnectionSQLServer;
import vn.iotstar.models.User;

public class UserDaoImpl implements UserDao {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public User get(String username) {
		String sql = "SELECT * FROM [User] WHERE username = ? ";
		try {
			conn = new DBconnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("Id"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setPassWord(rs.getString("password"));
				user.setAvatar(rs.getString("image"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreatedDate(rs.getDate("createdDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public boolean checkExistEmail(String email) {
		boolean duplicate = false;
		String query = "select * from [user] where email = ?";
		try {
			conn = new DBconnectionSQLServer().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	@Override
	public boolean checkExistUsername(String username) {
		boolean duplicate = false;
		String query = "select * from [User] where username = ?";
		try {
			conn = new DBconnectionSQLServer().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	public void insert(User user) {
		String sql = "INSERT INTO [User](username,password,image, fullname, email, roleid,phone, createddate) VALUES (?,?,?,?,?,?,?,?)";
		try {
			conn = new DBconnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(5, user.getEmail());
			ps.setString(1, user.getUserName());
			ps.setString(4, user.getFullName());
			ps.setString(2, user.getPassWord());
			ps.setString(3, user.getAvatar());
			ps.setInt(6, user.getRoleid());
			ps.setString(7, user.getPhone());
			ps.setDate(8, user.getCreatedDate());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			long millis = System.currentTimeMillis();
			java.sql.Date date = new java.sql.Date(millis);// Năm 2004, tháng 1, ngày 1

			// Tạo đối tượng User với LocalDate
			User user1 = new User("bao", "1", "1", "4", "mail", 2, "342", date);
			UserDaoImpl dao = new UserDaoImpl();
			dao.insert(user1);
			System.out.println(user1.getFullName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(String username, String password) {
		String sql = "UPDATE [User] SET password = ? WHERE username = ?";
		try {
			conn = new DBconnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, username);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
