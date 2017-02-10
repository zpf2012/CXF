<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="jquery-3.1.0.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function getdata(){
		var name = document.getElementById("name").value;
		$.post(
			"HttpURLConnectionServlet",
			"name="+name,
			function(msg){
				alert(msg);
			},
			"text"
		);
	}
</script>
<body>
<input id="name" name="name"/>
<button onclick="getdata()">HttpURLConnection请求WebService</button>
</body>
</html>