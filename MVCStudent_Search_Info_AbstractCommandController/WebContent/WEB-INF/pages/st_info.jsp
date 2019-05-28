<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>All Student Info</h1><br>
<a href="home.htm">Go Back</a><br><br>
<c:choose>
    <c:when test="${!empty list}">
    <table border="1" bgcolor="cyan">
    <tr><th>ID</th><th>Name</th><th>Rank</th> </tr>
    <c:forEach var="dto" items="${list}">
    <tr>
        <td>${dto.id}</td>
        <td>${dto.name}</td>
        <td>${dto.rank}</td>
    </tr>
    </c:forEach>
    </table>
</c:when>
<c:otherwise>
<h1>No Records Found</h1>
</c:otherwise>
</c:choose>
