<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<form action="write.do" method="post">
	<label>프로젝트 이름 : </label>
	<input type="text" name="name"><br>
	<label>프로젝트 내용 : </label>
	<textarea rows="5" cols="20" name="content"></textarea><br>
	<label>시작날짜 : </label>
	<input type="date" name="startdate"><br>
	<label>마감날짜 : </label>
	<input type="date" name="enddate"><br>
	<label>상태 : </label>
	<select name="state">
		<option value="준비">준비</option>
		<option value="진행중">진행중</option>
		<option value="종료">종료</option>
		<option value="보류">보류</option>
	</select><br>
	<input type="submit">
	</form>
</body>
</html>