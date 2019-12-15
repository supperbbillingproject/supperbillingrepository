<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function updatedata() {
	document.ss.action="tab";
	document.ss.submit();
}
function del() {
	document.ss.action="del";
	document.ss.submit();
}
</script>
</head>
<body>
<h1>Success page</h1>
<form name="ss" >

<table border="2">
<tr>
<td>select</td>
<td>id</td>
<td>name</td>
<td>password</td>
</tr>
<%-- <%List<Student> list=(List<Student>)request.getAttribute("data"); 
for (Student s : list){
%>	
<tr>
<td><input type="radio" value="<%=s.getId() %>" name="id"></td>
<td><%=s.getId() %></td>
<td><%=s.getName() %></td>

<td><%=s.getPassword() %></td>
</tr>
<% }%>
 --%>
</table>
<input type="button" value="update" onclick="updatedata()">
<input type="button" value="delet" onclick="del()">

</form>
</body>
</html>