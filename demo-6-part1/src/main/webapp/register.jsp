<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function up() {
var req=new XMLHttpRequest();
var name=document.getElementById("name").value;
var mobile=document.getElementById("mobile").value;
var address=document.getElementById("address").value;

var url="http://localhost:8092/google";
req.open('POST',url,true);
var g={name:name,mobile:mobile,address:address};
var st=JSON.stringify(g);
req.setRequestHeader("Content-Type","application/json");
req.send(st);
document.re.action="reg";
document.re.submit();
}

</script>
</head>
<body>
<form name="re">
<h2>Registration page</h2>

name<input type="text" id="name"><br>
mobile<input type="text" id="mobile"><br>
address<input type="text" id="address"><br>

<input type="button" value="registration" onclick="up()">


</form>


</body>
</html>