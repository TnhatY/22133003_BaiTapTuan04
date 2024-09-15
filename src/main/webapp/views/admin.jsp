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
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	background-color: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	text-align: center;
	width: 300px;
}

h1 {
	color: #333;
}

.logout-btn {
	background-color: #ff4b5c;
	color: white;
	border: none;
	padding: 10px 20px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
}

.logout-btn:hover {
	background-color: #ff2f3f;
}
</style>
</head>
<body>

	<div class="container">
		<h1>Chào mừng đến Trang Admin</h1>
		<form action="/WebJDBC/logout" method="GET">
			<button type="submit" class="logout-btn">Đăng xuất</button>
		</form>
	</div>


</body>
</html>