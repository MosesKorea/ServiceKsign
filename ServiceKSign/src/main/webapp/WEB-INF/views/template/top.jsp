<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
					<li>
						<!-- SSO고객 이름 --> <a href="#">ooo 님</a>
					</li>
					<li>
						<!-- logout 처리시 SSO세션 초기화 및 메인 페이지로 이동 --> <a href="#">logout</a>
					</li>
					<li>
						<!-- 나에게 해당하는 이슈 알림 --> <a href="#"><span class="glyphicon glyphicon-comment"></span> mypage</a>
					</li>
					<li class="dropdown">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span>일정<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="full-width.html">일정생성</a>
                            </li>
                            <li>
                                <a href="sidebar.html">일정수정</a>
                            </li>
                        </ul>
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
	        <li class="dropdown"> <a href="./projectList"><span class="glyphicon glyphicon-list-alt"></span><span>프로젝트</span><b class="caret"></b></a></li>
	        <li class="dropdown"><a href="./maintanceList"><span class="glyphicon glyphicon-list-alt"></span><span>유지보수</span><b class="caret"></b></a></li>
	        <li class="dropdown"> <a class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-list-alt"></span><span>고객정보</span></a><b class="caret"></b>
	        	<ul class="dropdown-menu">
							<li><a href="portfolio-1-col.html">고객정보 생성</a></li>
							<li><a href="portfolio-1-col.html">고객정보 수정</a></li>
				</ul>
	        </li>
	        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-list-alt"></span><span>재품관리</span><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="portfolio-1-col.html">제품 등록</a>
                            </li>
                            <li>
                                <a href="portfolio-1-col.html">제품 수정</a>
                            </li>
                            <li>
                                <a href="portfolio-1-col.html">제품 삭제</a>
                            </li>
                        </ul></li>
	        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-list-alt"></span><span>일정관리</span><span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="blog-home-1.html">일정 생성</a>
                            </li>
                            <li>
                                <a href="blog-home-2.html">일정 수정</a>
                            </li>
                            <li>
                                <a href="blog-home-2.html">이슈 생성</a>
                            </li>
                            <li>
                                <a href="blog-home-2.html">이슈 수정</a>
                            </li>
                        </ul>
            </li>
	      </ul>
	    </div>
	    <!-- /container --> 
	  </div>
	</div>
	  <!-- /subnavbar-inner --> 

</header>
<!-- /.header  -->