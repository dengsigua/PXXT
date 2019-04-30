<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>个人中心</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">	
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
					<div class="gouwuche fr"><a href="${pageContext.request.contextPath }/common/self_collection">购物车</a></div>
					<div class="fr">
						<ul>
							<li>${student.studentTel},&nbsp;&nbsp;欢迎您。&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li>|</li>
							<li><a href="${pageContext.request.contextPath }/student/logout" target="_blank">退出</a></li>
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
			<div class="subddzx">
				<ul>
					<li><a href="${pageContext.request.contextPath }/sign_up/toclasslist" >我的课程</a></li>
					<li><a href="${pageContext.request.contextPath }/shopping_cart/toclasslist">我的收藏</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_comment">我的评价</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="" style="color:#ff6700;font-weight:bold;">基本资料</a></li>
					<li><a href="${pageContext.request.contextPath }/common/edit_password">账户安全</a></li>
					
				</ul>
			</div>
		</div>
		<div class="rtcont fr">	
			<div class="ddzxbt">我的资料</div>	
			
			<div class="subgrzl ml40" style="height:100px;margin-top:20px"><span style="position:relative;top:-50px">头像</span>
			<span>
				<c:if test="${student.studentImg==null }">
					<img src="/wsy1/image/tou_default.gif"  height="100px" width="100px" alt="头像"/>
				</c:if >
				<c:if test="${student.studentImg!=null }">
					<img src="${student.studentImg }"  height="100px" width="100px" alt="头像"/>
				</c:if>
			</span>
			<span style="position:relative;top:-50px">
			<a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>

			<div class="subgrzl ml40"><span>昵称</span><span>${student.studentName }</span><span><a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>
			<div class="subgrzl ml40"><span>联系方式</span><span>${student.studentTel }</span><span><a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>
			<div class="subgrzl ml40"><span>电子邮箱</span><span>${student.studentEmail }</span><span><a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>
			<!--  <div class="subgrzl ml40"><span>密码</span><span>${student.studentPassword }</span><span><a href="${pageContext.request.contextPath }/common/edit_info">编辑</a></span></div>-->
			<div class="subgrzl ml40"><span>兴趣爱好</span><span>${student.studentIntrest }</span><span><a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>
			<!-- <div class="subgrzl ml40"><span>学员状态</span><span>${student.studentState }</span><span><a href="${pageContext.request.contextPath }/common/edit_info2">编辑</a></span></div>-->
		</div>
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">培训宝</div>
		</footer>
	</body>
</html>