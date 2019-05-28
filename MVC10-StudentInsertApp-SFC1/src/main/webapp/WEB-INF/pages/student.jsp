<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

 <h1 style="color:red;text-align:center">Student Registration page </h1>

 <form:form method="POST"  commandName="stCmd" >
    Student name :: <form:input path="sname"/> <br>
    Student Addrs :: <form:input path="sadd"/> <br>
    Student Course :: <form:input path="course"/> <br>
     <input type="submit"  value="register"/>
 </form:form>






