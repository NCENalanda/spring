<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="app1">
<div  ng-controller="c_1">
{{v_1}}
</div>
<script type="text/javascript"   src="scripts/angular.js"></script>
<script type="text/javascript">
var app=angular.module("app1",[]);
app.controller("c_1", function($scope){
	$scope.v_1="hi";
});
app.controller("c_2", function($scope){
	$scope.v_2="hi";
});
</script>
<h1 style="color: green;" align="center">Student Management</h1><br><br>
<a  href="home.htm">Home</a> &emsp;&emsp;&emsp;&emsp;
<a href="stud_insert.htm">Add Student </a>&emsp;&emsp;&emsp;&emsp;
<a href="all_records.htm">List of Student </a>
<div ng-controller="c_1">
<ng-button="clickMe()">Click
</div>
</html>