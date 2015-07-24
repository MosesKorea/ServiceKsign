<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp"%>

<div class="container">
	
	<div class="panel panel-default" style="margin: auto;">
		<div class="panel-heading">
			<h1 class="panel-title"><strong>로그인</strong></h1>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" id="login_form" name="login_form">
				<div class="form-group">
					<label for="member_id" class="col-lg-3 control-label">아이디</label>
					<div class="col-lg-6">
						<input type="text" class="form-control" id="member_id" name="member_id" placeholder="Id" value="${fail_member.member_id}">
						<label for="member_id">${memberNotFoundMsg}</label>
					</div>
				</div>
				<div class="form-group">
					<label for="member_pw" class="col-lg-3 control-label">비밀번호</label>
					<div class="col-lg-6">
						<input type="password" class="form-control" id="member_pw" name="member_pw" placeholder="Password" value="${fail_member.member_pw}">
						<label for="member_pw">${passwordMismatchMsg}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-offset-3 col-lg-10">
						<button type="submit" class="btn btn-default">로그인</button>
						<a href="memberCreate"><button type="button" class="btn btn-default">회원가입</button></a>
					</div>
				</div>
			</form>
		</div><!-- end panel body -->
		
	</div><!-- end panel -->
	
</div><!-- end container -->
<!--css  ---------------------------------------------------------------------------------  -->
<style type="text/css">

	@media (min-width: 768px){ 
		div.panel.panel-default{
			width: 80%;	
		}
	}
	@media (min-width: 992px){ 
		div.panel.panel-default{
			width: 60%;
		}
	}
</style>



<!--javascript  ---------------------------------------------------------------------------------  -->
<script src="resources/js/common/jquery.validate.js"></script>
<script type="text/javascript">

	$(function() {
// 		alert('ready');
		$('button[type="submit"]').on('click', function() {
// 			alert('submit click');
			$('#login_form').validate({
				rules :{
					uid : {
						required : true
					},
					upw : {
						required : true
					}
				},
				messages :{
					uid : {
						required : "아이디를 입력해주세요"
					},
					upw : {
						required : "비밀번호를 입력해주세요"
					}
				},
				submitHandler:function(){
					login_form.method="POST";
					login_form.action="./login";
					login_form.submit();
				}
			});

		});
	});
</script>

<%@ include file="../template/footer.jsp" %> 
