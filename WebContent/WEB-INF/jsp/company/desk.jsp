<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的桌面</title>
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">我的桌面</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>常用列表</span></div>
    
    <div class="toolsli">
    <ul class="toollist">
    <li><a href="${pageContext.request.contextPath }/company/class_manage"><img src="${pageContext.request.contextPath }/images/i01.png" /></a><h2>课程列表</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/student_list2"><img src="${pageContext.request.contextPath }/images/i02.png" /></a><h2>组班列表</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/news_check"><img src="${pageContext.request.contextPath }/images/i03.png" /></a><h2>通知列表</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/student_list"><img src="${pageContext.request.contextPath }/images/i04.png" /></a><h2>学员列表</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/place_list2"><img src="${pageContext.request.contextPath }/images/i05.png" /></a><h2>场地列表</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/comment_list"><img src="${pageContext.request.contextPath }/images/i09.png" /></a><h2>评论列表</h2></li> 
    </ul>
    <span class="tooladd"><img src="${pageContext.request.contextPath }/images/add.png" title="添加" /></span> 
    </div>
    
    <div class="formtitle"><span>数据发布</span></div>
    
    <div class="toolsli">
    <ul class="toollist">
    <li><a href="${pageContext.request.contextPath }/company/class_release"><img src="${pageContext.request.contextPath }/images/i06.png" /></a><h2>课程发布</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/news_release"><img src="${pageContext.request.contextPath }/images/i07.png" /></a><h2>通知发布</h2></li>
    <li><a href="${pageContext.request.contextPath }/company/place_release"><img src="${pageContext.request.contextPath }/images/i08.png" /></a><h2>场地发布</h2></li>         
    </ul>
    <span class="tooladd"><img src="${pageContext.request.contextPath }/images/add.png" title="添加" /></span>  
    </div>
    
    
    
    </div>
</body>
</html>