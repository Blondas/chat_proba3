<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body><center>
	<form action="login.do" method="post">
		<br>Username: <input type="text" name="userName"/>
		<br>Password:  <input type="password" name="password" />
		<br><input type="submit" value="submit"/>
	</form>
	<br>
	<a href="/Login/">Back</a>
	</center>
</body>
</html>