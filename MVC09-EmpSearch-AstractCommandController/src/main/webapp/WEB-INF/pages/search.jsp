<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">Search Employee Details by giving 1 or 2 or 3 or all details</h1>
<form action="search.htm" method="POST">
  employee number :: <input type="text" name="empNo"><br>
  employee name :: <input type="text" name="empName"><br>
  employee job :: <input type="text" name="job"><br>
  employee salary :: <input type="text" name="salary"><br>
  <input type="submit"  value="Search">
</form>