<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


		<!-- 환경 설정 리스트 Table -->
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

<!-- .row 설치환경 정보 게시물 목록 리스트1 목록 end-->

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
<!-- 설치환경 paging_list end  -->
