<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Here</h2>
${error1}
<form  action="verifyLogin" method="post">
EmailId<input type="text" name="emailid">
password<input type="password" name="password">
<input type="submit" name="login">

</form>
</body>
</html>