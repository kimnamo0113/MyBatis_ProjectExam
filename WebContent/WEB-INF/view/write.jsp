<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a{
		color: black;
		text-decoration: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		var str='${project.p_state}'
		$("option").each(function(i,obj) {
			if($(obj).val()==str){
				$(obj).attr("selected","selected")	
			}
		})
	})
</script>
</head>
<body>
	<form action="write.do" method="post">
	<label>프로젝트 이름 : </label>
	<input type="text" name="name" value="${project.p_name }"><br>
	<label>프로젝트 내용 : </label>
	<textarea rows="5" cols="20" name="content">${project.p_content}</textarea><br>
	<label>시작날짜 : </label>
	<input type="text" name="startdate" value="<fmt:formatDate value="${project.p_startdate }" pattern="yyyy-MM-dd"/>"><br>
	<label>마감날짜 : </label>
	<input type="text" name="enddate" value="<fmt:formatDate value="${project.p_enddate }" pattern="yyyy-MM-dd"/>"><br>
	<label>상태 : </label>
	<select name="state">
		<option value="준비">준비</option>
		<option value="진행중">진행중</option>
		<option value="종료">종료</option>
		<option value="보류">보류</option>
	</select><br>
	<input type="submit">
	<button><a href="list.do">취소</a></button>
	</form>
</body>
</html>