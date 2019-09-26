<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>


		<h2><a id="a_join" href="#">2.포지션 종류 보기</a></h2>
		
		
		<h2>4.팀아이디와 포지션 입력하면 해당선수 정보 출력</h2>
		<form id ="btn4"  action="<%=request.getContextPath() %>/player.do">
		팀아이디<input type="text" name="teamId"/><br />
		포지션<input type="text" name="position"/><br />
		<input type="hidden" name="action" value="find4" />
		<input type="hidden" name="page" value="4_find_by_teamid_position" />
		<input type="submit"  value="전송"/>
		</form>


<h2>-- SQL_TEST_005-- 수원팀(ID: K02)키가 170 이상 선수-- 이면서 성이 고씨인 선수</h2>
	<form id="btn5" action="<%=request.getContextPath() %>/player.do">
		팀 아이디<input type="text" name="teamId"/><br />
		키<input type="text" name="height"/><br />
		선수이름<input type="text" name="playerName"/><br />
	<input type="hidden" name="action" value="find5" />
	<input type="hidden" name="page" value="5_find_by_teamid_height_name" />
	<input type="submit" value="전송"/>
	
	</form>
</div>
<script>
$('#a_join').click(function(){
	alert('버튼클릭');
	location.assign('<%=request.getContextPath() %>/player.do?action=find2&page=2_positions');
});

$('#btn4').submit(function(){
	alert('버튼클릭');
		
});

$('#btn5').submit(function(){
	alert('버튼클릭');
});
</script>


</body>
</html>