<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link
	href="https://fonts.googleapis.com/css?family=Anton|Nanum+Gothic|Francois+One|Krona+One|Passion+One"
	rel="stylesheet">
	
<style>
* {
	margin: 0px;
	padding: 0px;
}
.header_box{
width: 100%;
height: 40px;
background-color: #E4E4E4;
display: flex;
flex-direction: row;
justify-content: space-around;
align-items: center;
}
.logo_box{
width: 10%;
height: 40px;
font-family: Anton;
font-size: 25px;
}
.sign_box{
width: 13%;
height: 40px;
display: flex;
flex-direction: row;
justify-content: space-between;
align-items: center;
}
.empty_box{
width: 65%;
height:40px;
}
.login{
width: 40%;
font-family: Nanum+Gothic;
font-size: 15px;
text-align: center;
}
.separation{
width: 5%;
text-align: center;
}
.join{
width: 40%;
font-family: Nanum+Gothic;
font-size: 15px;
text-align: center;
}
</style>
<div class="header_box">

	<div class="logo_box">INTERMISSION</div>

	<div class="empty_box"></div>
	<div class="sign_box">
		<a href="#" class="login" style="text-decoration: none;">LOGIN</a>
		<div class="separation">/</div>
		<a href="#" class="join" style="text-decoration: none;">JOIN</a>
	</div>

</div>`
