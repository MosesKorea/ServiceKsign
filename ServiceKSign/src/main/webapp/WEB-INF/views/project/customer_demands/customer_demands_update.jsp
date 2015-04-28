<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/top.jsp" %>
<link href="resources/css/project/project_create.css" rel="stylesheet">

<div class="main">
	<div class="main-inner">
		<div class="container">
			<div class="row">


				<%@ include file="customer_demands_left_list.jsp"%>
				<div class="col-md-1"></div>
				<div class="col-md-9">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3>고객 요구 정보 수정</h3>
						</div>
						<form role="form">
							<div class="row">
								<div class="col-xs-12">
									<div class="col-md-12">
										
										
										<%@ include file="./customer_demands_create.jsp"%>
										<!-- 입력완료 -->
										<div class="row" style="padding-top: 10px; padding-bottom: 30px">
											<button class="btn btn-success btn-lg pull-right" type="submit">고객 요구 수정</button>
										</div>
									</div>
									<!-- ./col-md-12 end -->
								</div>
								<!-- ./col-xs-12 end -->
							</div>
							<!-- ./row end -->
						</form>
						<!-- ./form end -->
					</div>
					<!-- ./panel end -->
				</div>
				<!-- ./col-md-9 end -->
			</div>
			<!-- ./row end -->
		</div>
		<!-- ./container end -->
	</div>
	<!-- ./main-inner end -->
</div>
<!-- ./main end -->
<%@ include file="../../template/footer.jsp" %>