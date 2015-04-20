<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-xs-12">
	<div class="col-md-12">
		<h3>Step 1. 고객사 정보 입력</h3>
		<div class="form-group">
			<div class="col-md-1 col-xs-1"></div>
			<div class="col-md-4 col-xs-4">
				<label class="control-label">기존고객</label> <input type="radio"
					required="required" class="old_customer"
					placeholder="Enter First Name" /> <label class="control-label">신규고객</label>
				<input type="radio" required="required" class="new_customer"
					placeholder="Enter First Name" />
			</div>
			<div class="col-md-5 col-xs-5"></div>
			<div class="col-md-2 col-xs-2">
				<button class="btn btn-primary" type="button" onclick="">고객
					검색</button>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px"></div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">고객구분</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="고객구분" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">고객명(site명)</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="site명" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">부서명</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="부서병" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">담당자</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="담당자" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">연락처(Office)</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="사무실 연락처" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">연락처(PㆍH)</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="핸드폰 연락처" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 col-xs-2">
				<label class="control-label">E-mail</label>
			</div>
			<div class="col-md-10 col-xs-10">
				<input maxlength="100" type="text" required="required"
					class="form-control" placeholder="E-mail" />
			</div>
		</div>
		<div class="row" style="padding-top: 10px; padding-bottom: 30px">
			<button class="btn btn-success btn-lg pull-right" type="submit">Finish!</button>
		</div>
	</div>
</div>