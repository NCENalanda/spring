<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>Register
<legend>

<form action="fregister.htm" method="post">
<label>Id. </label>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<input type="text" name="id"><br><br>
<label>Name.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<input type="text" name="name"><br><br>
<label>Address.</label>&emsp;&emsp;&emsp;&emsp;
<input type="text" name="addrs"><br><br>
<label>Joining Date.</label>&emsp;&emsp;&emsp;
<input type="text" name="doj"><br><br>
<input type="submit" value="insert" name="opt">&emsp;&emsp;
<input type="submit" value="update" name="opt">&emsp;&emsp;
<input type="submit" value="delete" name="opt">&emsp;&emsp;
<input type="submit" value="find" name="opt">

</form>
</legend>
</fieldset>
<div>
<br><br>
<c:if test="${!empty str }">
Register status is  ${str }
</c:if>
<c:if test="${!empty faCmd }">
  ${faCmd }
</c:if>
</div>
</body>
</html>