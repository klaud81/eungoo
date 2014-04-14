<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="/resources/ico/favicon.png">

<title>FreeBoard</title>

<!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.css" rel="stylesheet">

</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>등록</th>
				<th>일시</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="data" items="${list}" varStatus="status">
				<tr>
					<td>${data.seq}</td>
					<td>${data.title}</td>
					<td>${data.insertUser}</td>
					<td>${data.insertDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>