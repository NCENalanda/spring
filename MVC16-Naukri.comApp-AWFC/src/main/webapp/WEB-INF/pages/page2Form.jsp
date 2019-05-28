<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

  <form:form method="POST"  commandName="regCmd">
     Qualification :: <form:input  path="qlfy"/><br> 
     skill :: <form:input  path="skill"/><br>
     <input type="submit"  value="previous" name="_target0">
     <input type="submit"  value="next" name="_target2">
     <input type="submit"  value="cancel" name="_cancel">
  </form:form>