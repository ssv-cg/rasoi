<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div align="center" style="background-image: url('assets/food.jpg'); min-height:100vh; font-size:1.5em; color:white">
		<h1>Login</h1>
		<div class=" p-4 mt-5" style="width:50%">
		<s:form action="loginAction" class="loginForm">
			<s:textfield name="userName" label="User Name" class="formTextField" />
			<s:password name="password" label="Password" class="formTextField" />
		<div align="center"> 	<s:submit value="Login" class="actionBtn" /></div>
		</s:form>
	</div></div>

</body>
</html>