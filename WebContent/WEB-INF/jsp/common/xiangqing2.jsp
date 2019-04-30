<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课程详情</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
				<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
		<script type="text/javascript">
		function doLogin1(){
				window.location.href = "${pageContext.request.contextPath }/common/class_signup"		
		}

		function doshoppingcart(){
			var classId = $("#classId").val();
			var studentId = $("#studentId").val();
			var url = "${pageContext.request.contextPath }/shopping_cart/addshoppingcart";
			$.post(url,
			{
				classId:classId,
				studentId:studentId
			},
			function(data){
				if(data.state){
					alert("成功添加购物车");
				}else{
					alert("该课程已添加购物车");
				}
			},"json");
			alert(classId);
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

	
	<!-- xiangqing -->
	<form action="post" method="">
	<div class="xiangqing">
		<div class="neirong w">
			<div class="xiaomi6 fl">课程</div>
			<nav class="fr">
				<li><a href="">课程简介</a></li>
				<li>|</li>
				<li><a href="">课程详情</a></li>
				<li>|</li>
				<li><a href="">实时学费</a></li>
				<li>|</li>
				<li><a href="">用户评价</a></li>
				<div class="clear"></div>
			</nav>
			<div class="clear"></div>
		</div>	
	</div>
	
	<div class="jieshao mt20 w">
		  <div class="left fl"><img src="${PeriodClass.classImg }" width=100% height=100%></div>
		  <div class="right fr">
			<div class="h3 ml20 mt20">${PeriodClass.classTitle }</div>
			<div class="jianjie mr40 ml20 mt10">${PeriodClass.classSellPoint }</div>
			<div class="jiage ml20 mt10">预计${PeriodClass.classPrice}元/人</div>
			<div class="ft20 ml20 mt20">班级类别：${PeriodClass.classCid }</div>
			<div class="ft20 ml20 mt20">创建时间：${PeriodClass.classCreated }</div>
			<div class="ft20 ml20 mt20">更新时间：${PeriodClass.classUpdate }</div>
			<div class="xqxq mt20 ml20">
				<div class="top1 mt10">
					<div class="left1 fl">课程描述：${PeriodClass.classDesc }</div>
					<div class="clear"></div>
				</div>
				<div class="bot mt20 ft20 ftbc">开课机构：${PeriodClass.companyId}</div>				
			</div>
		
			<div style="visibility: hidden">课程id：&nbsp;<input type="hidden" name="classId" id="classId" value="${PeriodClass.classId}"/></div>
			<div style="visibility: hidden">学员id：&nbsp;<input type="hidden" name="studentId" id="studentId" value="${student.studentId}"/></div>	
			<div class="xiadan ml20 mt20">
					<input class="jrgwc"  type="button" name="ljbm" value="立即报名" onclick="doLogin1()" />
					<input class="jrgwc" type="button" name="jrsc" value="加入购物车" onclick="doshoppingcart()"/>				
			</div>
		</div>

		<div class="clear"></div>
	</div>
	<!-- footer -->
	<footer class="mt20 center">
			
			<div class="mt20">培训宝</div>

	</footer>
</body>
</html>