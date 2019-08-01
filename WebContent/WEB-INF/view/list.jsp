<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#container{
	width:800px;
	height: 760px;
	margin: 0 auto;
}

table {
	clear:both;
	border-collapse: collapse;
}

td, th {
	border: 1px solid black;
}
a{
	color:black;
	text-decoration: none;
}
#proadd {
	float: right;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div id="container">
		<a href="write.do" id="proadd">[새 프로젝트 등록]</a>
		<br>
		<table>
			<tr>
				<th>프로젝트 이름</th>
				<th>시작날짜</th>
				<th>종료날짜</th>
				<th>상태</th>
			</tr>
			<c:forEach var="project" items="${list }">
			
				<tr>
				
					<td><a href="read.do?no=${project.p_no }">${project.p_name }</a></td>
					<td><fmt:formatDate value="${project.p_startdate }" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${project.p_enddate }" pattern="yyyy-MM-dd"/></td>
					<td>${project.p_state }</td>
				
				</tr>
				
			</c:forEach>
		</table>
	</div>
</body>
</html>