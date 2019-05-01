<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>我的购物车-培训宝</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
		
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
			
//			alert(classTitle+"xxx"+classPrice1+"xxx"+classPrice2);
			$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						currentPage:currentPage
						}, 
			        url:"${pageContext.request.contextPath }/shopping_cart/classeslist",
			        success:function(dates){
				      window.location.reload(true);
					},
					error: function() {
		             
					}

			   });
		}
			
		
		$(function () {
		    //全选,设置chheckbox name='all' tbody id=tb
		    var count=0;
		    var price=0;
		    var sum=0;
		    $("#jiesuan").empty();	    
		    var content="已选中<span>"+count+"</span>门课程  &nbsp; &nbsp; &nbsp; &nbsp;合计：<span>￥"+sum+"</span>";
		    $("#jiesuan").append(content);
		    $("input[name=all]").click(function () {
		    	sum=0;
		        if (this.checked) {
		            $("input[name='shoppingcartIds']").prop("checked", true);
		            count=$("input[type='checkbox']:checked").length-1;
		        	$.each($("input[name='shoppingcartIds']"), function(){
						if(this.checked){
							price=$(this).parent().siblings().siblings().eq(5).html();
				            sum+=Number(price);				
						}
					});
		            
		            $("#jiesuan").empty();	    
				    var content="已选中<span>"+count+"</span>门课程  &nbsp; &nbsp; &nbsp; &nbsp;合计：<span>￥"+sum+"</span>";
				    $("#jiesuan").append(content);
		        } else {
		            $("input[name='shoppingcartIds']").prop("checked", false);
		            count=0;
					sum=0;
		            $("#jiesuan").empty();	    
				    var content="已选中<span>"+count+"</span>门课程  &nbsp; &nbsp; &nbsp; &nbsp;合计：<span>￥"+sum+"</span>";
				    $("#jiesuan").append(content);
		            
		        }
		    });
		     
		    $("input[name='shoppingcartIds']").click(function () {		    	
		        if (this.checked) {
		            count=$("input[type='checkbox']:checked").length;
		            price=$(this).parent().siblings().siblings().eq(5).html();
		            alert(price);
		            sum+=Number(price);
		            $("#jiesuan").empty();	    
				    var content="已选中<span>"+count+"</span>门课程  &nbsp; &nbsp; &nbsp; &nbsp;合计：<span>￥"+sum+"</span>";
				    $("#jiesuan").append(content);
		        } else {
		            count=$("input[type='checkbox']:checked").length;
		            price=$(this).parent().siblings().siblings().eq(5).html();
		            alert(price);
		            sum-=Number(price);
		            $("#jiesuan").empty();	    
				    var content="已选中<span>"+count+"</span>门课程  &nbsp; &nbsp; &nbsp; &nbsp;合计：<span>￥"+sum+"</span>";
				    $("#jiesuan").append(content);
		        }
		    });

		});
		
		function doDeletes() {
			var reason_arr = new Array();
			
			$.each($("input[name='shoppingcartIds']"), function(){
				if(this.checked){
					reason_arr.push($(this).val());					
				}
			});
			if(reason_arr.length == 0){
				alert("请选择需要删除的记录！");
			}else{
				var vals = reason_arr.join(",");	
				$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						shoppingcartIds: vals
						}, 
			        url:"${pageContext.request.contextPath }/shopping_cart/deleteClassByIds",
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
		
		function dopay(){
			var reason_arr = new Array();
			
			$.each($("input[name='shoppingcartIds']"), function(){
				if(this.checked){
					reason_arr.push($(this).val());					
				}
			});
			if(reason_arr.length == 0){
				alert("请选择需要结算的记录！");
			}else{
				var vals = reason_arr.join(",");	
				alert(vals)
				$.ajax({
					type: "post", 
					dataType:'json', //接受数据格式 
					cache:false, 
					data:{
						shoppingcartIds: vals
						}, 
			        url:"${pageContext.request.contextPath }/shopping_cart/orderlist",
			        success:function(result){
			        	if(result.state){
			        		
			        		window.location.href = "${pageContext.request.contextPath }/common/pay"
	
			        		
			        	}else{
			        		window.location.reload(true);
			        	}
					},
					error: function() {
						alert("失败")
					}

			   });
			}		
		}
		</script>
	</head>
	<body>
	<!-- start header -->
	<!--end header -->

<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			
			<div class="wdgwc fl ml40">我的购物车</div>
			<div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算</div>
			<div class="dlzc fr">
				<ul>
					<li><a href="./login.html" target="_blank">登录</a></li>
					<li>|</li>
					<li><a href="./register.html" target="_blank">注册</a></li>	
				</ul>
				
			</div>
			<div class="clear"></div>
		</div>
		
		<div class="xiantiao"></div>
		<div class="gwcxqbj" style="height:1000px">
			<div class="gwcxd center">
				<div class="top2 center">
					<div class="sub_top fl">
						<input type="checkbox" class="quanxuan" name="all" id="all" />全选
					</div>					
					<div class="sub_top fl">课程名称</div>					
					<div class="sub_top fl">机构</div>
					<div class="sub_top fl">类别</div>
					<div class="sub_top fl">单价</div>
					<div class="sub_top fr">操作</div>
					<div class="clear"></div>
				</div>
				<c:forEach items="${ShoppingCartbean.rows}" var="b" varStatus="vs">
				<div class="content2 center">
					<div class="sub_content fl ">
						<input type="checkbox" style="margin-top:50px" class="quanxuan"  name="shoppingcartIds" id="shoppingcartIds" value="${b.shoppingCartId  }"/>						
					</div>										
					<div class="sub_content fl"><a class="enter" href="javascript:void(0);" onclick="toIntoPeriod(${b.classId})"><img src="${b.classImg }" height="100px" width="80px" style="margin-top:10px"></a></div>
					<div class="sub_content fl " style="width:250px" >${b.classTitle }</div>
					<div class="sub_content fl " style="width:100px">${b.companyName }</div>	
					<div class="sub_content fl " style="width:100px">${b.classCid }</div>				
					<div class="sub_content fl " id="price">${b.classPrice}</div>
					<div class="sub_content fl"><a class="enter" href="javascript:void(0);" onclick="doDeletes()">×</a></div>
					<div class="clear"></div>
				</div>
				</c:forEach>

			</div>
			<div class="jiesuandan mt20 center">
				<div class="tishi fl ml20">
					<ul>
						<li><a href="./liebiao.html">继续购物</a></li>
						<li>|</li>
						<li><a class="enter" href="javascript:void(0);" onclick="doDeletes()">删除</a></li>
						<li>|</li>
						<li>共<span>${ShoppingCartbean.total }</span>件课程
						<li>|</li>
						<li>第<span>${ShoppingCartbean.currentPage }</span>页
						<li>|</li>
						<li><a href="javascript:void(0);" onclick="doChangePage(${ShoppingCartbean.currentPage},${ShoppingCartbean.total },1)">上一页</a></li>						
						<li>|</li>
						<li><a href="javascript:void(0);" onclick="doChangePage(${ShoppingCartbean.currentPage},${ShoppingCartbean.total },2)">下一页</a></li>
						<li>|</li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="jiesuan fr">
					<div class="jiesuanjiage fl" id="jiesuan"></div>
					<div class="jsanniu fr"><input class="jsan" type="submit" name="jiesuan"  value="去结算" onclick="dopay()" /></div>
					<div class="clear"></div>
				<div class="clear"></div>
			</div>
			
		</div>

  

	

		<footer class="mt20 center">			
			<div class="mt20">培训宝</div>

		</footer>
	</body>
</html>
