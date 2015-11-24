<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head><title>Add Users</title></head>
<body>
<h1>Add Users</h1>
<h2><a href="/springMVC_Demo/index.jsp">Welecme</a></h2>
<a href="/springMVC_Demo/user.html">show ALL Users</a>

<br />
<br />
<c:url var="saveUser" value="/user/save.html" />
<form:form modelAttribute="user" method="POST" action="${saveUser}">
	
	<form:label path="username">用户名：</form:label>
	<form:input path="username"></form:input>
	<br />
	<form:label path="password">密码：</form:label>
	<form:password path="password"></form:password>
	<br />
	<form:radiobutton checked="checked"  path="sex" value="男"/>男
	<form:radiobutton  path="sex" value="女"/>女
	<br />
	<form:label path="birthday">生日：</form:label>
	<form:input path="birthday"></form:input>
	<br />
	<form:label path="age">年龄：</form:label>
	<form:input path="age" />
	<br />
	
	<input type="submit" value="Save用户" />
	
</form:form>

</body>
</html>