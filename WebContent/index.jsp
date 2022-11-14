<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<link href="./css/main.css" rel="stylesheet">
</head>
<body>
	<h1> My homepage </h1>
	<hr>
	<span>로그인 정보: </span>${teamName}/${age}
</body>
</html>

<!-- 
컨트롤러에서 넘어온 데이터
request.setAttribute("teamName", "human");
request.setAttribute("age", 30);
 -->