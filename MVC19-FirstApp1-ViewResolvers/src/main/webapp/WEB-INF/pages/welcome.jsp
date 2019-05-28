<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center ">Welcome to spring MVC(namaste.jsp)</h1>
<br><br>
 <c:if test="${sysDate ne null }">
   System date ::<c:out value="${sysDate }"/>
</c:if>


  
  <fmt:message var="fmsg"  key="wish.msg"/>
  <br>
   Formmated messages :: ${fmsg }
   <br>
    <a href="date.htm">Get Sys date</a>

