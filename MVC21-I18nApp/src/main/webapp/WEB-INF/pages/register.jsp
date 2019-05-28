<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %>
<h1 style="color:red;text-align:center"><spring:message code="app.title"/>  </h1>

 <form action="register.htm"  method="POST">
   <spring:message code="app.name"/> <input type="text" name="name"><br>
   <spring:message code="app.age"/> <input type="text" name="age"><br>
   <spring:message code="app.addrs"/> <input type="text" name="addrs"><br>
   <input type="submit"  value="<spring:message code= "app.submit.cap"/>"/>
 </form>    
<br><br>
 <a href="?lang=en_US">english</a> &nbsp;&nbsp;&nbsp;
 <a href="?lang=hi_IN">hindhi</a> &nbsp;&nbsp;&nbsp;
 <a href="?lang=fr_FR">french</a> &nbsp;&nbsp;&nbsp;
 <a href="?lang=ar_UAE">arabic</a> &nbsp;&nbsp;&nbsp;
 
 