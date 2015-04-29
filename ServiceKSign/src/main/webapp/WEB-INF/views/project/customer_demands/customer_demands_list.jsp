<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


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
	<!-- 요구사항 paging_list end  -->


</div>
<!-- .row 게시물 목록 리스트2 목록 end-->