<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 stye="color:red;tex-align:center">Login Form page</h1>

<form:form method="POST"  modelAttribute="userCmd">
   Login username :: <form:input path="uname"/> <br>
   Login Password :: <form:password path="pwd"/> <br>
  <input type="submit"  value="login"/>
</form:form>
<br><br>
${result}


