<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입
	<form action="join/joinForm" method="post">
		아이디 <input type="text" name="id"><br/>
		비밀번호<input type = "password" name="password"><br/>
		이메일<input type = "text" name="email"><br/>
		인증번호<input type = "text" name="approvalKey"><br/>
		닉네임<input type = "text" name="nickname"><br/>
		<input type="button" value="취소"><input type="submit" value="전송">
	</form>
</body>
</html>