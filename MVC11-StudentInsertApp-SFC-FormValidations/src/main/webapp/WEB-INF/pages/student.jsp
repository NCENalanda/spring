<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

 <h1 style="color:red;text-align:center">Student Registration page </h1>

 <form:form method="POST"  commandName="stCmd">
      <%--  <p style="color:red">
          <form:errors path="*"/>
       </p> --%>
     Student name :: <form:input path="sname"/><form:errors  style="color:red;" path="sname"/> <br>
    Student Addrs :: <form:input path="sadd"/><form:errors style="color:red;" path="sadd"/>  <br>
    Student Course :: <form:input path="course"/><form:errors style="color:red;" path="course"/>  <br>
    Student age :: <form:input path="age"/><form:errors style="color:red;" path="age"/>  <br>
     <input type="submit"  value="register"/>
 </form:form>






