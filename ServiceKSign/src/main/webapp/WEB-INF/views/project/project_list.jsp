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
			<!--왼쪽 목록  메뉴 -->
			<div class="col-md-2 left_list">
				<div class="panel panel-default">
				<div class="panel-heading">네비게이션 제목</div>	
					<ul class="nav nav-pills nav-stacked">
						<li role="presentation" class="active"><a href="#">메뉴1</a></li>
						<li role="presentation"><a href="#">메뉴2</a></li>
						<li role="presentation"><a href="#">메뉴3</a></li>
						<li role="presentation"><a href="#">메뉴4</a></li>
						<li role="presentation"><a href="#">메뉴5</a></li>
					</ul>
				</div>
            </div>
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

						<div class="project_list">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading"><h3>Project List</h3></div>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<td>1</td>
										<td>2</td>
										<td>3</td>
										<td>4</td>
										<td>5</td>
									</tr>
								</thead>
								<tbody>
	                <%-- <c:forEach var="project" items="${projectList }"> --%>
									<tr>
										<td>1</td>
										<td>2</td>
										<td>3</td>
										<td>4</td>
										<td>5</td>
									</tr>
					<%-- </c:forEach>  --%>
								</tbody>
							</table>
						</div>


					
                </div>
				<!-- .row 게시물 목록 리스트 목록 end-->
				<!-- pagination paging_list start -->
				<div class="pagingDiv">
					<ul class="pagination">
					<%-- 
						  	<%
							if(mainImageListPage.isShowFirst()){
							%>	
						  	<li><a href="./productList?categoryNo=${categoryNo }&pageNo=1">««</a></li>
						  	<%
							}
							<%
							if(productListPage.isShowPreviousGroup()){
							%>
						  		<li><a href="./productList?categoryNo=${categoryNo }&pageNo=<%=productListPage.getPreviousGroupStartPageNo()%>">«</a></li>
						  	<%
						  	}
						 	for (int i = productListPage.getStartPageNo();i<=productListPage.getEndPageNo() ; i++) {
						
								if(productListPage.getSelectPageNo()==i){
								%>			
									<li><a href="#" class="active"><%=i%></a></li>
								<%	
								}else{
								%>
									<li><a href="./productList?categoryNo=${categoryNo }&pageNo=<%=i%>"><%=i%></a></li>
								<%
								}
							}
							if(productListPage.isShowNextGroup()){
							 %>
						  		<li><a href="./productList?categoryNo=${categoryNo }&pageNo=<%=productListPage.getNextGroupStartPageNo() %>" >»</a></li>
						  	<%
							}
							%>
							<%-- 
							if(mainImageListPage.isShowLast()){
							%>	
						  	<li><a href="./productList?categoryNo=${categoryNo }&pageNo=<%=mainImageListPage.getPageCount()%>">»»</a></li>
						  	<%
							}
							%>

							 --%>
					</ul>
				</div>
				<!-- paging_list end  -->
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