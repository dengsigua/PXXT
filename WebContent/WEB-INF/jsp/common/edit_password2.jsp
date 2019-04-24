<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
<title>修改密码 - 会员管理 - H-ui.admin v3.1</title>
</head>
<body>
<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="${pageContext.request.contextPath }/common/door" target="_blank">培训宝</a></li>
						<li>|</li>
						<li><a href="">网站导航</a></li>
						<li>|</li>
						<li><a href="">帮助中心</a></li>
						<li>|</li>
						<li><a href="">联系客服</a></li>
						
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="${pageContext.request.contextPath }/common/dingdanzhongxin">我的课程</a></div>
					<div class="fr">
						<ul>
							<li>${student.studentTel},&nbsp;&nbsp;欢迎您。&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li>|</li>
							<li><a href="${pageContext.request.contextPath }/common/self_info" target="_blank">退出</a></li>
							<li>|</li>
							<li><a href="${pageContext.request.contextPath }/common/self_info" target="_blank">个人中心</a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->

	<!-- start banner_x -->
		<div class="banner_x center">
			<a href="${pageContext.request.contextPath }/common/door" target="_blank"><div class="logo fl" style="width:200px;height:50px；margin:auto 0px"></div></a>
			<!-- <a href=""><div class="ad_top fl"></div></a> -->
			<div class="nav fl" style="margin:auto 0px">
				<ul>
					<li><a href="${pageContext.request.contextPath }/common/liebiao" target="_blank">首页</a></li>
					<li><a href="${pageContext.request.contextPath }/common/liebiao">热门课程</a></li>
					<li><a href="${pageContext.request.contextPath }/common/liebiao">品质机构</a></li>
					<li><a href="${pageContext.request.contextPath }/common/liebiao">优惠网课</a></li>
					<li><a href="${pageContext.request.contextPath }/common/liebiao">周围搜课</a></li>
					<li><a href="${pageContext.request.contextPath }/common/liebiao">私人选课</a></li>
				
				</ul>
			</div>
			<div class="search fr">
				<form action="" method="post">
					<div class="text fl">
						<input type="text" class="shuru"  placeholder="请输入机构名称或课程名称">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo" value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
<!-- end banner_x -->
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx">课程中心</div>
			<div class="subddzx" >
				<ul >
					<li><a href="${pageContext.request.contextPath }/common/dingdanzhongxin" >我的课程</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_collection">我的收藏</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_comment">我的评价</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="${pageContext.request.contextPath }/common/self_info" >基本资料</a></li>
					<li><a href="" style="color:#ff6700;font-weight:bold;">账户安全</a></li>
					
				</ul>
			</div>
		</div>
<div class="rtcont fr">	
			<div class="ddzxbt">修改密码</div>
<article class="page-container">
	<form action="${pageContext.request.contextPath }/student/psd_change" method="post" class="form form-horizontal" id="form-change-password">
		   <input name="studentId" id="studentId" type="hidden" class="dfinput" value="${student.studentId}" />
		    <input name="studentTel" id="studentTel" type="hidden" class="dfinput" value="${student.studentTel}" />
		    <input name="studentName" id="studentName" type="hidden" class="dfinput" value="${student.studentName}" />
		    <input name="studentEmail" id="studentEmail" type="hidden" class="dfinput" value="${student.studentEmail}" />
		    <input name="studentIntrest" id="studentIntrest" type="hidden" class="dfinput"  value="${student.studentIntrest }"/>
		     <input name="studentState" id="studentState" type="hidden" class="dfinput" value="${student.studentState}" />
		     <input name="studentImg" id="studentImg" type="hidden" class="dfinput" value="${student.studentImg}" />
		 <!--   <div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>机构名称：</label>
			<div class="formControls col-xs-8 col-sm-9"> ${student.studentName} </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>联系方式：</label>
			<div class="formControls col-xs-8 col-sm-9"> ${student.studentTel} </div>
		</div>
		--> 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>输入密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" autocomplete="off" placeholder="请输入6-15位新密码" name="studentPassword" id="studentPassword" value="${student.studentPassword}" style="width: 350px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>确认密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" autocomplete="off" placeholder="请再次输入6-15位新密码" name="newpassword2" id="newpassword2" style="width: 350px;">
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;保存&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

</div>
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">培训宝</div>
		</footer>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/additional-methods.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
	alert($("#studentId").val());
	alert($("#studentTel").val());
	alert($("#studentPassword").val());
	alert($("#newpassword2").val());
	$("#form-change-password").validate({
		
		rules:{
			studentPassword:{
				required:true,
				minlength:6,
				maxlength:16
			},
			newpassword2:{
				required:true,
				minlength:6,
				maxlength:16,
				equalTo: "#studentPassword"
			},
		},		
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			alert("aa");
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
			alert("aa1");
		}
	});
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>