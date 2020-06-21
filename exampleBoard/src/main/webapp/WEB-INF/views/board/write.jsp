<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head lang="ko">
	<meta charset="UTF-8">
	<title> board example </title>
	<link rel="stylesheet" href="/css/base.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/board.css">
</head>
<body>

<div class="common-wrap">
	<nav class="common-nav-wrap">
	<ul class="common-nav">
		<li><a href="/">메인</a> 
		<li><a href="/board/list">게시판</a>
	</ul>
	</nav>
	
	<section class="common-content-wrap">
		<h1 class="content-title">글쓰기</h1>

		<dl class="common-board-form board-write">
			<dt><label for="boardTitle">제목</label></dt>
			<dd><input type="text" id="boardTitle"></dd>
			
			<dt><label for="boardContent">내용</label></dt>
			<dd><textarea id="boardContent"></textarea></dd>
			
			<dt><label for="boardFile">파일첨부</label></dt>
			<dd><input type="file" id="boardFile"></dd>
		</dl>
		
		
		<p class="common-btn-wrap common-btn-wrap-align-center">
			<button type="button" id="btnBoardWrite" class="write-black">글 작성</button>
			<a href="/board/list" class="normal">글 목록</a>
		</p>

	</section>
</div>



<script>
document.getElementById('btnBoardWrite').addEventListener('click', async (e) => {
	
	const {xhr} = await import('/js/xhr.js');
	
	const href = document.location.href.split('/');
	const bno = href[href.length-2];
	const depth = href[href.length-1];
		
	const $data = {
		groupBno : Number.isInteger(Number(bno)) ? bno : 0, 
		groupDepth : Number.isInteger(Number(depth)) ? depth : 0, 
		title : document.getElementById('boardTitle').value,	
		content : document.getElementById('boardContent').value,	
	};

	xhr('/board/ajax.boardWrite', JSON.stringify($data), server => {
		
		const data = JSON.parse(server);

		if(data.code == true) {
			
			alert('글이 등록되었습니다.');
			location.href = '/board/view/' + data.result;
		
		} else {
			
			alert('오류가 발생하였습니다. 나중에 다시 시도해 주세요.');
			location.href = '/board/list';
			
		}
		
	});

});
</script>
</body>
</html>