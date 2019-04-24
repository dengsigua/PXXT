<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>个人中心</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.default.css" type="text/css" />		
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/support.js"></script>
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
					<li><a href="${pageContext.request.contextPath }/common/dingdanzhongxin" >我的课程</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_collection">我的收藏</a></li>
					<li><a href="${pageContext.request.contextPath }/common/self_comment">我的评价</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="./self_info.html" style="color:#ff6700;font-weight:bold;">基本资料</a></li>
					<li><a href="">账户安全</a></li>
					
				</ul>
			</div>
		</div>
		


    <div class="centercontent">          
        <div id="contentwrapper" class="contentwrapper withrightpanel">       
        	<div class="subcontent chatcontent">                  
                   <div id="chatmessage" class="chatmessage radius2">
                   		<div id="chatmessageinner"></div><!--chatmessageinner-->
                   </div><!--chatmessage-->                   	
                   <div class="messagebox radius2">
                   		<button>发送</button>
                   		<span class="inputbox">
                   			<input type="text" id="msgbox" name="msgbox"  />
                        </span>                       
                   </div>                  
            </div><!--subcontent-->       
        </div><!--contentwrapper-->
        
        
        <div class="rightpanel">
        	<div class="rightpanelinner">
                <div class="widgetbox uncollapsible">
                	<div class="title"><h4>历史课程</h4></div>
                    <div class="widgetcontent nopadding">
                    	<div class="chatsearch">
                        	<input type="text" name="" value="Search" />
                        </div>
                    	<ul class="contactlist">
                        	<li class="online new"><a href=""><img src="images/thumbs/avatar5.png" alt="" /> <span>Hiccup Haddock III</span></a><span class="msgcount">3</span></li>
                            <li><a href=""><img src="images/thumbs/avatar6.png" alt="" /> <span>Astrid Hofferson</span></a></li>
                            <li class="online"><a href=""><img src="images/thumbs/avatar7.png" alt="" /> <span>Vector</span></a></li>
                            <li class="online"><a href=""><img src="images/thumbs/avatar8.png" alt="" /> <span>Puss in Boots</span></a></li>
                            <li class="online new"><a href=""><img src="images/thumbs/avatar9.png" alt="" /> <span>Humpty Dumpty</span></a><span class="msgcount">1</span></li>
                            <li><a href=""><img src="images/thumbs/avatar10.png" alt="" /> <span>Shrek</span></a></li>
                            <li><a href=""><img src="images/thumbs/avatar11.png" alt="" /> <span>Princess Fiona</span></a></li>
                        </ul>
                    </div><!--widgetcontent-->
                </div><!--widgetbox-->
            </div><!--rightpanelinner-->
        </div><!--rightpanel-->       
	</div><!-- centercontent -->   


		
		
		
		
		
		
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">培训宝</div>
		</footer>
	</body>
</html>