<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>基本资料</title>
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
</head>
<script type="text/javascript">
function changeTextArea(){
	document.getElementById("companyDesc1").value=document.getElementById("companyDesc").value;
}
</script>
<script>
var REGISTER = {
		doRegister:function() {
			alert("aa");
			alert($("#companyId").val());
			alert($("#companyName").val());
			alert($("#companyDesc").val());
			$("#news_form").submit();
			alert("aa1");
			
		},
		register:function() {
				this.doRegister();
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
    <li><a href="#">表单</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息</span></div>
    <form id="news_form"  action="${pageContext.request.contextPath }/company/edit_info"  method="post">
    <ul class="forminfo">
    <li><input name="companyId" id="companyId" type="hidden" class="dfinput" value="${company.companyId}" /></li>
    <li><input name="companyPassword" id="companyPassword" type="hidden" class="dfinput" value="${company.companyPassword}" /></li>
    <li><label>机构名称</label><input name="companyName" id="companyName" type="text" class="dfinput" value="${company.companyName}" /></li>
    <li><label>机构地址</label><input name="companyCity" id="companyCity" type="text" class="dfinput"  value="${company.companyCity }"/></li>
    <li><label>联系人</label><input name="companyContacts" id="companyContacts" type="text" class="dfinput" value="${company.companyContacts }"/></li>
    <li><label>联系方式</label><input name="companyTel" id="companyTel" type="text" class="dfinput" value="${company.companyTel }"/></li>
    <li><label>机构邮箱</label><input name="companyEmail" id="companyEmail" type="text" class="dfinput" value="${company.companyEmail}"/></li>
    <li><label>机构状态</label><cite><input name="companyState"id="companyState" type="radio" value="" checked="checked" />正常&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="radio" value="" />禁用</cite></li>
    <li><label>机构描述</label><textarea name="companyDesc" id="companyDesc1" cols="" rows="" class="textinput" value="${company.companyDesc}">${company.companyDesc}</textarea></li>
    <li><label>&nbsp;</label><input name="mysubmit" type="button" class="btn" value="编辑" onclick="doRegister1()"/></li>
    </ul>
    </form>
    
    </div>
</body>
</html>