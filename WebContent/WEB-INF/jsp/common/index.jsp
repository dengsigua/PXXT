f<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>教学培训</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"  type="text/css">
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
	</head>
	<body>
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
						   <c:if test="${empty studentName }">
						    <li><a href="${pageContext.request.contextPath }/common/login" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="${pageContext.request.contextPath }/common/StudentRegister" target="_blank" >注册</a></li>
							<li>|</li>
						</c:if>
						<c:if test="${!empty studentName }">
						  <li>欢迎您：${studentName }</li>
						   <li>|</li>
						  <li><a href="${pageContext.request.contextPath }/common/self_info" target="_blank">个人中心</a></li>
						</c:if>
						 
							<!--  <li><a href="${pageContext.request.contextPath }/common/login" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="${pageContext.request.contextPath }/common/StudentRegister" target="_blank" >注册</a></li>
							<li>|</li>-->
							
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>	

<!-- start banner_x -->
		<div class="banner_x center">
			<a href="${pageContext.request.contextPath }/common/door" target="_blank"><div class="logo fl" style="width:200px;height:50px；margin:auto 0px"></div></a>
			<!-- <a href=""><div class="ad_top fl"></div></a> -->
			<div class="nav fl" style="margin:auto 0px">
				<ul>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist" target="_blank">首页</a></li>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist">热门课程</a></li>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist">品质机构</a></li>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist">优惠网课</a></li>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist">周围搜课</a></li>
					<li><a href="${pageContext.request.contextPath }/classes/toliebiaolist">私人选课</a></li>
				
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
		<div class="banner_y center">		
		
			<div class="nav">				
				<ul>
					<li>
						<a href="">艺术 |兴趣</a>						
						<div class="pop">
							<div class="left fl">
								<div>									
									<div class="xuangou_left fl">
									    <a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">舞蹈：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">街舞</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">芭蕾</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">拉丁</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">民族</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">爵士</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">现代</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">古典</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">肚皮</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/classes/toliebiaolist">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">钢管</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">健美操</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">其他</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">瑜伽：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">瑜伽</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">书法绘画：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">美术</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">书法</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="clear"></div>
								</div>
								
															
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
									<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">乐器：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">吉他</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">钢琴</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">小提琴</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">大提琴</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">萨克斯</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">手风琴</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">电子琴</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">架子鼓</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">非洲鼓</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">尤克里里</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">古筝</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">二胡</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">琵琶</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">笛子</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">其他</span>
									        <div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">科技：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">少年编程</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">3D打印</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">无人机</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">机器人</span>
											<div class="clear"></div>
										</a>
									</div>									
									<div class="clear"></div>
								</div>
								</div>
								
								<div class="right fl">
								<div>
									<div class="xuangou_left fl">
									<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">体育竞技：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">健身</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">武术</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">网球</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">台球</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">田径</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">篮球</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">跆拳道</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">拳击</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">轮滑</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">游泳</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">乒乓球</span>
											<div class="clear"></div>
										</a>										
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">其他</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">兴趣爱好：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">围棋</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">象棋</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">国际象棋</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">模特</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">口才</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">手工</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">国学经典</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">花艺</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">茶艺</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">声乐</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">礼仪</span>
											<div class="clear"></div>
										</a>										
									</div>									
									<div class="clear"></div>
								</div>
							</div>
						<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">学前|小学</a>
						
						<div class="pop">
							<div class="left fl">
								<div>									
									<div class="xuangou_left fl">
									<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">早教/感统：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">早教课程</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">亲子乐园</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">特色课</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">右脑/智力开发</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">感统训练</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">胎教/孕育</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">幼儿园</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">特殊儿童教育</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">半托/全托班</span>
											<div class="clear"></div>
										</a>

										<div class="clear"></div>

									</div>
									<div class="clear"></div>
								</div>
								
															
							</div>
							<div class="ctn fl">
								<div>									
									<div class="xuangou_left fl">
									<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">小学辅导：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">小学辅导</span>
											<div class="clear"></div>
										</a>										
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">少儿英语：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">少儿英语</span>
											<div class="clear"></div>
										</a>										
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">幼小衔接：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">幼小衔接</span>
											<div class="clear"></div>
										</a>										
										<div class="clear"></div>

									</div>
									<div class="clear"></div>
								</div>
								</div>
							
								<div class="right fl">
									<div>									
									<div class="xuangou_left fl">
									<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">冬/夏令营：</span>
											<div class="clear"></div>
										</a>
										<div class="clear"></div>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">全部</span>
											<div class="clear"></div>
										</a>										
										
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">英语夏令营</span>
											<div class="clear"></div>
										</a>
										
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">科技夏令营</span>
											<div class="clear"></div>
										</a>										
										
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">军事夏令营</span>
											<div class="clear"></div>
										</a>
										
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">篮球夏令营</span>
											<div class="clear"></div>
										</a>
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">国际游学营</span>
											<div class="clear"></div>
										</a>	
										<a href="${pageContext.request.contextPath }/common/liebiao">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">冬令营</span>
											<div class="clear"></div>
										</a>									
										<div class="clear"></div>

									</div>
									<div class="clear"></div>
								</div>
								</div>						
							<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">初中|高中</a>
						
						<div class="pop">
							<div class="left fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm6_80.png" alt=""></div>
											<span class="fl">小米6</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/5c_80.png" alt=""></div>
											<span class="fl">小米手机5c</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xmNOTE2-80.jpg" alt=""></div>
											<span class="fl">小米Note 2</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米MIX</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米5s</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5Splus.jpg" alt=""></div>
											<span class="fl">小米5s Plus</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>								
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5-80.jpg" alt=""></div>
											<span class="fl">小米手机5</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmn4x80.png" alt=""></div>
											<span class="fl">红米Note 4X</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmnote4-80.jpg" alt=""></div>
											<span class="fl">红米Note-4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4x_80.png" alt=""></div>
											<span class="fl">红米4x</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4-80.jpg" alt=""></div>
											<span class="fl">红米4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4A-80.jpg" alt=""></div>
											<span class="fl">红米4A</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="right fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="clear"></div>
										</a>
									</div>									
									<div class="clear"></div>
								</div>

							</div>
							<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">语言|留学</a>
					
						<div class="pop">
							<div class="left fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm6_80.png" alt=""></div>
											<span class="fl">小米6</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/5c_80.png" alt=""></div>
											<span class="fl">小米手机5c</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xmNOTE2-80.jpg" alt=""></div>
											<span class="fl">小米Note 2</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米MIX</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米5s</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5Splus.jpg" alt=""></div>
											<span class="fl">小米5s Plus</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>								
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5-80.jpg" alt=""></div>
											<span class="fl">小米手机5</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmn4x80.png" alt=""></div>
											<span class="fl">红米Note 4X</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmnote4-80.jpg" alt=""></div>
											<span class="fl">红米Note-4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4x_80.png" alt=""></div>
											<span class="fl">红米4x</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4-80.jpg" alt=""></div>
											<span class="fl">红米4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4A-80.jpg" alt=""></div>
											<span class="fl">红米4A</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="right fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/compare.jpg" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/mimobile.jpg" alt=""></div>
											<span class="fl">小米移动&nbsp;电话卡</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">资格|考证</a>
						
						<div class="pop">
							<div class="left fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm6_80.png" alt=""></div>
											<span class="fl">小米6</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/5c_80.png" alt=""></div>
											<span class="fl">小米手机5c</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xmNOTE2-80.jpg" alt=""></div>
											<span class="fl">小米Note 2</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米MIX</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米5s</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5Splus.jpg" alt=""></div>
											<span class="fl">小米5s Plus</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>								
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5-80.jpg" alt=""></div>
											<span class="fl">小米手机5</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmn4x80.png" alt=""></div>
											<span class="fl">红米Note 4X</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmnote4-80.jpg" alt=""></div>
											<span class="fl">红米Note-4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4x_80.png" alt=""></div>
											<span class="fl">红米4x</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4-80.jpg" alt=""></div>
											<span class="fl">红米4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4A-80.jpg" alt=""></div>
											<span class="fl">红米4A</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="right fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/compare.jpg" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/mimobile.jpg" alt=""></div>
											<span class="fl">小米移动&nbsp;电话卡</span>
											<div class="clear"></div>
										</a>
									</div>
									 <div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">就业|技能</a>
						
						<div class="pop">
							<div class="left fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm6_80.png" alt=""></div>
											<span class="fl">小米6</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/5c_80.png" alt=""></div>
											<span class="fl">小米手机5c</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xmNOTE2-80.jpg" alt=""></div>
											<span class="fl">小米Note 2</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米MIX</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米5s</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5Splus.jpg" alt=""></div>
											<span class="fl">小米5s Plus</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5-80.jpg" alt=""></div>
											<span class="fl">小米手机5</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmn4x80.png" alt=""></div>
											<span class="fl">红米Note 4X</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmnote4-80.jpg" alt=""></div>
											<span class="fl">红米Note-4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4x_80.png" alt=""></div>
											<span class="fl">红米4x</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4-80.jpg" alt=""></div>
											<span class="fl">红米4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4A-80.jpg" alt=""></div>
											<span class="fl">红米4A</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="right fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/compare.jpg" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/mimobile.jpg" alt=""></div>
											<span class="fl">小米移动&nbsp;电话卡</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</li>
					<li>
						<a href="">职场|提升</a>
						
						<div class="pop">
							<div class="left fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm6_80.png" alt=""></div>
											<span class="fl">小米6</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/5c_80.png" alt=""></div>
											<span class="fl">小米手机5c</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xmNOTE2-80.jpg" alt=""></div>
											<span class="fl">小米Note 2</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米MIX</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/MIX-80.jpg" alt=""></div>
											<span class="fl">小米5s</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5Splus.jpg" alt=""></div>
											<span class="fl">小米5s Plus</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="ctn fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/xm5-80.jpg" alt=""></div>
											<span class="fl">小米手机5</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmn4x80.png" alt=""></div>
											<span class="fl">红米Note 4X</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hmnote4-80.jpg" alt=""></div>
											<span class="fl">红米Note-4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4x_80.png" alt=""></div>
											<span class="fl">红米4x</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4-80.jpg" alt=""></div>
											<span class="fl">红米4</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/hm4A-80.jpg" alt=""></div>
											<span class="fl">红米4A</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="">选购</a></div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="right fl">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/compare.jpg" alt=""></div>
											<span class="fl">对比手机</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${pageContext.request.contextPath }/image/mimobile.jpg" alt=""></div>
											<span class="fl">小米移动&nbsp;电话卡</span>
											<div class="clear"></div>
										</a>
									</div>
									<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</li>
				</ul>
							
			</div>
			
		</div>	

		<div class="sub_banner center">
			<div class="sidebar fl">
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_01.gif"></a></div>
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_02.gif"></a></div>
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_03.gif"></a></div>
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_04.gif"></a></div>
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_05.gif"></a></div>
				<div class="fl"><a href=""><img src="${pageContext.request.contextPath }/image/hjh_06.gif"></a></div>
				<div class="clear"></div>
			</div>
			<div class="datu fl"><a href=""><img src="${pageContext.request.contextPath }/image/7.jpg" alt=""></a></div>
			<div class="datu fl"><a href=""><img src="${pageContext.request.contextPath }/image/8.jpg" alt=""></a></div>
			<div class="datu fr"><a href=""><img src="${pageContext.request.contextPath }/image/9.jpg" alt=""></a></div>
			<div class="clear"></div>


		</div>
	<!-- end banner -->
	<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

	<!-- start danpin -->
		<div class="danpin center">
			
			<div class="biaoti center">为您推荐</div>
			<div class="main center">
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="${pageContext.request.contextPath }/image/1.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">体育</a></div>
					<div class="youhui">齐聚行业名师，打造高级全能竞技课程</div>
					<div class="jiage">3499元起</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="${pageContext.request.contextPath }/image/2.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">乐器</a></div>
					<div class="youhui">零基础学乐器，名师指导，轻松考级</div>
					<div class="jiage">1999元</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="${pageContext.request.contextPath }/image/3.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">瑜伽</a></div>
					<div class="youhui">瑜伽大师亲授，打造专业高素质瑜伽</div>
					<div class="jiage">1799元</div>
				</div>
				<div class="mingxing fl"> 	
					<div class="sub_mingxing"><a href=""><img src="${pageContext.request.contextPath }/image/5.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">舞蹈</a></div>
					<div class="youhui">体会舞蹈的美妙，争当舞林至尊</div>
					<div class="jiage">3999元</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="${pageContext.request.contextPath }/image/6.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">乐器</a></div>
					<div class="youhui">零基础学乐器，名师指导，轻松考级</div>
					<div class="jiage">3599元起</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="peijian w">
			<div class="biaoti center">艺术|兴趣</div>
			<div class="main center">
				<div class="content">
					<div class="remen fl"><a href=""><img src="${pageContext.request.contextPath }/image/t1.jpg" alt=""></a>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span>最热</span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/3.jpg" alt=""></a></div>
						<div class="miaoshu"><a href="">瑜伽</a></div>
						<div class="jiage">49元</div>
						<div class="pingjia">3372人气</div>
						<div class="piao">
							<a href="">
								<span>瑜伽大师亲授</span>
								<span>打造专业高素质瑜伽</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
					
						<div class="xinpin"><span style="background:#fff">口碑</span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/2.jpg" alt=""></a></div>
						<div class="miaoshu"><a href="">乐器</a></div>
						<div class="jiage">29元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>零基础学乐器</span>
								<span>名师指导，轻松考级</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
					<div class="xinpin"><span style="background:red">巨惠</span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/16.png"></a></div>
						<div class="miaoshu"><a href="">化妆</a></div>
						<div class="jiage">89元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>体会化妆的美妙</span>
								<span>人人都是小仙女</span>
							</a>
						</div>
					</div>
					
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/5.jpg"></a></div>
						<div class="miaoshu"><a href="">舞蹈</a></div>
						<div class="jiage">89元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>体会舞蹈的美妙</span>
								<span>争当舞林至尊</span>
							</a>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="content">
					<div class="remen fl">
						<div class="xinpin"><span style="background:red">巨惠</span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/1.jpg" alt=""></a></div>
						<div class="miaoshu"><a href="">体育</a></div>
						<div class="jiage">19元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>竞技健身</span>
								<span>齐聚行业名师，打造高级全能竞技课程</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/17.png"></a></div>
						<div class="miaoshu"><a href="">母婴护理</a></div>
						<div class="jiage">19元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>零基础学母婴</span>
								<span>名师指导，轻松护理</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/14.jpg" alt=""></a></div>
						<div class="miaoshu"><a href="">编程</a></div>
						<div class="jiage">999元</div>
						<div class="pingjia">372人气</div>
						<div class="piao">
							<a href="">
								<span>零基础学编程</span>
								<span>从小进入IT世界</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="${pageContext.request.contextPath }/image/18.png" alt=""></a></div>
						<div class="miaoshu"><a href="">书法</a></div>
						<div class="jiage">59元</div>
						<div class="pingjia">775人气</div>
						<div class="piao">
							<a href="">
								<span>零基础学书法</span>
								<span>名师指导，轻松学习</span>
							</a>
						</div>
					</div>
					<div class="remenlast fr">
						<div class="hongmi"><a href=""><img src="${pageContext.request.contextPath }/image/6.jpg" alt=""></a></div>
						<div class="liulangengduo"><a href="${pageContext.request.contextPath }/common/liebiao"><img src="${pageContext.request.contextPath }/image/liulangengduo.png" alt=""></a></div>					
					</div>
					<div class="clear"></div>
				</div>				
			</div>
		</div>
		

		<footer class="mt20 center">			
			<div class="mt20">培训宝</div>
		</footer>
	</body>
</html>