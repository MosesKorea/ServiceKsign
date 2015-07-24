<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>

	<div class="container" id="member_write_container">
	<div class="row">
		<!-- 
		<div class="col-md-3">
                <p class="lead">Shop Name</p>
                <div class="list-group">
                    <a href="#" class="list-group-item active">Printable</a>
                    <a href="#" class="list-group-item">Cupcake Wrappers</a>
                    <a href="#" class="list-group-item">Authentic Dragon Bones</a>
                </div>
        </div>
		 -->
		 
		<div class="col-md-12">
			<div class="panel panel-default panelInner" style="margin: auto;">
				<div style="padding: 30px 20px">
				<div class="col-lg-offset-5">
					<p class="lead">회원가입</p>
				</div>
				
				<form class="form-horizontal" id="member_write_form" name="member_write_form" action="#"
					role="form">
			
					<div class="form-group">
						<label for="uid" class="control-label col-lg-5">아이디</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="uid"
								name="uid" placeholder="Id">
						</div>
					</div>
			
			
					<div class="form-group">
						<label for="upw" class="control-label col-lg-5">비밀번호</label>
						<div class="col-lg-3">
							<input type="password" class="form-control" id="upw"
								name="upw" placeholder="Password">
						</div>
					</div>
			
			
					<div class="form-group">
						<label for="urepw" class="control-label col-lg-5">비밀번호확인</label>
						<div class="col-lg-3">
							<input type="password" class="form-control" id="urepw"
								name="urepw" placeholder="Confirm Password">
						</div>
					</div>
			
			
					<div class="form-group">
						<label for="uname" class="control-label col-lg-5">이름</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="uname"
								name="uname" placeholder="Name">
						</div>
					</div>

					<div class="form-group">
						<label for="ucompany" class="control-label col-lg-5">회사명</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="ucompany" name="ucompany"
								placeholder="Name">
						</div>
					</div>
					<div class="form-group">
						<label for="udept" class="control-label col-lg-5">이름</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="udept"
								name="udept" placeholder="Name">
						</div>
					</div>

					<div class="form-group">
						<label for="umail" class="control-label col-lg-5">이메일</label>
						<div class="col-lg-3">
							<input type="email" class="form-control" id="umail"
								name="umail" placeholder="Enter email">
						</div>
					</div>
					
					<div class="form-group">
						<label for="upnumber" class="control-label col-lg-5">핸드폰번호</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="upnumber"
								name="upnumber" placeholder="phone number">
						</div>
					</div>
					
					<div class="form-group">
						<label for="uonumber" class="control-label col-lg-5">사무실번호</label>
						<div class="col-lg-3">
							<input type="text" class="form-control" id="uonumber"
								name="uonumber" placeholder="office number">
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-offset-5 col-lg-10">
							<button id="submit" type="submit" class="btn btn-primary">가입</button>
							<button type="reset" class="btn btn-default">재설정</button>
						</div>
					</div>
				</form>
				</div><!-- end padding -->
			</div><!-- end panel-->
		</div><!-- end col-md-9-->
	</div><!-- end row -->
	
</div><!-- end container -->

<!-- ---------------------------------------------------------------------------- -->
				
	<div class="container" id="member_write_welcome_container" style="display: none; padding: 15px 20px">
		<div class="jumbotron">
			<div class="container">
				<h1 align="center"><i class="glyphicon glyphicon-heart"></i></h1>
				<h2 class="text-center"><strong id="strong_memberId"></strong>님 회원가입을 축하드립니다.</h2>
			</div>
		</div>
			
		
		<div align="center">
			
			<button type="button" id="goIndex" class="btn-center btn btn-default">Go to Main</button>
		</div>
	</div>
				
				
	
<!-- ---------------------------------------------------------------------------- -->

<!-- 동현의 js들-->
	<style type="text/css">
	label.error {
	display: inline !important;
	color: red !important;
	}
</style>

<script src="resources/js/common/jquery.validate.js"></script>

