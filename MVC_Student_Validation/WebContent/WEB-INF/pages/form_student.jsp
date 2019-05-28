 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<html>
<head>
<script type="text/javascript" src="scripts/angular.js"></script>
<script type="text/javascript" src="validationform.js"></script>
<script type="text/javascript">
var app=agular.module('app2',[]);
app.controller('ctrl_1',function($scope){
$scope.var_1="Welcome to Angular";
})
</script>
</head>
<body ng-app="app2" ng-controller="ctrl_1">
{{var_1}}
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
<input type="submit" value="save">
</frm:form>
</legend>
</fieldset>
</body>
</html>