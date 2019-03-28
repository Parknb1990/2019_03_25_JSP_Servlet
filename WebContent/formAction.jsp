<!-- 
	날짜 : 2019. 03. 25
	이름 : 박노빈
	내용 : form Action 태그를 이용하여 데이터 전송 예제.
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM 태그 예제</title>
</head>
<body>

	<!-- form 태그를 이용하면 form태그 안에 있는 데이터들을 action 태그에 지정된 경로로 데이터를 전송 -->
	<form action="./formActionEx" method="post">
		<input type="text" placeholder="이름을 입력하세요" name="uname" size="20"><br><br>
		<input type="text" placeholder="아이디를 입력하세요" name="uid" size="20"><br><br>
 		<input type="password" placeholder="비밀번호를 입력하세요" name="upass" size="20"><br><br>
 		취미<br><br>
 		
 		<!-- checkbox 속성을 이용한 다중 선택 -->
 		<input type="checkbox" name="hobby" value="cook" checked>요리
 		
 		<!-- checked를 이용하여 요리를 기본으로 체크한 상태로 출력. -->
 		<input type="checkbox" name="hobby" value="read">독서
 		<input type="checkbox" name="hobby" value="run">조깅
 		<input type="checkbox" name="hobby" value="swim">수영
 		<input type="checkbox" name="hobby" value="sleep">취침 <br>
 		
 		<!-- radio 속성을 이용하면 한가지만 선택 -->
 		<input type="radio" name="major" value="matn" checked>수학
 		<input type="radio" name="major" value="eng">영어
 		<input type="radio" name="major" value="kor">국어
 		<input type="radio" name="major" value="des">디자인
 		<br>
 		
 		<select name="protocol">
 			<option value="http">http</option>
 			<option value="ftp" selected>ftp</option>
 			<option value="smtp">smtp</option>
 			<option valie="pop">pop</option>
 		</select><br><br>
 		<input type="submit" value="전송">
 		<input type="reset" value="초기화">
 		
	</form>
</body>
</html>