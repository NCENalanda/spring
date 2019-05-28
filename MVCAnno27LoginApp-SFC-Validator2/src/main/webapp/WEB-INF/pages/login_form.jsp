<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 stye="color:red;tex-align:center">Login Form page</h1>

<form:form method="POST"  modelAttribute="userCmd">
  <form:errors  path="*"/>
   Login username :: <form:input path="uname"/><form:errors path="uname"/> <br>
   Login Password :: <form:password path="pwd"/><form:errors path="pwd"/> <br>
   Select Domain(s):: <form:select path="domain">
                                          <form:options items="${domains}"/>
                                      </form:select> <br>
  Select Courses(s):: <form:checkboxes items="${courses}" path="courses"/> <br>
   Date of Birth :: <form:input path="dob"/> (dd-MM-yyyy)<br>                                      
   
  <input type="submit"  value="login"/>
   <input type="hidden" value="${sToken}"  name="cToken"/>
</form:form>
<br><br>
${result}  <br><br>
Command data :: ${cmdData}


