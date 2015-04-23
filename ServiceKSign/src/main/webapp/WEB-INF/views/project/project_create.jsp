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
								<div class="col-xs-12">
									<div class="col-md-12">
										<h3>Step 1. 고객사 정보 입력</h3>
										<div class="form-group">
											<div class="col-md-1 "></div>
											<div class="col-md-4">
												<label class="control-label">기존고객</label> <input type="radio"
													required="required" class="old_customer"
													placeholder="Enter First Name" /> <label class="control-label">신규고객</label>
												<input type="radio" required="required" class="new_customer"
													placeholder="Enter First Name" />
											</div>
											<div class="col-md-5"><a style="visibility: hidden;"><input type="text" value="작성"></a></div>
											<div class="col-md-2">
												<button class="btn btn-primary" type="button" onclick="">고객 검색</button>
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px"></div>
										<!-- 고객정보 입력 -->
										<%@ include file="./customer/customer_create.jsp" %>
										<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" value="sss"/></div>
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-primary nextBtn btn-lg pull-right"
												type="button">Next</button>
										</div>
									</div>
								</div>
							</div>
							<div class="row setup-content" id="step-2">
							<div class="col-xs-12">
								<div class="col-md-12">
									<h3>Step 2. 고객사 설치환경 입력</h3>
										<!-- 고객장비 환경 & 설치 정보 입력 -->
										<%@ include file="./equioment/equioment_list.jsp" %>
										<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" value="sss"/></div>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-primary nextBtn btn-lg pull-right" type="button">Next</button>
										</div>
									</div>
								</div>
							</div>
							<div class="row setup-content" id="step-3">
								<div class="col-xs-12">
									<div class="col-md-12">
										<h3>Step 3. 고객사 암호화컬럼 입력</h3>
		
										<!-- 고객 요구사항 입력 -->
										<%@ include file="./etl/etl_list.jsp" %>
										<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" value="sss"/></div>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-primary nextBtn btn-lg pull-right" type="button">Next</button>
										</div>
									</div>
								</div>
							</div>
							<div class="row setup-content" id="step-4">
								<div class="col-xs-12">
									<div class="col-md-12">
										<h3>Step 4. 고객 요구사항 입력</h3>
		
										<!-- 입력정보 확인 -->
										<%@ include file="./customer_demands/customer_demands_list.jsp" %>
										<div style="visibility: hidden;"><input  type="text" required="required" class="form-control" placeholder="넘기기" value="sss"/></div>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-success btn-lg pull-right" type="submit">프로젝트 등록</button>
										</div>
									</div>
								</div>
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