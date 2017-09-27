<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Student Info</title>
</head>
<body>
	<h1>Student Info</h1>

	<table border="1">
		<tr>
			<th>Student ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>email</th>
			<th>Phone Number</th>
			<th>Class Enrolled</th>
		</tr>
		<c:forEach items="${student}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.email}</td>
				<td>${student.phoneNo}</td>
				<td>${student.class_id}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
