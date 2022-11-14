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
	
	<span>${lottoNumber[0]} </span>
	<span>${lottoNumber[1]} </span>
	<span>${lottoNumber[2]} </span>
	<span>${lottoNumber[3]} </span>
	<span>${lottoNumber[4]} </span>
	<span>${lottoNumber[5]} </span>


	<br>
		<!-- 
	기본이 html 문서
	<% %> jsp문법: html, css, javascript jsp영역은 서로 완전히 다른 영역
				변수를 공유하는데 한계가 있습니다. 거의 공유하지 못한다고 생각
				>> 불편하고 무거워서 많이 쓰이는 문법이 jstl
				
				jsp문법에서 출력할 데이터는 html문서로 출력을 시켜야합니다.
	
	 -->
	<% //parameter(클라이언트가 보낸 데이터)랑 Attribute(서버반에서 주고 받는 데이터)랑 구분하기
	
	int [] lottoN=(int [])request.getAttribute("lottoNumber"); %> <!-- 배열 가지고 오기 -->
		
	<%for(int i=0; i<lottoN.length; i++){%>
			<h1><%=lottoN[i]     %>    </h1>
			
	<%} %>
	
	<%for(int i=0; i<lottoN.length; i++){
		out.print(lottoN[i]+"<br>");
	}%>
	

</body>
<script>

	
</script>
</html>