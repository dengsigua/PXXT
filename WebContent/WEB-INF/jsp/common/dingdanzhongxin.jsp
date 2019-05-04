<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>我的课程</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
		<script type="text/javascript">
		function doChangePage(currentPage) {
			alert(currentPage);
//			alert(classTitle+"xxx"+classPrice1+"xxx"+classPrice2);
			$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						currentPage:currentPage
						}, 
			        url:"${pageContext.request.contextPath }/sign_up/classeslist",
			        success:function(dates){
				      window.location.reload(true);
					},
					error: function() {
		             alert("失败");
					}

			   });
			
		} 
		
		function toIntoPeriod(id,Imgsource) {
			alert(id+"....");
			window.location.href = "${pageContext.request.contextPath }/period/toList?classId="+id;
			//$.post("${pageContext.request.contextPath }/period/toList",{classId:id,Imgsource:Imgsource});
		}
		
		function myformatter(date){
			var date = new Date(date);
			var y = date.getFullYear(); 
			var m = date.getMonth()+1; 
			var d = date.getDate();
			var h = date.getHours();
			var min = date.getMinutes();
			var s = date.getSeconds();
			
			return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d)+' '+(h<10?('0'+h):h)+':'+(min<10?('0'+min):min)+':'+(s<10?('0'+s):s); 
			}
		
		$(function(){
			var date =$("#signUpTime").val();		
			myformatter(date);
		});
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
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx">课程中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="" style="color:#ff6700;font-weight:bold;">我的课程</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_collection">我的收藏</a></li>
					<li><a href="">我的评价</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="${pageContext.request.contextPath }/common/self_info">基本资料</a></li>
					<li><a href="">账户安全</a></li>

				</ul>
			</div>
		</div>
		<div class="rtcont fr">
			<div class="ddzxbt">我的课程</div>
			<c:forEach items="${SignUpbean.rows}" var="b" varStatus="vs">
			<div class="ddxq">								
				
     			<div class="ddspt fl"><img width=100% height=100% src="${b.classImg }" alt=""></div>
				<div class="ddbh fl">${b.signUpId  }</div>
				<div class="ztxx fr">
					<ul>
						<li>未付款</li>
						<li>¥ ${b.classPrice}</li>
						<!--  <li>${b.signUpTime}</li>-->
						<li>${b.signUpTime}</li>						
						<li><a class="enter" href="javascript:void(0);" onclick="toIntoPeriod(${b.classId})">交易详情></a></li>
						<div class="clear"></div>
					</ul>
					<div style="display:none">报名时间：&nbsp;<input type="hidden" name="signUpTime" id="signUpTime" value="${b.signUpTime}"/></div>
				</div>
				<div class="clear"></div>
				</div>
    			</c:forEach>
				
			
			
			<div class="pagin">
	    	<div class="message">共<i class="blue">${SignUpbean.total }</i>条记录，当前显示第&nbsp;<i class="blue">${SignUpbean.currentPage }&nbsp;</i>页      
	       
	        <a class="nextPage"
			href="javascript:void(0);" onclick="doChangePage(${SignUpbean.currentPage==1?1:SignUpbean.currentPage-1})">&lt;&lt;上一页</a>
			
	       <a class="nextPage"
	       href="javascript:void(0);" onclick="doChangePage(${SignUpbean.currentPage==bean.total?SignUpbean.total:SignUpbean.currentPage+1})">&lt;&lt;下一页</a>
	       </div>
       
    		</div>	
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