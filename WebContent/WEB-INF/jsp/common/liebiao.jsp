<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>课程列表</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.min.js"></script>
		<script type="text/javascript">
		function doChangePage(currentPage) {
			alert(currentPage);
			var classTitle = $("#classTitle").val();
			var classPrice1 = $("#classPrice1").val();
			var classPrice2 = $("#classPrice2").val();		
			$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						classTitle:classTitle,
						classPrice1:classPrice1,
						classPrice2:classPrice2,
						currentPage:currentPage
						}, 
			        url:"${pageContext.request.contextPath }/classes/classeslist",
			        success:function(dates){
				      window.location.reload(true);
					},
					error: function() {
		             
					}

			   });
			
		} 
		</script>
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
							<li>${user.studentTel},欢迎您。</li>
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

	<!-- start banner_y -->
	<!-- end banner -->

	<!-- start danpin -->
		<div class="danpin center">
			
			
	<div class="xiangqing">
		<div class="neirong w">
			<div class="xiaomi6 fl">全部分类</div>
			<nav class="fr">
				<li><a href="">强推荐</a></li>
				<li>|</li>
				<li><a href="">新品类</a></li>
				<li>|</li>
				<li><a href="">价格低</a></li>
				<li>|</li>
				<li><a href="">人气高</a></li>
				<li>|</li>
				<li><a href="">评论多</a></li>
				<div class="clear"></div>
			</nav>
			<div class="clear"></div>
		</div>	
	</div>
			<div class="main center mb20">
				
	<c:forEach items="${Classbean.rows}" var="b" varStatus="vs">
     <div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
     <div class="sub_mingxing"><a class="enter" href="javascript:void(0);" onclick="toIntoPeriod(${b.classId})"><img src="${b.classImg }" alt=""></a></div>
     <div class="pinpai"><a href="">课程名称:${b.classTitle }</a></div>
	 <div class="youhui">课程类别:${b.classCid }</div>
	 <div class="jiage">课程售价:${b.classPrice/100.00 }</div>
	</div>
    </c:forEach>

				<div class="clear"></div>
				    <div class="pagin">
    	<div class="message">共<i class="blue">${Classbean.total }</i>条记录，当前显示第&nbsp;<i class="blue">${Classbean.currentPage }&nbsp;</i>页   
        <a class="nextPage"
		href="javascript:void(0);" onclick="doChangePage(${Classbean.currentPage==1?1:Classbean.currentPage-1})">&lt;&lt;上一页</a>
		
       <a class="nextPage"
       href="javascript:void(0);" onclick="doChangePage(${Classbean.currentPage==bean.total?Classbean.total:Classbean.currentPage+1})">&lt;&lt;下一页</a>
       </div>
       		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>

		</footer>

	<!-- end danpin -->
    </div>
			</div>
		</div>
		
		
		
		
		



	</body>
</html>