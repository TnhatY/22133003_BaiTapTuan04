<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${sessionScope.account == null}">
			<div class="col-sm-6">
				<ul class="list-inline right-topbar pull-right">
					<li><a href="/WebJDBC/login">Đăng nhập</a>
				| <a href="/WebJDBC/register">Đăng ký </a></li>
				<li><i class="search fa fa-search search-button"></i></li>
				</ul>
			</div>
		</c:when>
		<c:otherwise>
			<div class="col-sm-6">
				<ul class="list-inline right-topbar pull-right">
					<li><a
						href="$/member/myaccount">${sessionScope.account.fullName}</a>
			
			</ul>
			</div>
		</c:otherwise>
	</c:choose>
	nhập</ a > ký</ a ></ Xuất</ a LT LT ></ li VB VB li > >
</body>
</html>