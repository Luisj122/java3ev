<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<%
for(int i=0;i<10;i++) {
	out.println("<tr>");
	out.println("<td>"+i+"</td>");
	out.println("</tr>");
}
%>
</table>
</body>
</html>