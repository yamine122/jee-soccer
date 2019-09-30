var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login();
			
			
			$('#a_join').click(()=>{
				
				alert('회원가입으로이동');
				location.assign(ctx+'/player.do?action=move&page=join');
			});
			$('#a_back').click(()=>{
				alert('뒤로가기');
				location.assign(ctx+'/player.do?action=move&page=login');
			});
			$('#join_form').submit(()=>{
				alert('회원가입');
			});
		}	
	};
})();
var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy,
	_position, _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();
var playerService = (()=>{
	return {
		login: ()=>{
			$('#login_btn').click(()=>{
				if( $('#username').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이없습니다.');
				}else{
					alert('입력한 아이디값은 :' +$('#username').val());
					$('#login_form').attr('action','/jee-soccer/player.do');
					$('#login_form').submit();
				}
				
			});
		}
	};
})();


