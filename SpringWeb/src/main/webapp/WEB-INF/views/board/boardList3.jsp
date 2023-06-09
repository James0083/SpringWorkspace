<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="row my-3">
	<div class="col-12 text-center">
		<h2>Spring Board</h2>
		<c:if test="${paging.findType ne null and pageing.findType ne ''}">
			<h3 class="text-center text-secondary">검색어 : <c:out value="${paging.findKeyword}"/> </h3>
		</c:if>
		
		<p>
			<a href="write">글쓰기</a> | <a href="list">글목록</a>
		</p>
	</div>
</div>
<!-- 검색 폼 시작 --------------------------------------------------- -->
<div class="row my-3">
	<div class="col-9 text-center">
		<form name="searchF" action="list" onsubmit="return board_check()">
			<input type="hidden" name="pageSize" value="${pageSize}">
			<input type="hidden" name="cpage" value="${paging.cpage}">
			<select name="findType" style="padding:5px">
				<option value="">:::검색 유형:::</option>
				<option value="1"  <c:if test="${paging.findType eq 1}">selected</c:if>  >글제목</option>
				<option value="2"  <c:if test="${paging.findType eq 2}">selected</c:if>  >작성자</option>
				<option value="3"  <c:if test="${paging.findType eq 3}">selected</c:if>  >글내용</option>
			</select>
			<input type="text" name="findKeyword" placeholder="검색어를 입력하세요"
				autofocus="autofocus" style="width:50%;, padding:5px">
			<button class="btn btn-outline-primary">검  색</button>
		</form>
	</div>
	<div class="col-3 text-left">
		<form name="psf" action="list">
			<!-- ----------------------------------------------------- -->
			<input type="hidden" name="cpage" value="${paging.cpage}">
			<input type="hidden" name="findType" value="${paging.findType}">
			<input type="hidden" name="findKeyword" value="${paging.findKeyword}">
			<!-- ----------------------------------------------------- -->
			<select name="pageSize" style="padding:5px" onchange="submit()">
				<option value="">:::페이지 사이즈:::</option>
				<c:forEach var="ps" begin="5" end="20" step="5">
					<option value="${ps}"   <c:if test="${ps eq pageSize}">selected</c:if> >페이지 사이즈${ps}</option>
				</c:forEach>
			</select>
		</form>
	</div>
</div>
<!-- ------------------------------------------------------------- -->
<div class="row">
	<div class='col-10 offset-1'>
		<table class="table table-condensed table-striped">
			<thead>
				<th width="10%">글번호</th>
				<th width="40%">제목</th>
				<th width="20%">글쓴이</th>
				<th width="20%">날짜</th>
				<th width="10%">조회수</th>
			</thead>
			<tbody>
				<!-- --------------------- -->
				<c:if test="${boardArr eq null or empty boardArr}">
					<td colspan="5">
						<b>데이터가 없습니다</b>
					</td>
				</c:if>
				
				<c:if test="${boardArr ne null and not empty boardArr}">
				<c:forEach var="board" items="${boardArr}">
				<tr>
					<td>
						<c:out value="${board.num}"/>
					</td>
					<td>
					
					<!-- 답변 레벨에 따라 들어쓰기 -->
					<c:forEach var="k" begin="1" end="${board.lev}">
						&nbsp;&nbsp;&nbsp;
					</c:forEach>
					<c:if test="${board.lev>0}">
						<img src="../images/re.png">
					</c:if>
					
					<!-- 글제목----------------------- -->
					
					<!-- proDetail?pnum=1 ==> @RequestParam("pnum")
						 proDetail/1
						 
						 board/list
						 board/write 
						 board/view/글번호
					 -->
						<a href="view/<c:out value="${board.num}"/>"><c:out value="${board.subject}"/></a>
						<!-- 청부파일 여부------------------- -->
						<c:if test="${board.filesize >0}">
						<span class="float-right">
							<img src="../images/attach.jpg" style="width:20px"
							 title="<c:out value="${board.originFilename}"/>">
						</span>
						</c:if>
						<!-- ---------------------------- -->
					</td>
					<td>
						<c:out value="${board.userid}"/>
					</td>
					<td>
						<c:out value="${board.wdate}"/>
					</td>
					<td>
						<c:out value="${board.readnum}"/>
					</td>
				</tr>
				</c:forEach>
				</c:if>
				<!-- --------------------- -->
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3" class="text-center">
						${pageNavi}
					</td>
					<td colspan="2">
						총 게시글수:<span class="text-primary"> <c:out value="${paging.totalCount}"/> 개</span><br>
						<span class="text-danger">
							<c:out value="${paging.cpage}"/>
						</span>/ 페이지수 pages
						<c:out value="${paging.pageCount}"/>
					</td>
			</tfoot>
		</table>
	</div>
</div>
