<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try {
			String author = request.getParameter("author");
			if (author.equals("")) {
				out.println("Nie wybrano autora.");
			} else {
	%><p>
		Wybrany autor to:
		<%=author%></p>
	<%
		}
		} catch (NullPointerException e) {
			out.println("Nie wybrano autora.");
		}
	%>
</body>
</html>