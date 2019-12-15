<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function up() {
	var req=new XMLHttpRequest();
	var name=document.getElementById("t1").value;
	var mobile=document.getElementById("t2").value;

	var url="http://localhost:8092/google/"+name+"/"+mobile;
	//alert(url);
	req.open('GET',url,true);
	//var g={name:name,mobile:mobile,address:address};
	//var st=JSON.stringify(g);
	
	req.setRequestHeader("Content-Type","application/json");
	req.send();
	alert("send");
	req.onreadystatechange=function(){
		if(req.readyState==4 && req.status==200){
			alert(req.responseText);
			var ss=JSON.parse(req.responseText);
			document.getElementById("d").innerHTML=ss.name+"  "+ss.mobile;
		}
	}
	
/* 	document.re.action="log";
	document.re.submit(); */
	}


</script>
</head>
<body>
<h2>index page</h2>
<form name="re">

name<input type="text" id="t1"><br>
mobile<input type="text" id="t2"><br>
<input type="button" value="login" onclick="up()" >
</form>
<a href="register.jsp">newRegistration</a>
<div id="d"></div>
</body>
</html>