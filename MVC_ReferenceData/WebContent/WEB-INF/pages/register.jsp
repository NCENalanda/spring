<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div>
<fieldset>
<legend>Register
<frm:form commandName="stCmd" method="POST">
<label>Name.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="name"/><br><br>
<label>Rank.</label>&emsp;&emsp;&emsp;&emsp;
<frm:input path="rank"/><br><br>
<label>Id.</label>&emsp;&emsp;&emsp;&emsp;&emsp;
<frm:input path="id"/><br><br>
<input type="submit" value="Register">
</frm:form>
</legend>
</fieldset>
</div>
