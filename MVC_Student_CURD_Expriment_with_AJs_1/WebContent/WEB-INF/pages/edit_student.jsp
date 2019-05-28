<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<a href="home.htm">Home</a><br><br>
<a href="all_records.htm">back</a>
<div align="center">
<frm:form commandName="stCmd" method="post">
<label>ID.</label>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="id"  disabled="true"/>&emsp;&emsp;<br><br>
<label>Name.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="name"/>&emsp;&emsp;&emsp;<frm:errors path="name"/><br><br>
<label>Rank.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="rank"/>&emsp;&emsp;&emsp;<frm:errors path="rank"/><br><br>
<input type="submit" >
</frm:form>
</div>

</body>
</html>