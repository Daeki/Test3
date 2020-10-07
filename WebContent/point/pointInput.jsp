<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Point input page</h1>
	<!-- 이름, 번호, 국어, 영어, 수학 -->
	<!-- form 태그 -->
	<form action="./pointInputProcess.point" method="post">
		<p>Name <input type="text" name="name"> </p>
		<p>Num <input type="text" name="num"> </p>
		<p>Kor <input type="text" name="kor">  </p>
		<p>Eng <input type="text" name="eng"> </p>
		<p>Math <input type="text" name="math"> </p>
		<p><button>WRITE</button> </p>
	
	</form>

</body>
</html>