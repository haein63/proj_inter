<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인 성공 했을 때 댓글 달기 가능 -->
<form action="insertkey" method="post">
<input type="text" name = "comment" placeholder="한줄평!">
<input type ="text" name = "userId" placeholder="id">
<input type ="text" name = "title" placeholder="title">
<input type ="text" name = "no" placeholder="no">
<input type ="text" name = "rating" placeholder="rating">
<input type = "submit" value="전송">
</form>
</body>
</html>