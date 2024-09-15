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
        }
        .container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #555;
        }
        input[type="text"], input[type="password"], input[type="email"], input[type="tel"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .btn {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #0056b3;
        }
        .footer-text {
            text-align: center;
            margin-top: 10px;
        }
        .footer-text a {
            text-decoration: none;
            color: #007bff;
        }
        .footer-text a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
	<div class="container">
        <h2>Tạo tài khoản mới</h2>
        <form action="/WebJDBC/register" method="POST">
            <input type="text" name="username" placeholder="Tên đăng nhập  " required>
            <input type="text" name="fullname" placeholder="Họ tên" required>
            <input type="email" name="email" placeholder="Nhập Email" required>
            <input type="tel" name="phone" placeholder="Số điện thoại" required>
            <input type="password" name="password" placeholder="Mật khẩu" required>
            <input type="password"  name="password"placeholder="Nhập lại mật khẩu" required>
            <button type="submit" name="submit" class="btn">Tạo tài khoản</button>
        </form>
        <div class="footer-text">
            Nếu bạn đã có tài khoản? <a href="/WebJDBC/login">Đăng nhập</a>
        </div>
    </div>
</body>
</html>