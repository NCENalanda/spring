<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

  <form:form method="POST"  commandName="regCmd">
     name :: <form:input  path="name"/><br> 
     address :: <form:input  path="addrs"/><br>
     age :: <form:input  path="age"/><br>
     <input type="submit"  value="next" name="_target1">
     <input type="submit"  value="cancel" name="_cancel">
  </form:form>