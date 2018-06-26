<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="myform">
<input type="text" id="test" placeholder="뮤지컬이름">
<input type="button" id="send">
<h1><span id="result"></span></h1>
</form>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	
	$("#send").on("click", function(){
		$.ajax({
			url: "movieTest",
			data: $("#myform").serialize(),
			type: "post",
			success:function(data){
				$("#result").html(data);
			},
			error: function(){
				console.log("error");
			}
			
		})
	})
</script>
</html>