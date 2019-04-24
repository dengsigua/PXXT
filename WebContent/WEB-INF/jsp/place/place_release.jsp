<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js1/select-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>  

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/icon.css">
	<!--  <link rel="stylesheet" type="text/css" href="https://www.jeasyui.com/easyui/themes/color.css">--> 
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/demo/demo.css">	
	<!--  <script type="text/javascript" src="https://code.jquery.com/jquery-1.9.1.min.js"></script>-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>


<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});

</script>

</head>
<script type="text/javascript">
var editor;
KindEditor.ready(function(K) {
    editor = K.create('#placeContent', {
    	allowFileManager:true,
    
    items:['source', '|', 'undo', 'redo', '|', 'preview', 'print', 'template', 'code', 'cut', 'copy', 'paste',
		'plainpaste', 'wordpaste', '|', 'justifyleft', 'justifycenter', 'justifyright',
		'justifyfull', 'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent', 'subscript',
		'superscript', 'clearhtml', 'quickformat', 'selectall', '|', 'fullscreen', '/',
		'formatblock', 'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold',
		'italic', 'underline', 'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'multiimage',
		'flash', 'media', 'insertfile', 'table', 'hr', 'emoticons', 'baidumap', 'pagebreak',
		'anchor', 'link', 'unlink', '|', 'about']
    });
   
  //  var value_content = $("#newsDesc").val();
});

window.onload = hidden_box;

function hidden_box(){
    $('#inner_wrap').css('display','none');
}

var REGISTER = {
		checkInput:function() {
			 editor.sync();//将KindEditor的数据同步到textarea标签。
			if ($("#placeName").val() == "") {
				alert("标题不能为空");
				$("#placeName").focus();
				return false;
			}
			if ($("#placeAddress").val() == "") {
			alert("地址不能为空");
				$("#placeAddress").focus();
				return false;
			}
			alert($("#placeStarttime").val());
		//	if ($("#placeStarttime").val() == "") {
			//	alert("起始时间不能为空");
			//	$("#placeStarttime").focus();
			//	return false;
			//}
			
			//if ($("#placeEndtime").val() == "") {
			//	alert("终止时间不能为空");
			//	$("#placeEndtime").focus();
			//	return false;
			//}
			if ($("#placeSize").val() == "") {
				alert("规模不能为空");
				$("#placeSize").focus();
				return false;
			}
			if ($("#placeTel").val() == "") {
				alert("联系方式不能为空");
				$("#placeTel").focus();
				return false;
			}
			else{
				return true;
			}
			
		},		
		doRegister:function() {
			
			$("#news_form1").submit();
			
		},
		register:function() {
			if (this.checkInput()) {
				this.doRegister();
				alert("true");
				alert($("#placeStarttime").val());
			}else{
				alert("false");
			}
		}
};




function doRegister1(){
	REGISTER.register();
}



</script>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul" >
    <li><a href="#">首页</a></li>
    <li><a href="#">系统设置</a></li>
    </ul>
    </div>
    
     <div class="formbody">
    
    <div class="formtitle"><span>场地发布</span></div>
  
    <div id="usual1" class="usual"> 
  	<div  class="tabson">
    
    <form id="news_form1"  action="${pageContext.request.contextPath }/place/release"  method="post">
    <ul class="forminfo" >
    <li><label>标题：<b>*</b></label><input name="placeName" type="text" class="dfinput" value="${place.placeName }" id="placeName" placeholder="请输入标题"   style="width:344px;"/></li>
    <li><label>地址：<b>*</b></label><input name="placeAddress" type="text" class="dfinput" value="${place.placeAddress}" id="placeAddress" placeholder="请输入地址"   style="width:344px;"/></li> 
    <li><label>所属机构：<b>*</b></label><input name="placeCompany" type="text" class="dfinput" value="${place.placeCompany }" id="placeCompany" placeholder="请输入所属机构"   style="width:344px;"/></li>
    <li><label>联系方式：<b>*</b></label><input name="placeTel" type="text" class="dfinput" value="${place.placeTel}" id="placeTel" placeholder="请输入联系方式"   style="width:344px;"/></li>
       
    
    
    <li><label>起始时间：<b>*</b></label><input name="placeStarttime" type="text"  class="easyui-datebox" required="required" value="${place.placeStarttime}" id="placeStarttime" data-options="formatter:myformatter,parser:myparser" style="width:344px;"/></li>
    <li><label>终止时间：<b>*</b></label><input name="placeEndtime" type="text"  class="easyui-datebox" required="required" value="${place.placeEndtime}" id="placeEndtime"  data-options="formatter:myformatter,parser:myparser" style="width:344px;"/></li>
    
   <!--   <li><label>起始时间：<b>*</b></label>
    
    <div class="vocation" >
    <select class="select1" name="placeStarttime" value="${place.placeStarttime }" id="placeStarttime" >
    <option>全体学员</option>
    <option>班级成员</option>
    </select>
    </div>
       
    
    </li>
        <li><label>结束时间：<b>*</b></label>
    
    <div class="vocation" >
    <select class="select1" name="placeEndtime" value="${place.placeEndtime }" id="placeEndtime" >
    <option>全体学员</option>
    <option>班级成员</option>
    </select>
    </div>
       
    
    </li>
    -->
    
     <li><label>场地规模：<b>*</b></label>    
    <div class="vocation">
    <select class="select1" name="placeSize" value="${place.placeSize}" id="placeSize" style="width:344px;">
    <option>小班型</option>
    <option>中班型</option>
    <option>大班型</option>
    </select>
    </div>    
    </li>   
    <li><label>场地介绍：<b>*</b></label>
    <textarea  name="placeContent" value="${place.placeContent }" id="placeContent" style="width:700px;height:250px;visibility:hidden;"></textarea>
   <!--<textarea id="content7" name="newsDesc" value="${news.newsDesc }" id="newsDesc" style="width:700px;height:250px;visibility:hidden;"></textarea>-->
    <!--  <textarea rows="80" cols="10" class="dfinput" style="width:50%;height:100px;" name="placeContent" value="${place.placeContent }" id="placeContent" placeholder="请输入内容"></textarea>-->
    
    </li>
    <li><label>&nbsp;</label><input name="mysubmit" type="button" class="btn" value="马上发布" onclick="doRegister1()"/></li>
    </ul>
    </form>    
    </div>  
    </div>
    </div>
    
    <script type="text/javascript">
		function myformatter(date){
			var y = date.getFullYear();
			var m = date.getMonth()+1;
			var d = date.getDate();
			return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
		}
		function myparser(s){
			if (!s) return new Date();
			var ss = (s.split('-'));
			var y = parseInt(ss[0],10);
			var m = parseInt(ss[1],10);
			var d = parseInt(ss[2],10);
			if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
				return new Date(y,m-1,d);
			} else {
				return new Date();
			}
		}
	</script>
    
</body>
</html>

