<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js1/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js1/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js1/select-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>
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
    editor = K.create('#newsDesc', {
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
			if ($("#newsName").val() == "") {
				alert("主题不能为空");
				$("#newsName").focus();
				return false;
			}
			if ($("#newsType").val() == "") {
			alert("类型不能为空");
				$("#newsType").focus();
				return false;
			}
			
			if ($("#newsTarget").val() == "") {
				alert("范围不能为空");
				$("#newsTarget").focus();
				return false;
			}
			
			if ($("#newsDesc").val() == "") {
				alert("内容不能为空");
				$("#newsDesc").focus();
				return false;
			}else{
				return true;
			}
			
		},		
		doRegister:function() {
			alert("aa");
			alert($("#newsDesc").val());
			$("#news_form1").submit();
			alert("aa1");
		},
		register:function() {
			if (this.checkInput()) {
				this.doRegister();
				alert("true");
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
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">系统设置</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>通知发布</span></div>
    <div id="usual1" class="usual"> 
    
    
  	<div id="tab1" class="tabson">
    
    <div class="formtext">Hi，<b>admin</b>，欢迎您使用通知发布功能！</div>
    
    <form id="news_form1"  action="${pageContext.request.contextPath }/news/release"  method="post">
    <ul class="forminfo" >
    <li><label>主题：<b>*</b></label><input name="newsName" type="text" class="dfinput" value="${news.newsName }" id="newsName" placeholder="请输入主题"   style="width:344px;"/></li>
       
    
    <li><label>类型：<b>*</b></label>
    
    <div class="vocation">
    <select class="select1" name="newsType" value="${news.newsType }" id="newsType"   >
    <option>学员公告</option>
    <option>班级通知</option>
    <option>教学安排</option>
    <option>培训作业</option>
    <option>其他提醒</option>
    </select>
    </div>
    
    </li>
    <li><label>范围：<b>*</b></label>
    
    <div class="vocation" >
    <select class="select1" name="newsTarget" value="${news.newsTarget }" id="newsTarget" >
    <option>全体学员</option>
    <option>班级成员</option>
    </select>
    </div>
       
    
    </li>
    <li><label>内容：<b>*</b></label>
   
  <textarea  name="newsDesc" value="${news.newsDesc }" id="newsDesc" style="width:700px;height:250px;visibility:hidden;"></textarea>
    <!--  <textarea rows="80" cols="10" class="dfinput" style="width:50%;height:100px;" name="newsDesc" value="${news.newsDesc }" id="newsDesc" placeholder="请输入内容"></textarea>-->
    
    </li>
    <li><label>&nbsp;</label><input name="mysubmit" type="button" class="btn" value="马上发布" onclick="doRegister1()"/></li>
    </ul>
    </form>  
    </div>  

    
    
  	<div id="tab2" class="tabson">
    
    
    </div>  
       
	</div> 
 
	<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
    
    
    
    
    
    </div>

</body>
</html>
