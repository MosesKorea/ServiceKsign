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
					<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
				    
					</div>
					<!-- ./input-group ./row end  -->
					<div class="row pedding"></div>
					<!-- pedding ./row end -->
					
					
					<!-- 설치환경 리스트  start -->
					<div class="row">
					<div class="project_table1">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								<div class="row">
									<div class="col-md-10">
										<h3>설치환경 정보</h3>
									</div>
									<div class="col-md-2">
										<button type="button" class="btn btn-primary create_issue">설치 환경 추가</button>
									</div>
								</div>
							</div>
					<%@ include file="./equioment/equioment_list.jsp" %>
						</div>
					</div>
					</div>
					<!-- 설치환경 리스트 end -->
					
					<!-- 요구사항 리스트 start -->
					<div class="row">
					<div class="project_table1">
						<div class="panel panel-default">
						<!-- Default panel contents -->
						<div class="panel-heading">
							<div class="row">
								<div class="col-md-10" >
									<h3>요구사항</h3>
								</div>
								<div class="col-md-2" >
									<button type="button" class="btn btn-primary create_issue">요구사항 추가</button>
								</div>
							</div>
						</div>
					<%@ include file="./customer_demands/customer_demands_list.jsp" %>
						</div>
					</div>
					</div>	
					<!-- 요구사항 리스트 end -->
					
					<!-- 이슈 리스트 start -->
					<div class="row">
					<div class="project_table1">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								<div class="row">
									<div class="col-md-10" >
										<h3>암호화 컬럼 리스트</h3>
									</div>
									<div class="col-md-2" >
										<button type="button" class="btn btn-primary create_issue">암호화 컬럼 추가</button>
									</div>
								</div>
							</div>
					<%@ include file="../issue/issue_list.jsp" %>
						</div>
					</div>
					</div>
					<!-- 이슈 리스트 end -->
			</div>

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