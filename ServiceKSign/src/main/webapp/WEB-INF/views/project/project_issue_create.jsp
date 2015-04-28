<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>
<!-- top page include -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<link href="resources/css/project/project_list.css" rel="stylesheet">
<div class="main">
	<div class="main-inner">
		<div class="container">
		<div class="row">
			
			<%@ include file="project_left_list.jsp" %>

            <!-- /.col-md-3 왼쪽사이드 메뉴  end-->
			<div class="col-md-1"></div>
			<div class="col-md-9">
				<div class="row">
				<h3>프로젝트 이슈생성</h3>
				<div class="panel panel-default">
					<div class="panel-heading"><h2>프로젝젝트 정보</h2></div>
					<div class="row" style="padding-top: 10px">
					<div class="col-md-7"></div>
				    <!-- 게시물 검색 -->
					<div class="col-md-4 input-group">
						<input type="text" class="form-control content" id="searchcontent" placeholder="프로젝트명">
						<div class="input-group-btn">
							<button type="button" id="searchB" 
							class="btn btn-default dropdown-toggle"
							onclick="searching()">
								검색
							</button>
						</div>
						<!-- /btn-group -->
					</div>
					<!-- ./input-group 프로젝트 검색_end -->
					</div>
					<div class="project_info" style="padding-top: 10px">
					<!-- 프로젝트 정보 표시 start -->
					<div class="panel panel-default">
					
						
						<table class="table">
							<tr>
								<td>프로젝트명 : </td>
								<td>시도새올</td>
							</tr>
							<tr>
								<td>OS명 : </td>
								<td>AIX</td>
							</tr>
							<tr>
								<td>DB명 : </td>
								<td>ORACLE</td>
							</tr>
							<tr>
								<td>고객사 : </td>
								<td>시도새올유지관리사업단</td>
							</tr>
						</table>
					
					</div>
					</div>
					<!-- ./input-group ./row end  -->
					<!-- 프로젝트 정보 표시 end -->
					</div>
					
					<!-- pedding ./row start -->
					<div class="row pedding"></div>
					<!-- pedding ./row end -->
					
					<div class="panel panel-default">
						<div class="panel-heading"><h2>이슈정보 입력</h2></div>
						<!-- issue create start -->
						<%@ include file="../issue/issue_create.jsp" %>
						<!-- issue create end -->
						<div class="form-group" style="padding-bottom: 50pt">
							<div class="col-md-2"></div>
							<div class="col-md-10">
								<button class="btn btn-success btn-lg pull-right" type="submit">이슈 등록</button>
							</div>
						</div>
					</div>
				</div>
				<!-- ./row end -->

			
			</div>
			<!-- ./col-md-9 project_list end -->	
			</div>
			<!--./row end  -->
		</div>
		<!--container end-->
	</div>
	<!-- main-inner end -->
</div>
<!-- main -->

<%@ include file="../template/footer.jsp" %> 
