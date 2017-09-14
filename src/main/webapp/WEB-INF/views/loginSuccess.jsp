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
			<th>Name</th>
			<th>Age</th>
			<th>RollNo</th>
		</tr>
		<tr>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td>${student.rollNo}</td>
		</tr>
	</table>
</body>
</html>
