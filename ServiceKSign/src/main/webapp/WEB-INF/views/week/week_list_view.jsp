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
			
			<%@ include file="./week_left_list.jsp" %>

            <!-- /.col-md-3 왼쪽사이드 메뉴  end-->
			<div class="col-md-1"></div>
			<div class="col-md-9">
				<div class="row">
					<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
				    <!-- 게시물 검색 -->
					<div class="col-md-4 input-group">
						<input type="text" class="form-control content" id="searchcontent">
						<div class="input-group-btn">
							<button type="button" id="searchB" 
							class="btn btn-default dropdown-toggle"
							onclick="searching()">
								검색
							</button>
						</div>
						<!-- /btn-group -->
					</div>
					<!-- ./input-group 게시물검색_end -->
					</div>
					<!-- ./input-group ./row end  -->
					<div class="row pedding"></div>
					<!-- pedding ./row end -->

					<%@ include file="./week_list.jsp" %>
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
