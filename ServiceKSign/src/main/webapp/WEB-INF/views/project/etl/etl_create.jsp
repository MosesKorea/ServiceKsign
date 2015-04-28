<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="form-group">
	<div class="col-md-10 "></div>
	<div class="col-md-2 ">
		<button class="btn btn-primary" type="button" onclick="">암호화컬럼 추가</button>
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<a style="visibility: hidden;"><input type="text" value="작성"></a>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">서비스명</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="서비스명" name="etl_service" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">스키마명</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="스키마명" name="etl_schema" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">테이블명</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="테이블명" name="etl_table" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">테이블설명</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="테이블 설명" name="etl_yable_info" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">건수</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="암호화 건수" name="etl_count" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">컬럼</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="컬럼" name="etl_calumn" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">컬럼 설명</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="컬럼 설명" name="etl_calumn_info" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">타입</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="컬럼 타입" name="etl_type" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">컬럼 길이</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="컬럼 길이" name="etl_length" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">PK</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="PK" name="etl_pk" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">FK</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="FK" name="etl_fk" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">비고</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="비고" name="etl_other" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">POLICY</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="POLICY" name="etl_policy" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">TRIGGER</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="TRIGGER" name="etl_trigger" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">VIEW</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="VIEW 유무" name="etl_mview" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">기암호화</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="기 암호화" name="etl_h_encrypt" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">복수함수</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="복수함수" name="etl_pfuntion" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">구분컬럼</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="구분컬럼" name="etl_devisioncalumn" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">SELECT</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="SELECT" name="etl_select" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">FROM</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="FROM" name="etl_from" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">WHERE</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="WHERE" name="etl_where" />
	</div>
</div>
<div class="form-group" style="padding-bottom: 30px">
	<div class="col-md-2 ">
		<label class="control-label">HINT</label>
	</div>
	<div class="col-md-10 ">
		<input type="text" required="required" class="form-control"
			placeholder="HINT" name="etl_hint" />
	</div>
</div>
<!-- 입력완료 -->