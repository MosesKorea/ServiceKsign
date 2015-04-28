<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-xs-12">
	<div class="col-md-12">
		<h3>Step 4. 고객사 요구정보 입력</h3>
		<div class="form-group">
			<div class="col-md-10 "></div>
			<div class="col-md-2 ">
				<button class="btn btn-primary" type="button" onclick="">고객
					검색</button>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px"></div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">요구사항 목록</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="요구사항 타입" value="" name="de_type"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">요구사항명</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="요구사항명" name="de_name" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">처리내용</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="처리내용" name="de_procese"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">분류</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="분류" name="de_class"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">중요도</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="중요도" name="de_status"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">난이도</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="난이도" name="de_level"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">수용여부</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="수용여부" name="de_accommodation"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">출처</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="출처" name="de_provenance"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">비고</label>
			</div>
			<div class="col-md-10 ">
				<input  type="text" required="required"
					class="form-control" placeholder="비고" name="de_note"/>
			</div>
		</div>
		<div class="row" style="padding-top: 10px; padding-bottom: 30px">
			<button class="btn btn-success btn-lg pull-right" type="submit">Finish!</button>
		</div>
	</div>
</div>