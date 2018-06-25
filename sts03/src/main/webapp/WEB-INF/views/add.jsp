<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="template/header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@ include file="template/menu.jsp" %>


<div class="page-header">
	<h1>입력 페이지</h1>
</div>

	<form action="./" method="post">
		<div class="form-group">
			<label for="sabun">sabun</label>
			<input type="text" class="form-control" name="sabun" id="sabun" placeholder="필수"/>
		</div>
		<div class="form-group">
			<label for="name">name</label>
			<input type="text" class="form-control" name="name" id="name" placeholder="이름없음"/>
		</div>
		<div class="form-group">
			<label for="pay">pay</label>
			<input type="text" class="form-control" name="pay" id="pay" placeholder="0"/>
		</div>
		<button type="submit" class="btn btn-success">입력</button>
		<button type="reset" class="btn btn-default">취소</button>
	
	</form>



</body>
</html>