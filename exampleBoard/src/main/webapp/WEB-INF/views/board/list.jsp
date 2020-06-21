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
		<li>게시판
	</ul>
	</nav>

	<section class="common-content-wrap" id="vue">
		<h1 class="content-title">게시판</h1>

		<form class="searchBoardForm" action="/board/search/" method="post">
			<select name="type">
				<option value="title">제목</option>
				<option value="content">내용</option>
				<option value="writer">글쓴이</option>
			</select>
			<input type="text" name="keyword">
			<button type="submit">검색</button>
		</form>
	
	
		<p class="common-btn-wrap common-btn-wrap-align-right">
			<a href="/board/write" class="write">글쓰기</a>
		</p>
		
		
		<p class="total-board-post">총 <b v-text="totalBoardPost"></b> 개</p>


		<table class="board-list-table">
		<caption class="hide">게시판 목록</caption>
	
		<colgroup>
			<col style="width:10%">
			<col style="width:50%;">
			<col style="width:10%">
			<col span="2" style="width:15%;">
		</colgroup>
		
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>조회수</th>
				<th>글쓴이</th>
				<th>작성일</th>
			</tr>
		</thead>
		
		<tbody>
			<tr v-for="(board, no) in board" v-cloak>
				<td v-text="index(no)"></td>
				<td class="title">
					<template v-if="board.bno == board.groupBno">
						<a v-bind:href="'/board/view/' + board.bno" v-text="board.title"></a>
					</template>
					<template v-else>
						<a v-bind:href="'/board/view/' + board.bno" class="reply" v-text="board.title"></a>
					</template>
				</td>
				<td v-text="board.hit"></td>
				<td v-text="board.writer"></td>
				<td v-text="board.insertDate.slice(0, 10)"></td>
			</tr>
		</tbody>
		</table>


		<p class="pagination" v-cloak>
			<template v-if="paging.page != paging.pageStart">
				<a v-bind:href="'/board/list/' + paging.pageStart" title="처음 페이지"><<</a>
				<a v-bind:href="'/board/list/' + (paging.page-1)" title="이전 페이지"><</a>
			</template>
			
			<span v-for="pno in pagination">
			<template v-if="pno != paging.page">
				<a v-bind:href="'/board/list/' + pno" v-text="pno"></a>
			</template>
			<template v-else>
				<i class="on" v-text="pno"></i>
			</template>
			</span>

			<template v-if="paging.page != paging.pageEnd">
				<a v-bind:href="'/board/list/' + (paging.page+1)" title="다음 페이지">></a>
				<a v-bind:href="'/board/list/' + paging.pageEnd" title="마지막 페이지">>></a>
			</template>
		<p/>
		
	</section>
</div>



<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<style>
[v-cloak] {display:none;}
</style>
<script>
window.addEventListener('load', (e) => {

	const server = '${result}';

	new Vue({
		
		created() {
			this.setData();
			this.setPagination();
		},
		
		data: () => ({
			totalBoardPost : 0,
			board : {},
			paging : {},
			pagination : [],
			boardSearch : {
				select : 'title',
				input : '',
			},
		}),
		
		methods : {
			index(no) {	
				return  (this.paging.postList * this.paging.page - this.paging.postList) + no + 1;
			},
			
			setData() {
				
				const data = JSON.parse(server);

				this.totalBoardPost = data.resultMap.paging.allPost;
				this.board = data.resultMap.board;
				this.paging = data.resultMap.paging;

			},
				
			setPagination() {

				let start = this.paging.page <= this.paging.pageList ? this.paging.pageStart
						:  (this.paging.page % this.paging.pageList) == 1 ? this.paging.page 
								: Math.floor((this.paging.page-1) / this.paging.pageList) * this.paging.pageList + 1;
		
				let end =	this.paging.pageEnd <= this.paging.pageList ? this.paging.pageEnd 
						: (start + this.paging.pageList - 1) < this.paging.pageEnd ? (start + this.paging.pageList - 1) 
								: this.paging.pageEnd;

				for(;start <= end; ++start){
					this.pagination.push(start);
				}
				
			},
			
		},

	}).$mount('#vue');
		
});
</script>
</body>
</html>