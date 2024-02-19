<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>Hello ${requestScope.admin}</p>
	
	<form method="POST" action="${paegContext.request.contextPath}/teacher">
		<label for="lastname">Last name</label>
		<Input type="text" id="lastname" name="lastname">
		<Input type="submit" value="Search">
	</form>

</body>
</html>