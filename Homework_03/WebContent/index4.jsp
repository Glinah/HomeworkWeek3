<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Date date = new Date(); %>
	<fmt:formatDate value="<%=date%>"/>
	<c:set var="Amount" value="99.14115" /> 
	<br/><br/>
	<fmt:formatNumber value="${Amount}" maxFractionDigits="3"/><br/>
	<fmt:formatNumber value="${Amount}" maxFractionDigits="5"/><br>
	<fmt:formatNumber value="${Amount}" type="percent" maxFractionDigits="3" /><br>
	<fmt:formatNumber value="${Amount}" type="currency" maxFractionDigits="3" /><br>
</body>
</html>