<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<div align="center">
		<h1>Student Login</h1>

		<form:form method="POST" action="/student/login"
			modelAttribute="login">
			<form:label path="username">Username</form:label>
			<form:input path="username" />
			<br />
			<form:label path="password">Password</form:label>
			<form:input path="password" />
			<br />
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>