<script type="text/javascript">
	$(function() {
// 		alert('sdsd');
		$.validator.addMethod("idcheck",
							function(value,element){
								str = value.toUpperCase();
								if(!('A' <= str.charAt(i) && str.charAt(i) <= 'Z'))
									return false;
					
								for(var i=1; i < str.length; i++) {
									if(!(('A' <= str.charAt(i) && str.charAt(i) <= 'Z') ||
										('0' <= str.charAt(i) && str.charAt(i) <= '9') ||
										(str.charAt(i) == '_')))
										return false;
								}
								return true;
													},
							"영문, 숫자, _ 만 사용 가능합니다."); //end addMethod
		$('input').on('keyup', function(data) {
			$('#member_write_form').validate({
				rules:{
					uid : {
						required : true,
						minlength : 5,
						maxlength : 12,
						idcheck: true
					},
					upw : {
						required : true,
						minlength : 6
					},
					urepw : {
						required : true,
						equalTo : "#member_pw"
					},
					uname : {
						required : true
					},
					ucompany : {
						required : true
					},
					udept : {
						required : true
					},
					umail : {
						required : true,
						email : true
					},
					upnumber : {
						required : true,
						digits : true
					},
					uonumber : {
						required : true,
						digits : true
					}
					
				},
				messages:{
					uid : {
						required : "아이디를 입력하세요",
						minlength : "5자 이상입니다.",
						maxlength : "12자 이하입니다."
					},
					upw : {
						required : "비밀번호를 입력하세요",
						minlength : "6자 이상입니다."
					},
					urepw : {
						required : "비밀번호확인을 입력하세요",
						equalTo : "비밀번호와 일치하지 않습니다."
					},
					uname : {
						required : "이름을 입력하세요"
					},
					ucompany : {
						required : "회사명을 입력하세요"
					},
					udept : {
						required : "부서명을 입력하세요"
					},
					umail : {
						required : "email을 입력하세요",
						email : "email형식이 아닙니다."
					},
					upnumber : {
						required : "핸드폰전화 번호를 입력하세요",
						digits : "숫자만 입력하세요"
					},
					uonumber : {
						required : "사무실전화 번호를 입력하세요",
						digits : "숫자만 입력하세요"
					}
				},
				success:function(){
					var keyupId = $('#uid').val();
					$.ajax({
						url : './memberIdCheck',
						type : 'GET',
						data : 'uid='+keyupId,
						success : function(data) {
		 					var $errorLabel = $("label[for='uid'].error");
		 					$errorLabel.remove();
// 			 				$('<label for="member_id" class="success">'+data+'</label>').appendTo('input#member_id');
							$("label[for='uid'].error").remove();
			 				$('<label for="uid" class="error">'+data+'</label>').insertAfter('input#uid');
						},
						error : function() {
							alert('error');
						}

					});//end ajax
				},
				submitHandler:function(){
					$.ajax({
						url:'./memberCreate',
						type:'POST',
						data : {
							"uid" : $("#uid").val(),
							"upw" : $("#upw").val(),
							"uname" : $("#uname").val(),
							"umail" : $("#umail").val(),
							"upnumber" : $("#upnumber").val(),
							"uonumber" : $("#uonumber").val()
						},
						dataType :"json",
						success : function(data){
							//alert('submitHandler.success');
							//alert(data);
							$('#member_write_container').css('display','none');
							
							$('#strong_memberId').text(data.member_name);
							$('#member_write_welcome_container').css('display','block');
							
							



// 							$('<div class="container" id="member_write_welcome_container"></div>').insertAfter('#member_write_container');
// 							$('<div><h1 class="text-center"><strong>'+ data.member_name+'</strong>님 회원가입을 축하드립니다.</h1></div>').appendTo('#member_write_welcome_container');
// 							$('<button type="button" id="goIndex" class="btn-center btn-primary btn-lg btn-block col-md-2">Go to Main</button>').insertAfter('h1');
							$('button#goIndex').on('click',function(){
								window.location.href="./index";
							});
						},
						error:function(jqXHR,textStatus,errorThrown){
							//alert('submitHandler.error!!!!!');
							//alert(textStatus);
						}
					});
					
					
// 					member_write_form.method="POST";
// 					member_write_form.action="/man/memberCreate";
// 					member_write_form.submit();

				}//end submitHandler
			});//end validate
		});//end keyup

		
		
	});//end ready
</script>

<%@ include file="../template/footer.jsp" %> 