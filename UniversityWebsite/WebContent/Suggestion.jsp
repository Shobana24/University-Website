<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cognizant.UniversityWebsite.model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>suggestion</title>
</head>
<body>
<style>
body
{
background-image:url("Background2.jpg");
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

<form method="post" action="SuggestionController">
<div id="header" style="background-color:#95A5A6;width:100%">
<center><b><h2><font color="#46077E">UNIVERSITY WEBSITE</center></b></h2>
</div>


<center><img src="suggestion.png" style="width:100px;height:100px"></center><br>
<h1 style="text-align:center;">Give Suggestion</h1>
<table align="center" cellpadding = "10">
 

<tr>
<td><font color="#0B2885"><b>Name</b></font></td>
<td><input type="text" name="Name" value="${sessionScope.user.FIRST_NAME}"readonly maxlength="50" />

</td>
</tr>
 
<tr>
<td><font color="#0B2885"><b>Email_Id</b></font></td>
<td><input type="text"name="Email" value="${sessionScope.user.EMAIL_ID}" readonly maxlength="50"/>

</td>
</tr>
 

<tr>
<td><font color="#0B2885"><b>Suggestion</b></font></td>
<td><textarea rows="10" cols="30"  placeholder="Provide your suggestion" name="Suggestion" maxlength="500" ></textarea>

</td>
</tr>
<tr>
<td><font color="#0B2885"><b>User_Id</b></font></td>
<td><input type="text" placeholder="Enter the User_Id" name="User_Id" value="${sessionScope.user.USER_ID}" readonly maxlength="15"/>

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



 