<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
		<title>我的收藏</title>
		<link href="${pageContext.request.contextPath }/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/amazeui.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/colstyle.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
		<script>
		function doChangePage(currentPage,total,type) {
			alert(currentPage);
			if(type==1) {    //上一页
				var Page=1;
				if(Page!=currentPage)
					currentPage=currentPage-1;
			}
			else if(type==2) {    //下一页
				var Page=Math.ceil(total/2);
				if(Page!=currentPage)
					currentPage=currentPage+1;
			}
			$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						currentPage:currentPage
						}, 
			        url:"${pageContext.request.contextPath }/collection/classeslist",
			        success:function(dates){
				      window.location.reload(true);
					},
					error: function() {		             
					}
			   });
		}
		
		function doDeletes(id){
			var reason_arr = new Array();			
			reason_arr.push(id);					
			if(reason_arr.length == 0){
				alert("请选择需要删除的记录！");
			}else{
				var vals = reason_arr.join(",");	
				$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						collectionIds: vals
						}, 
			        url:"${pageContext.request.contextPath }/collection/deleteClassByIds",
			        success:function(result){
			        	if(result.state){			        		
			        		alert("删除成功！");			        		
			        	}else{
			        		alert("删除失败！");
			        	}
					},
					error: function() {
						alert("网络异常！");
					}
			   });
			}			
		}
		
	
		function toIntoPeriod(id,Imgsource) {
			alert(id+"....");
			window.location.href = "${pageContext.request.contextPath }/period/toList?classId="+id;
			//$.post("${pageContext.request.contextPath }/period/toList",{classId:id,Imgsource:Imgsource});
		}
		
		function doShoppingcart(studentId,classId){
			//var classId = $("#classId").val();
			//var studentId = $("#studentId").val();
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
			//alert(classId);
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

					<div class="user-collection">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">我的收藏</strong> / <small>My&nbsp;Collection</small></div>
						</div>
						<hr/>

						<div class="you-like">
							<div class="s-bar">
								我的收藏
							</div>
							<div class="s-content">
							<c:forEach items="${Collectionbean.rows}" var="b" varStatus="vs">
								<div class="s-item-wrap">
									<div class="s-item">

										<div class="s-pic">
											<a href="javascript:void(0);" class="s-pic-link" onclick="toIntoPeriod(${b.classId})">
												<img src="${b.classImg}" class="s-pic-img s-guess-item-img" style="width:anto;height:200px;">
											</a>
										</div>
										<div class="s-info">
											<div class="s-title" style="text-align:center"><a href="#">${b.classTitle}</a></div>
											<div class="s-price-box">
												<span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">${b.classPrice}</em></span>
											</div>
											<div class="s-extra-box">
												<span class="s-comment">好评: 98.03%</span>
											</div>
										</div>
										<div class="s-tp">
										
											<span class="ui-btn-loading-before"><a href="javascript:void(0);" style="color:#fff;" id="delete" onclick="doDeletes(${b.collectionId})">取消收藏</a></span>
											<i class="am-icon-shopping-cart"></i>
											<span class="ui-btn-loading-before buy"><a href="javascript:void(0);" style="color:#fff;" id="delete" onclick="doShoppingcart(${student.studentId},${b.classId})">加入购物车</a></span>
											<p>
												<a href="javascript:;" class="c-nodo J_delFav_btn">取消收藏</a>
											</p>
										</div>
									</div>
								</div>
							</c:forEach>
							</div>
							
		    		<div class="message">共<i class="blue">${Collectionbean.total}</i>条记录，当前显示第&nbsp;<i class="blue">${Collectionbean.currentPage }&nbsp;</i>页   
		        		<a class="nextPage" href="javascript:void(0);" onclick="doChangePage(${Collectionbean.currentPage},${Collectionbean.total },1)">&lt;&lt;上一页</a>
						<a class="nextPage" href="javascript:void(0);" onclick="doChangePage(${Collectionbean.currentPage},${Collectionbean.total },2)">&lt;&lt;下一页</a>
					</div>

							<div class="s-more-btn i-load-more-item" data-screen="0"><i class="am-icon-refresh am-icon-fw"></i>更多</div>

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
							<li><a href="order.html">订单管理</a></li>
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
							<li class="active"> <a href="collection.html">收藏</a></li>
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