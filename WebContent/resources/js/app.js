var app = (()=>{
	return {
		init : (ctx)=>{
			$('#login_form').submit(()=>{
				alert('form 태그 클릭!');
			});
			
			$('#a_join').click(()=>{
				alert('회원가입으로이동');
				location.assign(ctx+'/player.do?action=move&page=join');
			});
			$('#a_back').click(()=>{
				alert('뒤로가기');
				location.assign(ctx+'/player.do?action=move&page=login');
			});
			
		}
	};
})();