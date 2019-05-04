<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>结算页面</title>

		<link href="${pageContext.request.contextPath }/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">

		<link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/css/cartstyle.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath }/css/jsstyle.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/address.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
		
		<script type="text/javascript">
		var sum=0;
		$(function () {
		    var price = 0;
		    
		    $.each($("input[name='price']"), function(){
		    	price=$(this).val();
		    	sum+=Number(price);
		    });
		    $("#heji").text(sum.toFixed(2));
		    $("#J_ActualFee").text(sum.toFixed(2));
		});
		
		function doOrder() {
			var reason_arr = new Array();
			var studentId=$("#studentId").val();
			$.each($("input[name='classId']"), function(){
					reason_arr.push($(this).val());	
					
			});
			var vals = reason_arr.join(",");
			//$.each($("input[name='price']"), function(){
		    	//price=$(this).val();
		    	//sum+=Number(price);
		    //});
			
			alert(vals);
			alert(studentId);
			alert(sum);
			$.ajax({
				type: "post", 
				dataType:'json', //接受数据格式 
				cache:false, 
				data:{
					classIds:vals,
					studentId:studentId,
					ordersPrice:sum
					}, 
			       url:"${pageContext.request.contextPath }/orders/addorders",
			       success:function(result){
			        if(result.state){			        		
			        	window.location.href = "${pageContext.request.contextPath }/common/pay_success"			        		
			        }else{
			        	window.location.reload(true);
			        }
				},
			 });	
		}
		</script>


	</head>

	<body>

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
				<div class="logo"><img src="${pageContext.request.contextPath }/image/LOGO2.png"  /></div>
				<div class="logoBig">
					<li><img src="${pageContext.request.contextPath }/image/LOGO2.png" /></li>
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
			<div class="concent">
				<!--地址 -->
				<div class="paycont">
					<!--支付方式-->
					<div class="logistics">
						<h3>选择支付方式</h3>
						<ul class="pay-list" style="text-align:center">
							<li class="pay card"><img src="${pageContext.request.contextPath }/images/wangyin.jpg" />银联<span></span></li>
							<li class="pay qq"><img src="${pageContext.request.contextPath }/images/weizhifu.jpg" />微信<span></span></li>
							<li class="pay taobao"><img src="${pageContext.request.contextPath }/images/zhifubao.jpg" />支付宝<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

					<!--订单 -->
					<div class="concent">
						<div id="payTable">
							<h3>确认订单信息</h3>
							<div class="cart-table-th">
								<div class="wp">

									<div class="th th-item">
										<div class="td-inner">课程信息</div>
									</div>
									<div class="th th-price">
										<div class="td-inner" style="width:100px;margin-left:300px">单价</div>
									</div>
									<div class="th th-sum">
										<div class="td-inner" style="width:100px;margin-left:300px">金额</div>
									</div>


								</div>
							</div>
							<div class="clear"></div>
							<c:forEach items="${sClasses}" var="b" varStatus="vs">
							<tr class="item-list">
								<div class="bundle  bundle-last">

									<div class="bundle-main">
										<ul class="item-content clearfix">
											<div class="pay-phone">
												<li class="td td-item">
													<div class="item-pic">
														<a href="#" class="J_MakePoint">
															<img src="${b.classImg }" class="itempic J_ItemImg"  style="width:100%; height:100%"></a>
													</div>
													<div class="item-info">
														<div class="item-basic-info">
															<a href="#" class="item-title J_MakePoint" data-point="tbcart.8.11">${b.classTitle }</a>
														</div>
													</div>
												</li>
												<li class="td td-info">
													<div class="item-props">
														<span class="sku-line">机构：${b.companyName }</span>
														<span class="sku-line">类别：${b.classCid }</span>
													</div>
												</li>
												<li class="td td-price">
													<div class="item-price price-promo-promo">
														<div class="price-content" style="width:100px;margin-left:300px">
															<em class="J_Price price-now">￥${b.classPrice}</em>
														</div>
													</div>
												</li>
											</div>
											<li class="td td-sum">
												<div class="td-inner" style="width:100px;margin-left:300px">
													<em tabindex="0" class="J_ItemSum number" >${b.classPrice}</em>
												</div>
											</li>

										</ul>
										<div class="clear"></div>
										 <div style="display:none">价格：&nbsp;<input type="hidden" name="price" id="price" value="${b.classPrice}"/></div>
										 <div style="display:none">学员ID：&nbsp;<input type="hidden" name="studentId" id="studentId" value="${student.studentId }"/></div>
										 <div style="display:none">课程ID：&nbsp;<input type="hidden" name="classId" id="classId" value="${b.classId }"/></div>
									</div>
							</tr>
							</c:forEach>
							<div class="clear"></div>
							</div>
							</div>
							<div class="clear"></div>
							<div class="pay-total">
						<!--留言-->

							<!--优惠券 -->

							<div class="clear"></div>
							</div>
							<!--含运费小计 -->
							<div class="buy-point-discharge "  >
								<p class="price g_price " >合计（含运费） <span>¥</span><span class="pay-sum" id="heji"></span></p>
							</div>

							<!--信息 -->
							<div class="order-go clearfix">
								<div class="pay-confirm clearfix">
									<div class="box">
										<div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
											<span class="price g_price ">
                                    <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee"></em>
											</span>
										</div>

										<div id="holyshit268" class="pay-address">
			
											<p class="buy-footer-address">
												<span class="buy-line-title">收货人：</span>
												<span class="buy-address-detail">   
                                         <span class="buy-user">${student.studentName}</span>
												<span class="buy-phone">${student.studentTel}</span>
												</span>
											</p>
										</div>
									</div>

									<div id="holyshit269" class="submitOrder">
										<div class="go-btn-wrap">
											<a id="J_Go" href="javascript:void(0);" onclick="doOrder();" class="btn-go" tabindex="0" title="点击此按钮，提交订单">提交订单</a>
										</div>
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
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
	</body>

</html>