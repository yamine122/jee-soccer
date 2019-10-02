<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 쿼리 -->
<h2>-- SQL_TEST_005-- 수원팀(ID: K02)키가 170 이상 선수-- 이면서 성이 고씨인 선수</h2>
	<form id="btn5" action="${ctx}/player.do">
		팀 아이디<input type="text" name="teamId"/><br />
		키<input type="text" name="height"/><br />
		선수이름<input type="text" name="playerName"/><br />
	<input type="hidden" name="action" value="find5" />
	<input type="hidden" name="page" value="5_find_by_teamid_height_name" />
	<input type="submit" value="전송"/>
	
	</form>
	
	<!-- 결과 -->
${player.teamId}
${player.height} 
${player.playerName}
</body>
</html>