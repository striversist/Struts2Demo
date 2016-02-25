<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello world</title>
</head>
<body>

	<h1>Hello World From Struts2</h1>
	<form action="hello">
		<label for="name">Please enter your name</label>
		<input type="text" name="name" />
		<input type="submit" value="Say Hello" />
	</form>
	
	<br />
	<br />

    <form action="upload" method="post" enctype="multipart/form-data">
        <label for="myFile">Upload your file</label>
        <input type="file" name="myFile" />
        <input type="submit" value="Upload"/>
    </form>
</body>
</html>