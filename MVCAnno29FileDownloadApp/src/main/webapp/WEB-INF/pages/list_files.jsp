<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
   <h1> Click on downlod hyperlink to download the files..</h1>
<c:choose>
   <c:when test="${!empty filesList }">
      <table border="1">
       <c:forEach  var="file"  items="${filesList}">
           <tr>
             <td>${file} </td>
             <td><a href="download.htm?fname=${file}">download</a></td>
           </tr>
       </c:forEach>
       </table>
   </c:when>
   <c:otherwise>
        <h1>No files found</h1>
   </c:otherwise>
</c:choose>
