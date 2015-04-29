<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>
<link href="resources/css/project/project_create.css" rel="stylesheet">

<div class="main">
	<div class="main-inner">
		<div class="container">
			<div class="row">

			<%@ include file="product_left_list.jsp" %>

			<div class="col-md-1"></div>
			<div class="col-md-9">
					<div class="panel panel-default">
					<div class="panel-heading"><h2>제품 등록</h2></div>
						<!-- Default panel contents -->
						<div class="row" style="padding-bottom: 50pt">
						<form role="form">
						
								<div class="col-xs-12">
									<div class="col-md-12">
										<div class="form-group" style="padding-bottom: 30px"></div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">분류</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="분류" />
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">제품명</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="제품명" />
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">버전</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="1.5.0.0.0.0" />
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">비고</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="비고" />
											</div>
										</div>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-success btn-lg pull-right" type="submit">제품 등록</button>
										</div>
									</div>
								</div>
							
						</form>
						<!-- ./form end -->
						</div>
						<!-- ./row end -->
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