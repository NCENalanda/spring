<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align: center">Student Registration form</h1>

<form:form  method="POST" commandName="regCmd">
<p style="color:red">
  <form:errors path="*"/> <br>
  </p>
   Student Number :: <form:input path="sno"/> <br>
   Student Name :: <form:input path="sname"/> <br>
   Qualification:: <form:select path="qlfy" >
                                  <form:options items="${qList}"/>
                               </form:select>  <br>
   Courses:: <form:select path="course"  multiple="yes">
                                  <form:options items="${cList}"/>
                       </form:select>  <br>
  Hobies ::  <form:checkboxes items="${hList}" path="hobies"/> <br>
  <input type="submit"   value="register"> <br>
  </form:form>
   <c:if   test="${ regCmd.sno!=0 }">
  Command data ::  ${regCmd }
  </c:if>
 