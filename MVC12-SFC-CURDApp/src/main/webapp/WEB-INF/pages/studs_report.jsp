<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center"> HPL Students Report </h1>
<c:choose>
    <c:when test="${!empty  studDetails}">
       <table border="1"  bgcolor="cyan">
         <tr> <th>SNO</th><th>SNAME</th><th>SADD</th><th>COURSE</th><th>operations </th></tr>
          <c:forEach var="dto"  items="${studDetails}">
              <tr>
                 <td>${dto.sno}</td>
                 <td>${dto.sname}</td>
                 <td>${dto.sadd}</td>
                 <td>${dto.course}</td>
                 <td>
                     <a href="edit_stud.htm?sid=${dto.sno}">edit</a> &nbsp;&nbsp;&nbsp;
                     <a href="delete_stud.htm?sid=${dto.sno}">delete</a>
                 </td>
              </tr>
          </c:forEach>
       </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align:center"> No Records found </h1>
    </c:otherwise>
</c:choose>
<br><br><br>
<c:if test="${!empty result }">
  <h3 style="color:red"> Result status ::: ${result}  </h3>
</c:if>
<br><br><br><br>
 <a href="home.htm">home</a>
