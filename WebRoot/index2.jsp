<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>请登录</title>

		<link type="text/css" rel="stylesheet" href="css/login.css">
	</head>

	<body>

		<form id="login" action=<%=path%>/user/user_login method="post">
			<h1>
				mod OA
			</h1>
			<fieldset id="inputs">
				<input id="user_login" type="text" placeholder="Username"
					name="userBean.userLogin" autofocus="" required="">
				<input id="userpassword" type="password" placeholder="Password"
					name="userBean.userPass" required="">
			</fieldset>
			<fieldset id="actions">
				<input type="submit" id="submit" value="Log in">
				<a href="">Forgot your password?</a>
			</fieldset>
		</form>
	</body>
</html>