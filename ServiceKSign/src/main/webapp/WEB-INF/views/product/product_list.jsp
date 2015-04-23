<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
<div class="row">
	<div class="customer-info-div center-block">
		<div class="col-xs-6 col-sm-3">사이트명 :</div>
		<div class="col-xs-6 col-sm-3">특허청</div>
		<div class="col-xs-6 col-sm-3">제품명 :</div>
		<div class="col-xs-6 col-sm-3">EDMS</div>
	</div>
	<div class="customer-info-div center-block">
		<div class="col-xs-6 col-sm-3">사이트명 :</div>
		<div class="col-xs-6 col-sm-3">특허청</div>
		<div class="col-xs-6 col-sm-3">제품명 :</div>
		<div class="col-xs-6 col-sm-3">EDMS</div>
	</div>
	<div class="customer-info-div center-block">
		<div class="col-xs-6 col-sm-3">사이트명 :</div>
		<div class="col-xs-6 col-sm-3">특허청</div>
		<div class="col-xs-6 col-sm-3">제품명 :</div>
		<div class="col-xs-6 col-sm-3">EDMS</div>
	</div>
	<div class="customer-info-div center-block">
		<div class="col-xs-6 col-sm-3">사이트명 :</div>
		<div class="col-xs-6 col-sm-3">특허청</div>
		<div class="col-xs-6 col-sm-3">제품명 :</div>
		<div class="col-xs-6 col-sm-3">EDMS</div>
	</div>
</div>
 -->
<div class="project_table1">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<div class="row">
				<div class="col-md-10" >
					<h2>제품 목록</h2>
				</div>
				<div class="col-md-2" >
					<button type="button" class="btn btn-primary create_issue">제품 등록</button>
				</div>
			</div>
		</div>

		<!-- Table -->
		<table class="table">
			<thead>
				<tr>
					<td>NO</td>
					<td>제품분류</td>
					<td>제품명</td>
					<td>버전</td>
					<td>등록일</td>
				</tr>
			</thead>
			<tbody>
				<%-- <c:forEach var="project" items="${projectList }"> --%>
				<tr>
					<td>1</td>
					<td>Server</td>
					<td>SDBServer.jar</td>
					<td>1.5.0.0.1</td>
					<td>2014.12.11</td>
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
<!-- 이슈 paging_list end  -->