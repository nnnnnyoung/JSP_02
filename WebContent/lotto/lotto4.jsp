<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로또번호 받기</h1>
	<span>로또번호 </span>
	
	<%int [] lottoN=(int [])request.getAttribute("lottoNumber"); %> <!-- 배열 가지고 오기 -->
		
	<%for(int i=0; i<lottoN.length; i++){%>
			<h1><%=lottoN[i]     %>    </h1>
			
	<%} %>


	<br>

	


</body>
<script>

	
</script>
</html>