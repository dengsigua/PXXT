<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/skin_/login.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
<title>教学培训平台管理系统_用户登录</title>
</head>
<script type="text/javascript">
	var LOGIN = {
			checkInput:function() {
				var name = $("#adminTel").val();
				var ps = $("#adminPassword").val();
				
				alert(name+"....."+ps);
				if ($("#adminTel").val() == "") {
					alert("用户名不能为空");
					$("#adminTel").focus();
					return false;
				}
				if ($("#adminPassword").val() == "") {
					alert("密码不能为空");
					$("#adminPassword").focus();
					return false;
				}
				if($("#valiDate").val() == ""){
					alert("验证不能为空");
					$("#valiDate").focus();
					return false;
				}
				return true;
			},
			doLogin:function() {
				$("#login_form").submit();
			},
			login:function() {
				if (this.checkInput()) {
					this.doLogin();
				}
			}
	};
	$(function(){
		$("#submit_btn").click(function(){
			LOGIN.login();
		});
	});
</script>
<body>
<div id="container">
<form  id="login_form"  method="post" action="${pageContext.request.contextPath }/admin/login">
    <div id="bd">
    	<div id="main">
        	<div class="login-box">
                <div id="logo"></div>
                <h1></h1>
                <div class="input username" id="username">
                    <label for="userName">用户名</label>
                    <span></span>
                    <input type="text" id="adminTel" name="adminTel" value="${admin2.adminTel }"/>
                </div>
                <div class="input psw" id="psw">
                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                    <span></span>
                    <input type="password" id="adminPassword" name="adminPassword" />
                </div>
                <div class="input validate" id="validate">
                    <label for="valiDate">验证码</label>
                    <input type="text"  name="valiDate" id="valiDate"/>
                    <div class="value">
							<img id="loginCode" src="${pageContext.request.contextPath }/common/validatecode.jsp"
								onclick="javascript:document.getElementById('loginCode').src='${pageContext.request.contextPath }/common/validatecode.jsp?'+Math.random();" />
               				</div>
					</div>
                </div>
                <div class="styleArea">
                    <div class="styleWrap">
                        <select name="style">
                            <option value="默认风格">默认风格</option>
                            <option value="红色风格">红色风格</option>
                            <option value="绿色风格">绿色风格</option>
                        </select>
                    </div>
                </div>
                <div id="btn" class="loginButton">
                    <input type="button" class="button" id="submit_btn" value="登录"  />
               		<font color="#ff0000">${msg }</font>
                </div>
                
               
            </div>
        </div>
        
    </div>
  </form> 
</div>

</body>
<script type="text/javascript">
	var height = $(window).height() > 445 ? $(window).height() : 445;
	$("#container").height(height);
	var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
	$('#bd').css('padding-top', bdheight);
	$(window).resize(function(e) {
        var height = $(window).height() > 445 ? $(window).height() : 445;
		$("#container").height(height);
		var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
		$('#bd').css('padding-top', bdheight);
    });
	$('select').select();
	

</script>

</html>
