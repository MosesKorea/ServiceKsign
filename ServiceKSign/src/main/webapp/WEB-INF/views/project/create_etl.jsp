<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="col-xs-12">
	<div class="col-md-12">
		<h3>Step 3. 암호화 컬럼 정보 입력</h3>
		<div class="form-group">
			<div class="col-md-10 "></div>
			<div class="col-md-2 ">
				<button class="btn btn-primary" type="button" onclick="">암호화 컬럼 추가</button>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px"><a style="visibility: hidden;"><input type="text" value="작성"></a></div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">서비스명</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="서비스명" name="etl_service" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">스키마명</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="스키마명" name="etl_business" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">DB수량</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="DB수량" name="etl_dbcount"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">OS</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="OS name" name="etl_os"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">HOSTNAME</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="HOSTNAME" name="etl_hostname"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">IP</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="IP" name="etl_IP"/>
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">PORT</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="PORT" name="etl_port" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">SID</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="hostname" name="etl_hostname" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">OS ID</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="OS ID" name="etl_osid" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">OS PASSWORD</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="OS PASSWORD" name="etl_ospw" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">DB ID</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="DB ID" name="etl_dbid" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">DB PASSWORD</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="DB PASSWORD" name="etl_dbpw" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">SERVER VERSION</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="SERVER VERSION" name="etl_server" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">FILTER VERSION</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="FILTER VERSION" name="etl_filter" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">AGENT VERSION</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="AGENT VERSION" name="etl_encryptor" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">INSTALL PATH</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="INSTALL PATH" name="etl_installpath" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">적용방식</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="적용방식(예: UDF, VIEW, API)" name="etl_applicationmethod" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">세부사항</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="세부사항" name="etl_details" />
			</div>
		</div>
		<div class="form-group" style="padding-bottom: 30px">
			<div class="col-md-2 ">
				<label class="control-label">기타</label>
			</div>
			<div class="col-md-10 ">
				<input maxlength="100" type="text" required="required" class="form-control" placeholder="기타" name="etl_other" />
			</div>
		</div>
		<!-- 입력완료 -->
		<div class="row" style="padding-top: 10px; padding-bottom: 30px">
			<button class="btn btn-primary nextBtn btn-lg pull-right" type="button">Next</button>
		</div>
	</div>
</div>