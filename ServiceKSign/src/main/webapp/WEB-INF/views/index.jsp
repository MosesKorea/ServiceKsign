<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="template/top.jsp" %>
<div class="main">
  <div class="main-inner">
    <div class="container">
      <div class="row">
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="widget">
						<div class="widget-header">
						<i class="icon-align-justify"></i>
						<h3>공지사항</h3>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
						<div class="table-responsive">
					  <table class="table" id="board-table">
					  	<thead>
							<tr>
						    	<th class="board-check">문서번호</th>
						    	<th class="board-no">제목</th>
						    	<th class="board-title">작성자</th>
						    	<th class="board-type">작성일</th>
						    	<th>조회</th>
					    	</tr>
						</thead>
						<tbody>
						<%-- <!-- <%
						for(int i=0;i<boardLists.size();i++){
							/* 
							Board board = (Board)boardLists.get(i);
							System.out.println("board : " + board);
							 */
						}
						%> --> --%>
							<!-- <form name="f">
							<input type="hidden" name="boardCategoryNo" value="${boardCategoryNo}">
							<input type="hidden" name="boardKindNo" value="${boardKindNo}">
							<c:forEach var="board" items="${boardList}">
							<tr>
								<td class="board-check"><input type="checkbox" name="boardNo" value="${board.board_no}"></td>
								<td class="board-no">${board.idx}</td>
								<td class="board-title"><a href="./boardView?boardNo=${board.board_no}&boardCategoryNo=${boardCategoryNo}&boardKindNo=${boardKindNo}">${board.board_title}</a></td>
								<td class="board-type">
								<fmt:formatDate value="${board.board_date}" pattern="yyyy-MM-dd"/>
								</td>
							</tr>
							</c:forEach>
							</form> -->
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
						</tbody>
					  </table>
					</div>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="widget">
						<div class="widget-header">
						<a>내가 등록한 이슈</a>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
						<table class="table" id="board-table">
						<thead>
							<tr>
						    	<th class="board-check">문서번호</th>
						    	<th>현상</th>
						    	<th>모델명</th>
						    	<th class="board-no">채널사</th>
						    	<th class="board-title">고객사</th>
						    	<th class="board-type">제목</th>
						    	<th class="board-type">최종수정일</th>
						    	<th>엔지니어</th>
						    	<th>상태</th>
					    	</tr>
						</thead>
						<tbody>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
						</tbody>
					  </table>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="widget">
						<div class="widget-header">
						<a>채널공지</a>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
					<table class="table" id="board-table">
						<thead>
							<tr>
						    	<th class="board-check">문서번호</th>
						    	<th class="board-no">제목</th>
						    	<th class="board-title">작성자</th>
						    	<th class="board-type">작성일</th>
						    	<th>조회</th>
					    	</tr>
						</thead>
						<tbody>
						<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>0000-00-00</td>
								<td>11</td>
							</tr>
						</tbody>
					  </table>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="widget">
						<div class="widget-header">
						<a>이슈</a>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
						<table class="table" id="board-table">
						<thead>
							<tr>
						    	<th class="board-check">문서번호</th>
						    	<th>현상</th>
						    	<th>모델명</th>
						    	<th class="board-no">채널사</th>
						    	<th class="board-title">고객사</th>
						    	<th class="board-type">제목</th>
						    	<th class="board-type">최종수정일</th>
						    	<th>엔지니어</th>
						    	<th>상태</th>
					    	</tr>
						</thead>
						<tbody>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
							<tr>
								<td>문서번호</td>
								<td>버그</td>
								<td>모델</td>
								<td>채널사</td>
								<td>고갟사</td>
								<td>제목</td>
								<td>0000-00-00</td>
								<td>담당엔지니어</td>
								<td>미해결</td>
							</tr>
						</tbody>
					  </table>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12">
					<div class="widget">
						<div class="widget-header">
						<a>지식공유</a>
						</div>
						<!-- /.widget-header -->
						<div class="widget-content">
						<table class="table" id="board-table">
						<thead>
							<tr>
						    	<th class="board-check">게시판명</th>
						    	<th class="board-no">문서번호</th>
						    	<th class="board-title">제목</th>
						    </tr>
						</thead>
						<tbody>
							<tr>
								<td>보안제품</td>
								<td>0000</td>
								<td>릴리즈 업데이트</td>
							</tr>
							<tr>
								<td>SSO제품</td>
								<td>0200</td>
								<td>메뉴얼</td>
							</tr>
							<tr>
								<td>보안제품</td>
								<td>0000</td>
								<td>릴리즈 업데이트</td>
							</tr>
							<tr>
								<td>SSO제품</td>
								<td>0200</td>
								<td>메뉴얼</td>
							</tr>
						</tbody>
					  </table>
						</div>
						<!-- /.widget-content -->
					</div>
					<!-- /.widget -->
				</div>
			</div>
			<!-- /.row -->
      </div>
      <!-- /row --> 
    </div>
    <!-- /container --> 
  </div>
  <!-- /main-inner --> 
</div>
<%@ include file="template/footer.jsp" %>     		
