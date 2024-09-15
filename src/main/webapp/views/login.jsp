<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f9f9f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.login-container {
	width: 350px;
	background-color: white;
	padding: 20px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

.input-group {
	display: flex;
	align-items: center;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	padding: 10px;
}

.input-group i {
	margin-right: 10px;
}

.input-group input {
	border: none;
	outline: none;
	flex: 1;
}

.remember-group {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 20px;
}

.remember-group input {
	margin-right: 5px;
}

.btn {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
}

.btn:hover {
	background-color: #0056b3;
}

.links {
	text-align: center;
	margin-top: 15px;
}

.links a {
	text-decoration: none;
	color: #007bff;
}

.links a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<form action="/WebJDBC/login" method="POST">
	<div class="login-container">
		<h2>Đăng Nhập Vào Hệ Thống</h2>

		<div class="input-group">
			<i class="fa fa-user"></i> <input type="text"
				placeholder="Tên đăng nhập" name="username" id="username">
		</div>

		<div class="input-group">
			<i class="fa fa-lock"></i> <input type="password"
				placeholder="Mật khẩu" name="password" id="password">
		</div>

		<div class="remember-group">
			<label><input type="checkbox" name="remember" id="remember"> Nhớ tôi</label>
			<a href="/WebJDBC/checkuser">Quên mật khẩu?</a>
		</div>

		<button class="btn">Đăng nhập</button>

		<div class="links">
			<p>
				Nếu bạn chưa có tài khoản trên hệ thống, thì hãy <a href="/WebJDBC/register">Đăng
					ký</a>
			</p>
		</div>
	</div>
	</form>
</body>
</html>