<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style="color:red;text-align:center">Result page </h1>
<c:choose>
   <c:when test="${!empty listEmps}">
     <table border="1">
        <tr> <th>empno</th><th>Emp name</th><th>Emp Salary</th><th>Emp JOB</th></tr>
        <c:forEach var="map" items="${listEmps}">
           <tr>
             <td>${map.empno}</td>
             <td>${map.ename}</td>
             <td>${map.sal}</td>
             <td>${map.job}</td>
           </tr>
        </c:forEach>
     </table>
   </c:when>
   <c:otherwise>
         <h1 style="color:red;text-align:center">Records not found </h1>
   </c:otherwise>
</c:choose>


