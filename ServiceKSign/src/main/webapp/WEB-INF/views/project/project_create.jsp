<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>
<link href="resources/css/project/project_create.css" rel="stylesheet">

<div class="main">
	<div class="main-inner">
		<div class="container">
			<div class="row">
			
			
			<%@ include file="project_left_list.jsp" %>
			<div class="col-md-1"></div>
			<div class="col-md-9">
					<div class="panel panel-default">
					<div class="panel-heading"><h2>프로젝젝트 생성</h2></div>
						<!-- Default panel contents -->
						<div class="row" style="padding-bottom: 50pt">
						</div>
						<div class="stepwizard">
							<div class="stepwizard-row setup-panel">
								<div class="stepwizard-step">
									<a href="#step-1" type="button" class="btn btn-primary btn-circle">1</a>
									<p>고객사 정보 입력</p>
								</div>
								<div class="stepwizard-step">
									<a href="#step-2" type="button"	class="btn btn-default btn-circle" disabled="disabled">2</a>
									<p>설치환경 정보 입력</p>
								</div>
								<div class="stepwizard-step">
									<a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">3</a>
									<p>암호화 컬럼 정보 입력</p>
								</div>
								<div class="stepwizard-step">
									<a href="#step-4" type="button" class="btn btn-default btn-circle" disabled="disabled">4</a>
									<p>요구사항 정보 입력</p>
								</div>
							</div>
						</div>
						<form role="form">
							<div class="row setup-content" id="step-1">
								<!-- 고객정보 입력 -->
								<%@ include file="./create_customer.jsp" %>
								<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" /></div>
							</div>
							<div class="row setup-content" id="step-2">
								<!-- 고객장비 환경 & 설치 정보 입력 -->
								<%@ include file="./create_equioment.jsp" %>
								<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" /></div>
							</div>
							<div class="row setup-content" id="step-3">
								<!-- 고객 요구사항 입력 -->
								<%@ include file="./create_etl.jsp" %>
								<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" /></div>
							</div>
							<div class="row setup-content" id="step-4">
								<!-- 입력정보 확인 -->
								<%@ include file="./create_customer_demands.jsp" %>
								<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" /></div>
							</div>
						</form>
						<!-- ./form end -->
					</div>
					<!-- ./panel end -->
			</div>
			<!-- ./col-md-9 end -->
			</div>
			<!-- ./row end -->`
		</div>
		<!-- ./container end -->
	</div>
	<!-- ./main-inner end -->
</div>
<!-- ./main end -->
<script type="text/javascript" src="resources/js/project/project_create.js"></script>

<%@ include file="../template/footer.jsp" %>