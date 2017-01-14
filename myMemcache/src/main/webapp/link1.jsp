<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>链接一</title>
</head>
<body>
	<h1>服务器三 -------------</h1>
	<a href="/myMemcache/link2.jsp">点我去链接二!</a>
	<%=session.getAttribute("username") %>
</body>
</html>