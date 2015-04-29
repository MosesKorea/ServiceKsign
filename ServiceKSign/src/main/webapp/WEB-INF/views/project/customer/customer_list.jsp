<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<td>고객구분</td>
										<td>고객명(site명)</td>
										<td>담당자</td>
										<td>Office</td>
										<td>PㆍH</td>
										<td>E-Mail</td>
									</tr>
								</thead>
								<tbody>
	               			 <%-- <c:forEach var="project" items="${projectList }"> --%>
									<tr>
										<td><a href="./customerView">금융</a></td>
										<td>환화생명</td>
										<td>OOO</td>
										<td>02-0000-0000</td>
										<td>010-0000-0000</td>
										<td>OOO@hanhwa.com</td>
									</tr>
									<tr>
										<td><a href="./customerView">공공</a></td>
										<td>시도새올</td>
										<td>OOO</td>
										<td>02-0000-0000</td>
										<td>010-0000-0000</td>
										<td>OOO@korea.kr</td>
									</tr>
							<%-- </c:forEach>  --%>
								</tbody>
							</table>
						
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