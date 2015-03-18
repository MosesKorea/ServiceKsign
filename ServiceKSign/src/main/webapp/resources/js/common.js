function ajaxSubmit(object){//alert(JSON.stringify(object.param));
	$.ajax({
		type : "POST" ,
		url : "securedb.do",
		dataType : "json" ,
		data : {"reqParams" : JSON.stringify(object.param)} ,
		success : function(data, status, xhr){
			if(data.errorCd == "1"){
				alert(data.errorMsg);
			}else{
				object.callback(data);
			}
		} ,
		error : function(xhr, status, thrown){
			alert(status);
		}
	});
}