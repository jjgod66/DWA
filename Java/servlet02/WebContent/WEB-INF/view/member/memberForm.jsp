<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보 입력 폼</title>
	</head>
	<body>
		<h2>회원 정보 입력 폼</h2>
		<form method="post" action="">
			<table border="1">
				<tr>
					<td>회원ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>회원이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="tel"></td>
				</tr>
				<tr>
					<td>회원주소</td>
					<td><input type="text" name="addr"></td>
				</tr>
			</table>
		</form>
	</body>
</html>