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

					<div class="project_table1">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading"><h3>프로젝트 설치환경 정보</h3></div>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<td>NO</td>
										<td>장비타입</td>
										<td>업무범위</td>
										<td>DB수량</td>
										<td>OS</td>
										<td>HOSTNAME</td>
										<td>IP</td>
										<td>PORT</td>
										<td>SID</td>
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
				<!-- .row 게시물 목록 리스트1 목록 end-->
				<div class="project_table1">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading"><h3>프로젝트 요구사항</h3></div>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<td>NO</td>
										<td>요구사항 명</td>
										<td>분류</td>
										<td>중요도</td>
										<td>난이도</td>
										<td>수용여부</td>
										<td>출처</td>
										<td>비고</td>
									</tr>
								</thead>
								<tbody>
	               			 <%-- <c:forEach var="project" items="${projectList }"> --%>
									<tr>
										<td>1</td>
										<td>2</td>
										<td>4</td>
										<td>5</td>
										<td>6</td>
										<td>3</td>
										<td>4</td>
										<td>5</td>
									</tr>
							<%-- </c:forEach>  --%>
								</tbody>
							</table>
						</div>
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
				<!-- .row 게시물 목록 리스트2 목록 end-->
				<div class="project_table1">
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading"><h3>프로젝트 이슈 목록</h3></div>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<td>NO</td>
										<td>내용</td>
										<td>문제점</td>
										<td>방안</td>
										<td>최종발견일</td>
										<td>완료예정일</td>
										<td>상태</td>
									</tr>
								</thead>
								<tbody>
	               			 <%-- <c:forEach var="project" items="${projectList }"> --%>
									<tr>
										<td>1</td>
										<td>이슈처리</td>
										<td>HW문제</td>
										<td>HW 교체</td>
										<td>2014.12.11</td>
										<td>2015.01.15</td>
										<td>처리중</td>
									</tr>
							<%-- </c:forEach>  --%>
								</tbody>
							</table>
						</div>


					
                </div>
				<!-- .row 게시물 목록 리스트3 목록 end-->
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