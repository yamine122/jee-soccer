<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자바문법사용 c는객체가된다 -->
<jsp:include page="../common/head.jsp"/>

<div></div> <div><h1>회원페이지</h1></div> <div></div>
<div></div>
<c:choose>
	<c:when test="${page eq ''}">
	<jsp:include page="2_positions_question.jsp"/>
	</c:when>
	<c:when test="${page eq '2_positions_question'}">
	<jsp:include page="2_positions_answer.jsp"/>
	</c:when>
	<c:when test="${page eq ''}">
	<jsp:include page="4_find_by_teamid_position.jsp"/>	
	</c:when>
</c:choose>



<jsp:include page="../common/foot.jsp"/>