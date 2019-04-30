<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课程报名</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>

<script type="text/javascript">

var REGISTER = {
		checkInput:function() {
			alert("aa");
			alert($("#companyId").val());
			alert($("#classId").val());
			if ($("#signUpName").val() == "") {
				alert("请输入用户名");
				$("#signUpName").focus();
				return false;
			}
			if ($("#signUpTel").val() == "") {
				alert("电话号不为空");
				$("#signUpTel").focus();
				return false;
			}
			if ($("#signUpEmail").val() == "") {
				alert("邮箱不为空");
				$("#signUpEmail").focus();
				return false;
			}	
			else{
				return true;
			}
		
		},
		doRegister:function() {
			
			$("#class_signup_form").submit();
		},
		register:function() {
			
			
			if (this.checkInput()) {
				this.doRegister();
			}else{
				alert("false");
			}			
		}
};


function doRegister1(){
alert("bb");
	REGISTER.register();
}
</script>
</head>
<body>
<form  method="post" id="class_signup_form" action="${pageContext.request.contextPath }/sign_up/class_signup" >
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">课程报名</div>
					<div class="right fr"><a href="${pageContext.request.contextPath }/common/xiangqing" target="_self">返回课程</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="regist_main center">
				
<input class="shurukuang" type="hidden" name="companyId" id="companyId" value="${PeriodClass.companyId }"/>
<input class="shurukuang" type="hidden" id="classId" name="classId"   value="${PeriodClass.classId }" />

					
					<div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input class="shurukuang" type="text" name="signUpName" id="signUpName" value="${signup.signUpName }"placeholder="请输入你的用户名" /><span>请输入您的真实姓名</span>
					</div>					
					<div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input class="shurukuang" type="text" id="signUpTel" name="signUpTel"   value="${signup.signUpTel }" placeholder="请填写正确的手机号"/><span>请填写您的手机号</span></div>
					<div class="username">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：&nbsp;<input class="shurukuang" type="text" name="signUpEmail" id="signUpEmail"  value="${signup.signUpEmail }" placeholder="请填写邮箱"/><span>请填写您的电子邮箱</span></div>
				</div>
				<div class="regist_submit">
					<input class="submit" type="button"   value="立即报名"  onclick="doRegister1()">
					<font color="#ff0000">${msg1 }</font>
				</div>
				
			</div>
		</div>
		</form>
</body>
</html>