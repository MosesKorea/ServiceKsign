<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="project_table1">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<div class="row">
				<div class="col-md-10" >
					<h2>이슈 목록</h2>
				</div>
				<div class="col-md-2" >
					<a href="./issueCreate">
					<button type="button" class="btn btn-primary create_issue" id="create_issue">이슈 생성</button></a>
				</div>
			</div>
		</div>

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
<!-- 이슈 paging_list end  -->