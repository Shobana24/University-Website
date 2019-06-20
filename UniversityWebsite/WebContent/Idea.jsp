<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>idea</title>
</head>
<body>
<style>
body
{
background-image:url("Background4.jpg");
background-position:align-left;
background-repeat:no-repeat;
background-size:cover;
}
</style>

<div style="float:right">
<form align="right" method="post" action="Thankyou.jsp">
  <label class="logoutLblPos">
  <input name="submit" type="submit" value="Logout">
  </label>
</form>
</div>
<form method="post" action="IdeaController">
<div id="header" style="background-color:#95A5A6;width:100%">
<center><b><h2><font color="black">UNIVERSITY WEBSITE</center></b></h2>
</div>


<center><img src="suggestion1.png" style="width:100px;height:100px"></center><br>
<h1 style="text-align:center;"><font color="#E13D91">Idea Submission</font></h1>
<table align="center" cellpadding = "10">
 

<tr>
<td><font color="#077E5A"><b>Name</b></font></td>
<td><input type="text" name="Name" value="${sessionScope.user.FIRST_NAME}" readonly maxlength="50" />

</td>
</tr>
 
<tr>
<td><font color="#077E5A"><b>Email_Id</b></font></td>
<td><input type="text" name="Email" value="${sessionScope.user.EMAIL_ID}" readonly maxlength="50"/>

</td>
</tr>
 
<tr>
<td><font color="#077E5A"><b>Mobile_Number</b></font></td>
<td><input type="text"name="Mobile_Number" value="${sessionScope.user.MOBILE_NUMBER}" readonly maxlength="10"/>

</td>
</tr>
 
<tr>
<td><font color="#077E5A"><b>Idea</b></font></td>
<td><textarea rows="10" cols="30" placeholder="Provide your Ideas" name="Idea" maxlength="500" ></textarea>

</td>
</tr>
<tr>
<td><font color="#077E5A"><b>User_Id</b></font></td>
<td><input type="text" name="User_Id"value="${sessionScope.user.USER_ID}" readonly maxlength="15"/>

</td>
</tr>
<td colspan="2" align="center">
<input type="submit" value="Submit"/>
<input type="reset" value="Reset">
</td>
</tr>
</table>
</form>
</body>
</html>



 