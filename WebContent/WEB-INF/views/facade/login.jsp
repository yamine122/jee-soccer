<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div></div>
<div>
<img id="soccer" src=" ${img}/soccer.jpg" alt=""/>
		
</div>

<div></div>
<div></div>
<div>
<form id="login_form">
	
		<div id="login_tab">
		
				<div id="login_tab_item_1">
				ID : <input id="username" class="input_text" type="text" name="playerId"/>
				</div>
				
				<div id="login_tab_item_2">
				<input id="login_btn" type="button" value="로그인" />
				</div>
				
				<div id="login_tab_item_3">
				PW : <input id="solar" class="input_text" type="text" name="solar"/>
				</div>
				
		</div>
					<input type="hidden" name="action" value="login"/>
					<input type="hidden" name="page" value="home"/>
	</form>
	</div>
<div></div>
<div></div>
<div>
<h3><a id="a_join" href="#">회원가입</a></h3>
</div>
<div></div>
<script>
app.init('${ctx}');
</script>

