<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>
<link href="resources/css/project/project_create.css" rel="stylesheet">

<div class="main">
	<div class="main-inner">
		<div class="container">
			<div class="row">
			
			
			<%@ include file="week_left_list.jsp" %>
			<div class="col-md-1"></div>
			<div class="col-md-9">
					<div class="panel panel-default">
					<div class="panel-heading"><h2>주간업무 생성</h2></div>
						<!-- Default panel contents -->
						<div class="row" style="padding-bottom: 50pt">
						<form role="form">
						
								<div class="col-xs-12">
									<div class="col-md-12">
										<div class="form-group" style="padding-bottom: 30px"></div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">고객명(site명)</label>
											</div>
											<div class="col-md-4">
												<input type="text" required="required" class="form-control"
													placeholder="site명" name="" value=""/>
											</div>
											<div class="col-md-2">
												<label class="control-label">작성자</label>
											</div>
											<div class="col-md-4">
												<input type="text" required="required" class="form-control"
													placeholder="작성자" name="" value=""/>
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">시작일</label>
											</div>
											<div class="col-md-4">
												<input type="text" required="required" class="form-control"
													placeholder="2015.00.00" name="" value=""/>
											</div>
											<div class="col-md-2">
												<label class="control-label">완료예정일</label>
											</div>
											<div class="col-md-4">
												<input type="text" required="required" class="form-control"
													placeholder="2015.00.00" name="" value=""/>
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">업무내용</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="업무내용" name="" value=""/>
											</div>
										</div>
										<div class="form-group" style="padding-bottom: 30px">
											<div class="col-md-2">
												<label class="control-label">비고</label>
											</div>
											<div class="col-md-10">
												<input type="text" required="required" class="form-control"
													placeholder="비고" name="" value=""/>
											</div>
										</div>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-success btn-lg pull-right" type="submit">프로젝트 등록</button>
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