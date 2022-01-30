<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Web 연결 성공</h1>
	<h3>List타입 artists 출력</h3>
	${artists}
	<hr>
	
	<h3>List타입 c:forEach > option 태그로 출력</h3>
	<c:forEach var="a" items="${artists}">
		<option value="${a.artistName}">${a.artistName}</option>
	</c:forEach>
	<hr>
	
	<h3>List타입 c:forEach > div 태그로 출력</h3>
	<c:forEach var="a" items="${artists}">
		<div>${a.artistName}</div>
	</c:forEach>
	
	<h3>List타입 c:forEach 태그로 출력</h3>
	<c:forEach var="a" items="${artists}"> 
		${a.artistName} 
	</c:forEach>
	<hr>
	
	<h3>ArrayList타입 {artistsName} 출력</h3>
	<div>${artistsName}</div>
	<br>
	
	<h3>ArtistVo타입 {siwumin} 출력</h3>
	<div>${siwumin}</div>
	ㄴ DB의 KimMinsuk이 있는 객체의 artistNo는 4지만
	<br> 기존 데이터 객체에서 getter한게 아니라
	<br> new ArtistVo() 새로 생성된 객체에 name,group만 setter한걸 가져와서
	<br> 초기값으로 초기화된 0이 뜨는 것
</body>
</html>