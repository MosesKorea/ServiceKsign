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
					
					<!-- 설치환경 리스트 start -->
					<%@ include file="./equioment/equioment_list.jsp" %>
					<!-- 설치환경 리스트 end -->
					
					<!-- 요구사항 리스트 start -->	
					<%@ include file="./customer_demands/customer_demands_list.jsp" %>
					<!-- 요구사항 리스트 end -->
					
					<!-- 이슈 리스트 start -->
					<%@ include file="../issue/issue_list.jsp" %>
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