<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta charset="UTF-8">
 <meta name="author" content="order by dede58.com"/>
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
</head>
	
<script type="text/javascript">

var REGISTER = {
		checkInput:function() {
		
			if ($("#studentName").val() == "") {
				alert("请输入用户名");
				$("#studentName").focus();
				return false;
			}
			if ($("#studentPassword").val() == "") {
			alert("密码不为空");
				$("#studentPassword").focus();
				return false;
			}
			if ($("#restudent_password").val() == "") {
				alert("重复密码不为空");
				$("#restudent_password").focus();
				return false;
			}
			if ($("#studentTel").val() == "") {
				alert("电话号不为空");
				$("#studentTel").focus();
				return false;
			}
			if ($("#studentEmail").val() == "") {
				alert("邮箱不为空");
				$("#studentEmail").focus();
				return false;
			}
			if ($("#code").val() == "") {
				alert("验证码不为空");
				$("#code").focus();
				return false;
			}
			if($("#studentPassword").val() == $("#restudent_password").val()){
			
				return true;
			}
			
			
			alert("两次密码不一致");
			return false;
		},
		doRegister:function() {
			$("#student_register_form").submit();
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
	

	REGISTER.register();
}

</script>
	<body>
		<form  method="post" id="student_register_form" action="${pageContext.request.contextPath }/student/regester" >
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">学员注册</div>
					<div class="right fr"><a href="${pageContext.request.contextPath }/common/door" target="_self">返回主页</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="regist_main center">
					<div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input class="shurukuang" type="text" name="studentName" id="studentName" value="${student.studentName }"placeholder="请输入你的用户名" /><span>请输入大名</span>
					</div>
					<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="studentPassword"  id="studentPassword" value="${student.studentPassword }" placeholder="请输入你的密码"/><span>请输入6位以上字符</span></div>
					
					<div class="username">确认密码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="restudent_password" id="restudent_password" placeholder="请确认你的密码"/><span>两次密码要输入一致哦</span></div>
					
					<div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input class="shurukuang" type="text" id="studentTel" name="studentTel"   value="${student.studentTel }" placeholder="请填写正确的手机号"/><span>填写下手机号吧，方便我们联系您！</span></div>
					<div class="username">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：&nbsp;<input class="shurukuang" type="text" name="studentEmail" id="studentEmail"  value="${student.studentTel }" placeholder="请填写邮箱"/><span>填写下邮箱吧，方便发邮件给您！</span></div>
					<div class="username">
						<div class="left fl">验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;<input class="yanzhengma" type="text" name="code" id="code" placeholder="请输入验证码"/></div>
						<div class="right fl">
						<img id="loginCode" src="${pageContext.request.contextPath }/common/validatecode.jsp"
								onclick="javascript:document.getElementById('loginCode').src='${pageContext.request.contextPath }/common/validatecode.jsp?'+Math.random();" />
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="regist_submit">
					<input class="submit" type="button"   value="立即注册"  onclick="doRegister1()">
					<font color="#ff0000">${msg }</font>
				</div>
				
			</div>
		</div>
		</form>
	</body>
</html>