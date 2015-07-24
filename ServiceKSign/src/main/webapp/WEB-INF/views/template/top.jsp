<%@page import="com.ksign.service.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Member susers = null;
	if (session.getAttribute("session_member") != null){ //유져 뽑는
		susers=(Member)session.getAttribute("session_member");
	}
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>서비스 페이지</title>

    <script src="resources/js/common/jquery-1.8.2.min.js"></script>
    
    <!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Add custom CSS here -->
    <link href="resources/css/main/modern-business.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <!-- main css-->
    <link href="resources/css/main/main.css" rel="stylesheet">
    <link href="resources/css/main/bootstrap-responsive.min.css" rel="stylesheet">
		
<style type="text/css">
	#ads-sidebar{
		margin-top: 50px;
		position: absolute;
		right: 0%;
		z-index: 999;
		background: #ccc;
		padding: 4px 0px 4px 4px;
		margin-right: 4px;
		border: solid 1px gray;}
	#c-ads{position: absolute;
		right: 0;
		top: 0px;
		cursor: pointer;
		color: #000;
		border: solid 1px black;
		width: 8px;
		height: 8px;
		display: block;
		line-height: 8px;
	}
	#ads-wrapper{
		position:absolute;
		right:0%;
		z-index:999;
	}
</style>
<script type="text/javascript">
		$(function(){
			$.ajax({
				url:"./loginCheck",
				async : false,
				type :"GET",
				dataType :"json",
				success : function(data){
					//로그인 안됬을때
					if(data.member_id=="nolog"){
						$('#loginBtn').text('로그인');
						$('#loginBtn').attr('href','login');
						
						//비로그인시 마이페이지 클릭했을때
						$('#mypage_member').on('click',function(event){
							event.preventDefault();
							alert('현재 접근하신 부분은 로그인이 필요합니다. 로그인후 시도하여 주세요!!');
							window.location.href='login';
							
						});
						
						
					}else{//로그인 상태
						$('#loginBtn').text(data.member_id+'님 로그아웃');
						$('#loginBtn').attr('href','logout');
					}
				},
				error : function(jqXHR,textStatus,errorThrown){
				}
				
			});//end ajax
			
		});//end ready
	</script>
</head>

<body>
<!-- header -->
<header>
	<!-- navbar-top -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- container -->
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand main-nav-text" href="index">Ksign Technical Assistance Center</a>
            </div>
            <!-- /.navheader -->
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            	<!-- navbar-right -->
				<ul class="nav navbar-nav navbar-right">
						<li><a href="#" id="loginBtn">로그인</a></li>
						<%
							if (susers == null) {
						%>
							<li><a href="./memberCreate">회원가입</a></li>
						<%
							}
							if (susers != null  && susers.getUtype().equals("ADMIN") ) {
						%>
							<li><a href="./adminMain" id="mypage_admin">마이페이지-관리자</a></li>
						<%
							} else /* if (susers != null) */ {
						%>
							<li><a href="./mypageInfo" id="mypage_member">마이페이지</a></li>
						<%
							}
						%>
			        </li>
				</ul>
				<!-- /.navbar-right -->
			</div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!-- /.navbar-top -->
    <div class="subnavbar">
  		<div class="subnavbar-inner">
	    <div class="container">
	      <ul class="mainnav">
	      	<%
	      		if (susers != null   && susers.getUtype().equals("ADMIN")  ) {
			%>
		        <li class="dropdown"><a href="./projectList"><span class="glyphicon glyphicon-list-alt"></span><span>프로젝트</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./maintanceList"><span class="glyphicon glyphicon-list-alt"></span><span>유지보수</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./customerList"><span class="glyphicon glyphicon-list-alt"></span><span>이슈관리</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./customerList"><span class="glyphicon glyphicon-list-alt"></span><span>고객정보</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./productList"><span class="glyphicon glyphicon-list-alt"></span><span>재품관리</span><b class="caret"></b></a></li>
	            <li class="dropdown"><a href="./weekList"><span class="glyphicon glyphicon-list-alt"></span><span>일정관리</span><b class="caret"></b></a></li>
			<%
				} else {
			%>
				<li class="dropdown"><a href="./projectList"><span class="glyphicon glyphicon-list-alt"></span><span>프로젝트</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./maintanceList"><span class="glyphicon glyphicon-list-alt"></span><span>유지보수</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./customerList"><span class="glyphicon glyphicon-list-alt"></span><span>이슈관리</span><b class="caret"></b></a></li>
		        <li class="dropdown"><a href="./customerList"><span class="glyphicon glyphicon-list-alt"></span><span>고객정보</span><b class="caret"></b></a></li>
			<%
				}
			%>


	      </ul>
	    </div>
	    <!-- /container --> 
	  </div>
	  <!-- /subnavbar-inner -->
	</div>
	  <!-- /subnavbar --> 

</header>
<!-- /.header  -->