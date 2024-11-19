<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First JSP File</title>
</head>
<body>
	
<h3>Add Data In the Table</h3>
<form action = "addmodel">
       IdNo : <input type = "text" name = "aid">
       <br />
       Name : <input type = "text" name = "aname" />
	   <br />
	   Tech : <input type = "text" name = "tech" />
	   <br />
       <input type = "submit" />
	   <br />
    </form>
	
<h3>GET Data using AID</h3>
<form action = "getmodel">
		IdNo : <input type = "text" name = "aid">
		<br />
		<input type = "submit" />
		<br />
	</form>
	
<h3>Delete Data using AID</h3>
	<form action = "deletemodel">
		IdNo : <input type = "text" name = "aid">
		<br />
		<input type = "submit" />
		<br />
</form>

</body>
</html>