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
            margin: 0;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .input-group {
            margin-bottom: 20px;
            display: flex;
            flex-direction: column;
        }
        .input-group label {
            margin-bottom: 5px;
        }
        .input-group input {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .btn {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover {
            background-color: #218838;
        }
        .error-message {
            color: red;
            font-size: 14px;
            display: none;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Đặt Lại Mật Khẩu</h2>
    <form id="resetForm" action="forgetPass" method="POST">
        <div class="input-group">
            <label for="new-password">Mật khẩu mới:</label>
            <input type="password" id="new-password" name="password" placeholder="Mật khẩu mới" required>
        </div>
        <div class="input-group">
            <label for="confirm-password">Xác nhận mật khẩu:</label>
            <input type="password" id="confirm-password" name="password" placeholder="Xác nhận mật khẩu" required>
        </div>
        <div class="error-message" id="error-message">
            Mật khẩu không khớp. Vui lòng thử lại.
        </div>
        <button type="submit" class="btn">Đặt Lại Mật Khẩu</button>
    </form>
</div>

</body>
</html>