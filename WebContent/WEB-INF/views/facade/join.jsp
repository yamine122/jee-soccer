<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../common/head.jsp"/>

<div>1</div>
	<div>2<form id="join_form" action="${ctx}/player.do">
	playerId<input  type="text" name="playerId"/><br />
	playerName<input  type="text" name="playerName"/><br />
	teamId<input  type="text" name="teamId"/><br />
	ePlayerName<input  type="text" name="ePlayerName"/><br />
	nickname<input  type="text" name="nickname"/><br />
	joinYyyy<input  type="text" name="joinYyyy"/><br />
	position<input  type="text" name="position"/><br />
	backNo<input  type="text" name="backNo"/><br />
	nation<input  type="text" name="nation"/><br />
	birthDate<input  type="text" name="birthDate"/><br />
	solar<input  type="text" name="solar"/><br />
	height<input  type="text" name="height"/><br />
	weight<input  type="text" name="weight"/><br />
	
	<input  type="hidden" name="action" value="join"/><br />
	<input type="hidden" name="page" value="home"/><br />
	<input  type="submit" value="회원가입"/><br />
	
	
	</form>
</div>
	<div>
</div>
<div>4</div>
<div>5</div>	
<div>6</div>
<div>7</div>
<div>8
<h3><a id="a_back" href="#">뒤로가기</a></h3>
</div>
<div>9</div>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');

</script>
<!-- a -->
