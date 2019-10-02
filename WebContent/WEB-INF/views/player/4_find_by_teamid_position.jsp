<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<h2>4.팀아이디와 포지션 입력하면 해당선수 정보 출력</h2>
		<form id ="btn4"  action="${ctx}/player.do">
		팀아이디<input type="text" name="teamId"/><br />
		포지션<input type="text" name="position"/><br />
		<input type="hidden" name="action" value="find4" />
		<input type="hidden" name="page" value="4_find_by_teamid_position" />
		<input type="submit"  value="전송"/>
		</form>
		
		
<!-- 4.결과 -->
해당 id가 ${player.teamId} 
팀의 포지션 ${player.position}
이 일치하는 선수는 홍길동입니다.
