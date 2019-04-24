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
		
			if ($("#companyName").val() == "") {
				alert("请输入用户名");
				$("#companyName").focus();
				return false;
			}
			if ($("#companyCity").val() == "") {
			alert("城市不为空");
				$("#companyCity").focus();
				return false;
			}
			if ($("#companyContacts").val() == "") {
				alert("联系人不为空");
				$("#companyContacts").focus();
				return false;
			}
			if ($("#companyTel").val() == "") {
				alert("电话号不为空");
				$("#companyTel").focus();
				return false;
			}
			if ($("#companyPassword").val() == "") {
				alert("密码不为空");
				$("#companyPassword").focus();
				return false;
			}
			if ($("#companyEmail").val() == "") {
				alert("邮箱不为空");
				$("#companyEmail").focus();
				return false;
			}
			if ($("#recompany_password").val() == "") {
				alert("重复密码不为空");
				$("#recompany_password").focus();
				return false;
			}
			if ($("#code").val() == "") {
				alert("验证码不为空");
				$("#code").focus();
				return false;
			}
			if($("#companyPassword").val() == $("#recompany_password").val()){
			
				return true;
			}
			
			
			alert("两次密码不一致");
			return false;
		},
		doRegister:function() {
			alert("aa");
			$("#company_register_form").submit();
		},
		register:function() {
			
			
			if (this.checkInput()) {
				this.doRegister();
			}
		}
};


function doRegister1(){
	

	REGISTER.register();
}

</script>
	<body>
		<form id="company_register_form" action="${pageContext.request.contextPath }/company/register" method="post">
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">机构入驻</div>
					<div class="right fr"><a href="${pageContext.request.contextPath }/common/door" target="_self">返回主页</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="regist_main center">
					<div class="username">机&nbsp;&nbsp;构&nbsp;&nbsp;名:&nbsp;&nbsp;<input class="shurukuang" type="text"  name="companyName" id="companyName"  value="${company.companyName }" placeholder="请输入机构名称" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：&nbsp;
						<input class="shurukuang" type="text" name="companyCity"  value="${company.companyCity }" id="companyCity" placeholder="请输入机构地址" />
					</div>
					<div class="username">联&nbsp;&nbsp;系&nbsp;&nbsp;人:&nbsp;&nbsp;<input class="shurukuang" type="text" name="companyContacts"  id="companyContacts"  value="${company.companyContacts }" placeholder="请输入联系人姓名"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;联系电话：&nbsp;
						<input class="shurukuang" type="text" name="companyTel" id="companyTel"  value="${company.companyTel }"  placeholder="请输入联系电话" />
					</div>
					
					<div class="username">登陆密码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="companyPassword" id="companyPassword" value="${company.companyPassword }" placeholder="请确认登陆密码"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机构邮箱：&nbsp;
						<input class="shurukuang" type="text" name="companyEmail" value="${company.companyEmail }" id="companyEmail" placeholder="请输入机构邮箱" />
					</div>
					
					<div class="username">确认密码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="recompany_password" id="recompany_password" placeholder="请确认登陆密码"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="yanzhengma" type="text" name="code" id="code" placeholder="请输入验证码"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img id="loginCode" src="${pageContext.request.contextPath }/common/validatecode.jsp"
								onclick="javascript:document.getElementById('loginCode').src='${pageContext.request.contextPath }/common/validatecode.jsp?'+Math.random();" />
					</div>
					
					<div><font size="3px" style="font-family:Times New Roman">机构描述：</font>&nbsp;&nbsp;</br>
						<textarea rows="80" cols="10" style="width:93%;height:100px" placeholder="请输入机构简介" name="companyDesc"></textarea>
	
					</div>
				</div>
				<div class="regist_submit">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="submit" type="button"  value="立即注册"  onclick="doRegister1()">
					<font color="#ff0000">${msg }</font>
				</div>
				
			</div>
		</div>
		</form>
	</body>
	
	
</html>