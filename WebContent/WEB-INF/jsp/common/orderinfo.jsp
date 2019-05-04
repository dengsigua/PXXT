<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>订单详情</title>

		<link href="${pageContext.request.contextPath }/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${pageContext.request.contextPath }/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/orstyle.css" rel="stylesheet" type="text/css">

		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/amazeui.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>

			<script>
			function dateFormat (date, format) {
			    date = new Date(date);
			    date.setHours(date.getHours()-14);
			    var o = {
			        'M+' : date.getMonth() + 1, //month
			        'd+' : date.getDate(), //day
			        'H+' : date.getHours(), //hour
			        'm+' : date.getMinutes(), //minute
			        's+' : date.getSeconds(), //second
			        'q+' : Math.floor((date.getMonth() + 3) / 3), //quarter
			        'S' : date.getMilliseconds() //millisecond
			    };
			
			    if (/(y+)/.test(format))
			        format = format.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));
			
			    for (var k in o)
			        if (new RegExp('(' + k + ')').test(format))
			            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ('00' + o[k]).substr(('' + o[k]).length));
			
			    return format;
			}
</script>


	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd">
									<a href="#" target="_top" class="h">亲，请登录</a>
									<a href="#" target="_top">免费注册</a>
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
							</div>
							<div class="topMessage my-shangcheng">
								<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
							</div>
							<div class="topMessage mini-cart">
								<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
						</ul>
						</div>

						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="${pageContext.request.contextPath }/images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						</div>
			</div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-orderinfo">

						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">订单详情</strong> / <small>Order&nbsp;details</small></div>
						</div>
						<hr/>
						<!--进度条-->
						<div class="m-progress">
							<div class="m-progress-list">
								<span class="step-1 step">
                                   <em class="u-progress-stage-bg"></em>
                                   <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                   <p class="stage-name">拍下课程</p>
                                </span>
								<span class="step-1 step">
                                   <em class="u-progress-stage-bg"></em>
                                   <i class="u-stage-icon-inner">2<em class="bg"></em></i>
                                   <p class="stage-name">支付费用</p>
                                </span>
								<span class="step-2 step" id="step3">
                                   <em class="u-progress-stage-bg"></em>
                                   <i class="u-stage-icon-inner">3<em class="bg"></em></i>
                                   <p class="stage-name">交易完成</p>
                                </span>
								<span class="step-4 step" id="step4">
                                   <em class="u-progress-stage-bg"></em>
                                   <i class="u-stage-icon-inner">4<em class="bg"></em></i>
                                   <p class="stage-name">开始学习</p>
                                </span>
								<span class="u-progress-placeholder"></span>
							</div>
							<div class="u-progress-bar total-steps-2">
								<div class="u-progress-bar-inner"></div>
							</div>
						</div>
						<div class="clear"></div>
						<div class="order-infomain">

							<div class="order-top">
								<div class="th th-item">
									<td class="td-inner">课程</td>
								</div>
								<div class="th th-price">
									<td class="td-inner">单价</td>
								</div>
								<div class="th th-operation">
									<td class="td-inner">商品操作</td>
								</div>
								<div class="th th-amount">
									<td class="td-inner">合计</td>
								</div>
								<div class="th th-status">
									<td class="td-inner">交易状态</td>
								</div>
								<div class="th th-change">
									<td class="td-inner">交易操作</td>
								</div>
							</div>

							<div class="order-main">

								<div class="order-status3">
									<div class="order-title">
										<div><span style="width:400px">订单编号：${orders.ordersId}</span>  <span>成交时间：${orders.ordersTime}</span></div>
										
										<!--<em>店铺：小桔灯</em>-->
									</div>
									<div class="order-content">
										<div class="order-left">
										<c:forEach items="${sClasses}" var="b" varStatus="vs">
											<ul class="item-list">
												<li class="td td-item">
													<div class="item-pic" style="margin-left:20px">
														<a href="#" class="J_MakePoint">
															<img src="${b.classImg}" class="itempic J_ItemImg" style=" height:100%">
														</a>
													</div>
													<div class="item-info" style="margin-left:130px">
														<div class="item-basic-info">
															<a href="#">
																<p>${b.classTitle}</p>
																<p class="info-little">机构：${b.companyName}
																	<br/>类别：${b.classCid} </p>
															</a>
														</div>
													</div>
												</li>
												<li class="td td-price">
													<div class="item-price">
														${b.classPrice}
													</div>
												</li>
												<li class="td td-operation">
													<div class="item-operation">
														<a href="javascript:;">退款</a>
													</div>
												</li>
											</ul>
										</c:forEach>


										</div>
										
										
										<div class="order-right" style="margin-right:50px">
											<li class="td td-amount">
												<div class="item-amount">
													合计：${orders.ordersPrice}
													<p>不含手续费</p>
												</div>
											</li>
											<div class="move-right">
												<li class="td td-status">
													<div class="item-status">
														<p class="Mystatus" style="margin-top:10px">已支付</p>
													</div>
												</li>
												<li class="td td-change">
													<div class="am-btn am-btn-danger anniu"><a id="J_Go" style="color:#fff;"  href="javascript:void(0);" onclick="doOrder();">开始学习</a>
														</div>
												</li>
											</div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
						</p>
					</div>
				</div>

			</div>
			<aside class="menu">
				<ul>
					<li class="person">
						<a href="index.html">个人中心</a>
					</li>
					<li class="person">
						<a href="#">个人资料</a>
						<ul>
							<li> <a href="information.html">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li> <a href="address.html">收货地址</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的交易</a>
						<ul>
							<li class="active"><a href="order.html">订单管理</a></li>
							<li> <a href="change.html">退款售后</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的资产</a>
						<ul>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<a href="#">我的小窝</a>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>
							<li> <a href="comment.html">评价</a></li>
							<li> <a href="news.html">消息</a></li>
						</ul>
					</li>

				</ul>

			</aside>
		</div>

	</body>

</html>