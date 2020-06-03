<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>@RequestBody</h1>

<form action="request-body" method="POST">
	<input type="text" name="param">
	<input type="submit" value="전송">
</form>

<p>${result}</p>