<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<%@ include file="template/header.jsp" %>
<script type="text/javascript">

	$(function(){
		$("input").hide();
		$("form>button").hide();
		
		$("#edit").click(function(){
			$(this).hide();
			$("input").show();
			$("form>button").show();
			$(".di").hide();
		});
	});

</script>
<title>Insert title here</title>
</head>
<body>

<%@ include file="template/menu.jsp" %>


<div class="page-header">
	<h1>상세페이지</h1>
</div>
	
	
	<form method="post">
	
		<input type="hidden" name="_method" value="put"/>
	
		<div class="form-group">
		<label for="sabun">sabun</label>
		<div class="well well-sm">${bean.sabun }</div>
		<input type="hidden" class="form-control"name="sabun" id="sabun" placeholder="sabun"/>
		</div>
		<div  class="form-group">
		<label for="name">name</label>
		<div class="well well-sm di">${bean.name }</div>
		<input type="text" class="form-control" name="name" id="name" placeholder="name"/>
		</div>
		<div  class="form-group">
		<label for="nalja">nalja</label>
		<div class="well well-sm">${bean.nalja}</div>
		</div>
		<div  class="form-group">
		<label for="pay">pay</label>
		<div class="well well-sm di">${bean.pay }</div>
		<input type="text"  class="form-control" name="pay" id="pay" placeholder="pay"/>
		</div>
	
		<button type="submit" class="btn btn-danger">수정</button>
		<button type="reset" class="btn btn-danger">취소</button>
	</form>
	
	
		<button id="edit" class="btn btn-danger">수정</button>
	
</body>
</html>