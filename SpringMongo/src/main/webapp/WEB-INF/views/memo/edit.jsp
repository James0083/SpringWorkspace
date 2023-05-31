<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::메모 수정::</title>
<!-- memo.css참조--------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="../resources/memo.css">
<!-- -------------------------------------------------------- -->

<script type="text/javascript">
	function check(){
		if(mf.name.value==""){
			alert('작성자를 입력하세요');
			mf.name.focus();
			return;
		}
		if(mf.msg.value==""){
			alert('메모내용을 입력하세요');
			mf.msg.focus();
			return;
		}
		let len=mf.msg.value.length;
		if(len>100){
			alert('메모내용은 100자까지만 가능해요');
			mf.msg.select();
			return;
		}
		
		//window.document.mf.submit();
		mf.submit();
	}
</script>
</head>
<body>
<div id="wrap">
<!-- http://localhost:9090/MyWeb/memo/MemoAdd?name=asdf+a&msg=asdfasd -->
<!-- http://localhost:9090/MyWeb/MemoAdd?name=asdfa&msg=asdfasdf -->
	<form name="mf" action="../edit" method="post">
	<!-- --------------------------------------------------- -->
	<input type="hidden" name="id" value="${memo.id}">
	<!-- --------------------------------------------------- -->
	<!-- table로 화면과 같이 구성하세요 -->
		<table border="1">
			<tr>
				<th colspan="2" id="Title"><h1>::한줄 메모장 글수정::</h1></th>
			</tr>
			<tr>
				<td width="20%">
					<b>글번호</b>
				</td>
				<td width="80%" >
					<input type="text" name="no" value="${memo.no}"
						placeholder="No" readonly style="width:40%">
				</td>
			</tr>
			<tr>
				<td width="20%" class="data_name">
					<b>작성자</b>
				</td>
				<td width="80%" >
					<input type="text" name="name" value="${memo.name}"
						placeholder="Name">
				</td>
			</tr>
			<tr>
				<td width="20%" class="data_name">
					<b>메모 내용</b>
				</td>
				<td width="80%" >
					<input type="text" name="msg" value="${memo.msg}"
					 	placeholder="Message">
				</td>
			</tr>
			<tr id="buttons">
				<td colspan="2">
					<button type="button" onclick="check()">글 수정하기</button>
					<button type="reset">다시 쓰기</button>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>