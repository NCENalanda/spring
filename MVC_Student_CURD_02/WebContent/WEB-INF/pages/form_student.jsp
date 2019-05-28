 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<h1>Add Student Details</h1><br><br>
<a href="student.htm">back</a><br><br>

 
<fieldset>
<legend>Register
<frm:form method="POST" commandName="stCmd" onsubmit="return validationform()">
<p style="color: red;">
<frm:errors path="*" />
</p>
<label>Name.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="name"/>&emsp;&emsp;&emsp;&emsp;<frm:errors path="name"/><br><br>
<label>Rank.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="rank"/>&emsp;&emsp;&emsp;&emsp;<frm:errors path="rank"/><br><br>
<label>ID.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="id"/><br><br>
<label>Country.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:select path="country" >
<frm:options items="${lcountry }"/>
</frm:select><br><br><br>
<label>State.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:select path="state">
<frm:options items="${lstate }"/>
</frm:select><br><br><br>
<label>District.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:select path="district">
<frm:options items="${ldistrict }"/>
</frm:select><br><br><br>
<frm:select path="course">
<frm:options>
<frm:checkboxes items="${lcourse }" path=""/><br><br><br>
</frm:options>
</frm:select>
<input type="submit" value="save">
</frm:form>
</legend>
</fieldset>

