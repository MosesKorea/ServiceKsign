<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="project_table1">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<div class="row">
				<div class="col-md-10" >
					<h3>암호화 컬럼 리스트</h3>
				</div>
				<div class="col-md-2" >
					<button type="button" class="btn btn-primary create_issue">암호화 컬럼 추가</button>
				</div>
			</div>
		</div>

		<!-- Table -->
		<table class="table">
			<thead>
				<tr>
					<td>NO</td>
					<td>서비스명</td>
					<td>테이블명</td>
					<td>건수</td>
					<td>컬럼</td>
					<td>타입</td>
					<td>컬럼길이</td>
					<td>PK</td>
					<td>FK</td>
					<td>POLICY</td>
					<td>TRIGGER</td>
					<td>VIEW</td>
				</tr>
			</thead>
			<tbody>
				<%-- <c:forEach var="project" items="${projectList }"> --%>
				<tr>
					<td>1</td>
					<td>회원가입</td>
					<td>join_user</td>
					<td>100000</td>
					<td>jumin</td>
					<td>VARCHAR2</td>
					<td>31</td>
					<td>X</td>
					<td>X</td>
					<td>P0009</td>
					<td>X</td>
					<td>X</td>
				</tr>
				<%-- </c:forEach>  --%>
			</tbody>
		</table>
	</div>



</div>
<!-- 암호화컬럼 리스트 end-->
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
<!-- 암호화컬럼 paging_list end  -->