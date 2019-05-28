 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<html>
<h1>Add Student Details</h1><br><br>
<a href="student.htm">back</a><br><br>
<fieldset>
<legend>
<frm:form method="POST" commandName="stCommd">
<label>Name.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="name"/><br><br>
<label>Rank.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="rank"/><br><br>
<label>ID.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="id"/><br><br>
<input type="submit" value="save">
</frm:form>
</legend>
</fieldset>
</html>