<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <c:choose>
     <c:when test="${!empty empResults }">
          <h1 style="color:red;text-align:center">Employee Search Results </h1>
          <table border="1">
              <tr><th>EmpNo</th><th>EmpName</th><th>Job</th><th>Salary</th><th>DeptNo</th><th>Mgr</th> </tr>
              <c:forEach  var="rdto"  items="${empResults}">
                 <tr>
                    <td>${rdto.empNo } </td>
                    <td>${rdto.empName } </td>
                    <td>${rdto.job } </td>
                    <td>${rdto.salary } </td>
                    <td>${rdto.deptNo } </td>
                    <td>${rdto.mgr } </td>
                   </tr>
              </c:forEach>
          </table>
     </c:when>
     <c:otherwise>
         <h1 style="color:red;text-align:center">Records not found </h1>
     </c:otherwise>
  </c:choose>
  <br>
   <a href="home.htm">home</a>




