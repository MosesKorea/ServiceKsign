<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../template/top.jsp" %>
<!-- top page include -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="main">
	<div class="main-inner">
		<div class="container">
			<!--왼쪽 목록  메뉴 -->
			<div class="col-md-3 left_list">

				<div class="nav-side-menu">
					<div class="brand">Brand Logo</div>
					<i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

					<div class="menu-list">

						<ul id="menu-content" class="menu-content collapse out">
							<li><a href="#"> <i class="fa fa-dashboard fa-lg"></i>Dashboard</a></li>

							<li data-toggle="collapse" data-target="#products"
								class="collapsed active"><a href="#"><i
									class="fa fa-gift fa-lg"></i> UI Elements <span class="arrow"></span></a>
							</li>
							<ul class="sub-menu collapse" id="products">
								<li class="active"><a href="#">CSS3 Animation</a></li>
								<li><a href="#">General</a></li>
								<li><a href="#">Buttons</a></li>
								<li><a href="#">Tabs & Accordions</a></li>
								<li><a href="#">Typography</a></li>
								<li><a href="#">FontAwesome</a></li>
								<li><a href="#">Slider</a></li>
								<li><a href="#">Panels</a></li>
								<li><a href="#">Widgets</a></li>
								<li><a href="#">Bootstrap Model</a></li>
							</ul>


							<li data-toggle="collapse" data-target="#service"
								class="collapsed"><a href="#"><i
									class="fa fa-globe fa-lg"></i> Services <span class="arrow"></span></a>
							</li>
							<ul class="sub-menu collapse" id="service">
								<li>New Service 1</li>
								<li>New Service 2</li>
								<li>New Service 3</li>
							</ul>


							<li data-toggle="collapse" data-target="#new" class="collapsed">
								<a href="#"><i class="fa fa-car fa-lg"></i> New <span
									class="arrow"></span></a>
							</li>
							<ul class="sub-menu collapse" id="new">
								<li>New New 1</li>
								<li>New New 2</li>
								<li>New New 3</li>
							</ul>


							<li><a href="#"> <i class="fa fa-user fa-lg"></i>
									Profile
							</a></li>

							<li><a href="#"> <i class="fa fa-users fa-lg"></i> Users
							</a></li>
						</ul>
					</div>
				</div>
				<%-- 
            	<p class="lead">${bigCategoryName}</p>
            	<c:forEach var="categoryEntry" items="${leftCategoryMap}">
         		<div class="panel panel-default left-menu">
	                <div class="panel-heading">
	                    <h2 class="panel-title">${categoryEntry.key}</h2>
	                    <span class="pull-right clickable"><i class="glyphicon glyphicon-minus"></i></span>
	                </div>
	                <div class="panel-body list-group <c:if test="${midCategoryName==categoryEntry.key}">clicked</c:if>">
	                <c:forEach var="category" items="${categoryEntry.value}">
	                   	<a href="./productList?categoryNo=${category.product_category_no }&pageNo=" class="list-group-item">${category.product_category_name}</a>
	                </c:forEach>
	                </div>
	            </div>
	            </c:forEach> --%>
	                     
            </div>
            <!-- /.col-md-3 왼쪽사이드 메뉴  end-->
			
			<div class="col-md-9 project_list">
				<div class="row">

	                <%-- <c:forEach var="project" items="${projectList }"> --%>

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
									<tr>
										<td>1</td>
										<td>2</td>
										<td>3</td>
										<td>4</td>
										<td>5</td>
									</tr>
								</tbody>
							</table>
						</div>

					<%-- </c:forEach>  --%>

					
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

				    <!-- 게시물 검색 -->
					<div class="input-group">
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
					<!-- /input-group 게시물검색_end -->

			</div>
			<!-- ./col-md-9 project_list end -->	
		</div>
		<!--container end-->
	</div>
	<!-- main-inner end -->
</div>
<!-- main -->

<%@ include file="../template/footer.jsp" %> 