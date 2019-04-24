<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>会员登录</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
</head>

<script type="text/javascript">
	function register(){
		var student = document.getElementById("Student");
		var company = document.getElementById("Company");
		if(student.checked){	
			window.location.href = "${pageContext.request.contextPath }/common/StudentRegister"
		}
		if(company.checked){
			window.location.href = "${pageContext.request.contextPath }/common/CompanyRegister"
		}		
	}
	
	var LOGIN = {
			checkInput:function() {
			
				if ($("#username").val() == "") {
					alert("请输入用户名");
					$("#username").focus();
					return false;
				}
				if ($("#password").val() == "") {
				alert("密码不为空");
					$("#password").focus();
					return false;
				}
				if ($("#code").val() == "") {
					alert("验证码不为空");
					$("#code").focus();
					return false;
				}

				return true;
			},
			doLogin:function() {
				$("#door_login_form").submit();
			},
			login:function() {
	
				if (this.checkInput()) {
					var student = document.getElementById("Student");
					var company = document.getElementById("Company");
					var targetForm = document.forms[0];
					if(student.checked){
						targetForm.action = "${pageContext.request.contextPath }/student/login";
						alert("student");
					}
					if(company.checked){
						targetForm.action = "${pageContext.request.contextPath }/company/login";
						alert("company");
					}

					this.doLogin();
				}else{
					alert("false");
				}
				
			}
	};

	function doLogin1(){
		LOGIN.login();
	}
	
</script>

	<body>
		<!-- login -->
		<div class="top center">
			<div class="logo center">
				<a href="${pageContext.request.contextPath }/common/door" target="_blank"><img src="${pageContext.request.contextPath }/image/LOGO.png" alt=""></a>
			</div>
		</div>
		<form  id="door_login_form"  method="post" action="${pageContext.request.contextPath }/student/login"  class="form center">
		<div class="login">
			<div class="login_center">
				<div class="login_top">
					<div class="left fl">会员登录</div>
					<div class="right fr">您还没有账号？<a href="javascript:void(0);"  id="registe" onclick="register()" target="_self">立即注册</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="login_main center">
					  	<span class="choose">
                                <span class="checkboxouter">
                                    <input type="radio" name="user" id="Student" checked="checked"/>
                                    <span class="radio"></span>
                                </span>
                                <span class="text">学员</span>
                         </span>
                          <span class="choose">
                                <span class="checkboxouter">
                                    <input type="radio" name="user" id="Company"/>
                                    <span class="radio"></span>
                                </span>
                                <span class="text">机构</span>
                          </span>
					<div class="username">用户名:&nbsp;<input class="shurukuang" type="text" name="username" id="username" value="username" placeholder="请输入你的用户名"/></div>
					<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input class="shurukuang" type="password" name="password" id="password"  placeholder="请输入你的密码"/></div>
					<div class="username">
						<div class="left fl">验证码:&nbsp;<input class="yanzhengma" type="text" name="code" id="code" placeholder="请输入验证码"/></div>
						<div class="right fl"><img id="loginCode" src="${pageContext.request.contextPath }/common/validatecode.jsp"
								onclick="javascript:document.getElementById('loginCode').src='${pageContext.request.contextPath }/common/validatecode.jsp?'+Math.random();" />
						</div>
						<div class="clear"></div>
					</div>
				<div class="login_submit">
					<input class="submit" type="button" onclick="doLogin1()" value="立即登录"  >
					<font color="#ff0000">${msg }</font>
				</div>
				
				</div>
			
			</div>
		</div>
		</form>
		<footer>
			<div class="copyright">简体 | 繁体 | English | 常见问题</div>
			<div class="copyright">培训宝</div>

		</footer>
	</body>
</html>