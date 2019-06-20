<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<script>
 function validate(form)
 {
 if(form.username.value==""||form.password.value=="")
 
 alert("Please update the highlighted mandatory field(s).");
 }
 </script>
</head>
<body>
<style>
body
{
background-image:url("scholar1.jpg");
background-position:align-left;
background-repeat:no-repeat;
background-size:cover;
}
</style>

<h1 style="text-align:center;"><font color="white">University Website</font></h1>
<div id="content" style="background-color:#D2E0E8;height:200px;width:400px;margin:0 auto;text-align:center;">
<h1 style="text-align:center;">Login </h1>
<form method="post" action="LoginController">
UserID    :<input type ="text" placeholder="Enter the UserID" name="username" required> <br><br>
Password :<input type="password" placeholder="Enter the Password" name="password" required><br><br>
<input type="submit" value="Login" onclick="validate(this.form)"/>
</form>
</body>
</html>