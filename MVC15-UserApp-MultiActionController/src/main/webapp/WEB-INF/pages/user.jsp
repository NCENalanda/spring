<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align:center">Form page with multiple submit buttons</h1>
<form  action="mvc.htm"  method="POST">
    User Id :: <input type="text" name="userid"> <br>
    User name :: <input type="text" name="username"> <br>
    Address :: <input type="text" name="addrs"> <br>
    Email :: <input type="text" name="email"> <br>
    <input type="submit" value="add" name="s1">
    <input type="submit" value="update" name="s1">
    <input type="submit" value="delete" name="s1">
    <input type="submit" value="view" name="s1">
    <input type="submit" value="test" name="s2">
</form>
<br>
<c:if test="${operation ne null }">
${operation}  is work successful.
</c:if>

