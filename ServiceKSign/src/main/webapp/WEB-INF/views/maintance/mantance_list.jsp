<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="list">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<h3>유지보수 List</h3>
		</div>

		<!-- Table -->
		<table class="table">
			<thead>
				<tr>
					<td>사이트명</td>
					<td>고객구분</td>
					<td>고객사</td>
					<td>담당영업</td>
					<td>유지보수기간</td>
					<td>이슈건수</td>
				</tr>
			</thead>
			<tbody>
				<%-- <c:forEach var="project" items="${projectList }"> --%>
				<tr>
					<td><a href="./maintanceView">환화생명</a></td>
					<td>금융</td>
					<td>환화생명</td>
					<td></td>
					<td>2015-12-31</td>
					<td>10</td>
				</tr>
				<tr>
					<td><a href="./maintanceView">시도새올</a></td>
					<td>공공</td>
					<td>시도새올유지사업단</td>
					<td>김동철 차장</td>
					<td>2015-12-31</td>
					<td>100</td>
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