<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<script>
 function validate(form)
 {
 if(form.First_Name.value==""||form.Last_Name.value==""||form.Age.value==""||form.Email_Id.value==""||form.Mobile_Number.value==""||form.User_ID.value==""||form.Password.value=="")
 
 alert("Please update the highlighted mandatory field(s).");
 }
 </script>
</head>
 
<body>
<center><b><h2><font color="#0B681F">University Website</center></b></h2>
<center><b><h3><font color="#4C1795">REGISTRATION</center></b></h3>
<style>
body
{
background-image:url("scholar.jpg");
background-repeat:no-repeat;
background-size: 90% 98% ;
background-position:align-left;

}
</style>
 <form method="post" action ="RegisterController">
<table align="center" cellpadding = "10">
 

<tr>
<td><font color="black"><b>FIRST NAME</b></font></td>
<td><input type="text" placeholder="Enter the First Name" name="First_Name" maxlength="50" required/>

</td>
</tr>
 
<tr>
<td><font color="black"><b>LAST NAME</b></font></td>
<td><input type="text" placeholder="Enter the Last Name" name="Last_Name" maxlength="50" required/>

</td>
</tr>
 

<tr>
<td><font color="black"><b>AGE</b></font></td>
<td><input type="text" placeholder="Enter the Age" name="Age" maxlength="3" required/>

</td>
</tr>
 

<tr>
<td><font color="black"><b>EMAIL ID</b></font></td>
<td><input type="email" placeholder="Enter the Email" name="Email_Id" maxlength="45" required/></td>
</tr>
 

<tr>
<td><font color="black"><b>MOBILE NUMBER</b></font></td>
<td>
<input type="text" placeholder="Enter the MobileNumber" name="Mobile_Number" maxlength="10" required />

</td>
</tr>
 
<tr>
<td><font color="black"><b>GENDER</b></font></td>
<td>
Male <input type="radio" name="Gender" value="Male" />
Female <input type="radio" name="Gender" value="Female" />
</td>
</tr>

<tr>
<td><font color="black"><b>USER ID</b></font></td>
<td>
<input type="text" placeholder="Enter the User ID" name="User_ID" maxlength="15" required/>

</td>
</tr>


<tr>
<td><font color="black"><b>PASSWORD</b></font></td>
<td>
<input type="password" placeholder="Enter the Password" name="Password" maxlength="15" required/>

</td>
</tr>
 

<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit" onclick="validate(this.form)"/>
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>
 
</body>
</html>