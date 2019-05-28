<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun" %>


<h1>Hello</h1>
<a  href="home.htm">Home</a> &emsp;&emsp;&emsp;&emsp;<br><br>
<div >
<c:if test="${!empty message}">
<h3 style="color: green;">Result Status :: ${message}</h3>
</c:if>
</div><br>
<div>
<a href="stud_insert.htm">Register Student</a>
</div>
<c:choose>
    <c:when test="${!empty list}">
    <table align="center" border="1" bgcolor="cyan" bordercolor="red" background="yellow" cellpadding="2px" cellspacing="3px" width="75%" 
    style=" border: 3px solid red;border-collapse: collapse;">
    <tr><th><center>ID</center></th><th><center>Name</center></th><th><center>Rank</center></th><th><center>Edit</center></th><th><center>Delete</center></th> </tr>
    <c:forEach var="dto" items="${list}">
    <tr>
        <td><center style="   background: linear-gradient(to right, rgba(255,0,0,0), rgba(255,0,0,1));color:orange;font-size: 25px; border-style: inset;">${dto.id}</center></td>
        <td><center style="background-color: rgba(255, 0, 0, 0.3);text-shadow: 2px 2px 5px red; position: relative;
    box-shadow: 1px 2px 4px rgba(0, 0, 0, .5); padding: 10px;  background: white;">${dto.name}</center></td>
        <td><center style="background-color:Tomato; color: yellow; font-size: 40px; border-style: outset;color: yellow; " >${dto.rank}</center></td>
        <td><a href="edit.htm?id=${dto.id}">Edit</a></td>
        <td><a href="delete.htm?id=${dto.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
</c:when>
<c:otherwise>
<h1>No Records Found</h1>
</c:otherwise>
</c:choose>

