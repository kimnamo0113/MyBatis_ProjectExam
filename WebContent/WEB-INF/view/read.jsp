<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	p{
		text-align: center;
	}
	
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("a").eq(1).click(function() {
			var res=confirm("삭제할래요?");
			if(res==true)
				location.href="delete.do?no=${project.p_no}";
		})
	
	})                 
</script>
</head>
<body>
	<table>
		<tr>
			<th>프로젝트 이름</th>
			<td>${project.p_name }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${project.p_content }</td>
		</tr>
		<tr>
			<th>시작날짜</th>
			<td><fmt:formatDate value="${project.p_startdate }" pattern="yyyy-MM-dd"/></td>
		</tr>
		<tr>
			<th>종료날짜</th>
			<td><fmt:formatDate value="${project.p_enddate }" pattern="yyyy-MM-dd"/></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${project.p_state }</td>
		</tr>
	</table>    
	<p>
		<a href="write.do?no=${project.p_no }">[수정]</a>
		<a href="#">[삭제]</a>
		<a href="list.do">[돌아가기]</a>
	</p>
</body>
</html>