<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template/top.jsp" %>
<div class="main">
  <div class="main-inner">
    <div class="container">
      <div class="row">
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					
						<!-- 프로젝트 리스트  start-->
						<%@ include file="./project/project_list_view.jsp" %>
						<!-- 프로젝트 리스트  end-->
					
					
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
				
					
						<!-- /.widget-header -->
						
							<%@ include file="./issue/issue_list.jsp" %>
						
				</div>
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<%@ include file="./maintance/mantance_list.jsp" %>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="widget">
						<div class="widget-header">
						<a>이슈</a>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
						<table class="table" id="board-table">
						<thead>
							<tr>
						    	<th class="board-check">문서번호</th>
						    	<th>현상</th>
						    	<th>모델명</th>
						    	<th class="board-no">채널사</th>
						    	<th class="board-title">고객사</th>
						    	<th class="board-type">제목</th>
						    	<th class="board-type">최종수정일</th>
						    	<th>엔지니어</th>
						    	<th>상태</th>
					    	</tr>
						</thead>
						<tbody>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
						</tbody>
					  </table>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12">
					
						 	<%@ include file="./product/product_list.jsp" %>
						
					
				</div>
			</div>
			<!-- /.row -->
      </div>
      <!-- /row --> 
    </div>
    <!-- /container --> 
  </div>
  <!-- /main-inner --> 
</div>
<%@ include file="template/footer.jsp" %>     		
