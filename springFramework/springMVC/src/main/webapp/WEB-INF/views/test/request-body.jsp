<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>@RequestBody</h1>

<form action="request-body" method="POST">
	<input type="text" name="param">
	<input type="submit" value="전송">
</form>

<form action="request-body-obj" method="POST">
	<input type="text" name="str">
	<input type="text" name="num" placeholder="숫자만 입력">
	<input type="submit" value="전송">
</form>

<p>${result}</p>