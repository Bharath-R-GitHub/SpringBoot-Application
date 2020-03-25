<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.error {
	color: red;
}

h1 {
	font-family: cursive;
	font-weight: bold;
	color: green;
	text-align: center;
}
</style>
</head>
<body>
	<h1>STUDENTS REGISTRATION FORM</h1>
	<br>
	<form:form action="processForm" modelAttribute="student" method="POST">
		<center>
			<table>
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName" />
					<td><form:errors path="firstName" cssClass="error"></form:errors>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName" />
					<td><form:errors path="lastName" cssClass="error"></form:errors>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:select path="country">
							<form:options items="${student.countryOption}" />
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
					<td><input type="reset" value="Cancel" /></td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>