<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	.jumbotron, .navbar{
		display:none;
	}
</style>
<link rel="stylesheet" type="text/css" href="../css/layout.css">
<script type="text/javascript" src="./js/userCheck.js"></script>

<div class="container m2" style="margin-top:2em">
	<form name="idf" action="idCheck" method="post">
		<label for="userid">아이디</label>
		<input type="text" name="userid" class="form-control" id="userid" placeholder="User ID" autofocus="autofocus">
		<button type="button" onclick="id_check()" class="btn btn-success">확  인	</button>
	</form>
</div>
<!-- 
<div class="container m2" style="margin-tip:2em">
	<h3>ID로 [<span class="ck">a</span>]은/는 이미 사용중 입니다</h3>
	<br>
	
	<form name="idf" action="idCheck.jsp" method="post">
		<label for="userid">아이디</label>
		<input type="text" name="userid" id="userid" placeholder="User ID" autofocus="autofocus">
		<button type="button" onclick="id_check()">확  인	</button>
	</form>
</div>
 -->
