<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>
<link href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" />
<title>Insert title here</title>
<script language="javascript">

function doSearch() {
	
	var classTitle = $("#classTitle").val();
	var classPrice1 = $("#classPrice1").val();
	var classPrice2 = $("#classPrice2").val();
	//alert(classTitle+"xxx"+classPrice1+"xxx"+classPrice2);
	$.ajax({
			type: "post", 
			dataType:'json', //接受数据格式 
			cache:false, 
			data:{
				classTitle:classTitle,
				classPrice1:classPrice1,
				classPrice2:classPrice2,
				currentPage:1
				}, 
	        url:"${pageContext.request.contextPath }/classes/classeslist",
	        success:function(dates){
		      window.location.reload(true);
			},
			error: function() {
             
			}

	   });
	
} 


function doChangePage(currentPage) {
	//alert(currentPage);
	var classTitle = $("#classTitle").val();
	var classPrice1 = $("#classPrice1").val();
	var classPrice2 = $("#classPrice2").val();
//	alert(classTitle+"xxx"+classPrice1+"xxx"+classPrice2);
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
function doDeletes() {
	var reason_arr = new Array();
	
	$.each($("input[name='classIds']"), function(){
		if(this.checked){
			reason_arr.push($(this).val());
		}
	});
	if(reason_arr.length == 0){
		$.messager.alert("提示信息","请选择需要删除的记录！","warning");
	}else{
		var vals = reason_arr.join(",");	
		$.ajax({
			type: "post", 
			dataType:'json', //接受数据格式 
			cache:false, 
			data:{
				classIds:vals
				}, 
	        url:"${pageContext.request.contextPath }/classes/deleteClassByIds",
	        success:function(result){
	        	if(result.state){
	        		$.messager.alert("提示信息","删除成功！","warning");
	        		var C=document.getElementById("searchli");
	        		C.onclick();
	        	}else{
	        		$.messager.alert("提示信息","删除失败！","warning");
	        	}
			},
			error: function() {
				$.messager.alert("提示信息","网络异常！","warning");
			}

	   });
	//	alert("xx");
	}
	
}
/**
 * 编辑函数
 */
function doEdit() {
var reason_arr = new Array();
	
	$.each($("input[name='classIds']"), function(){
		if(this.checked){
			reason_arr.push($(this).val());
		}
	});
	if(reason_arr.length == 0){
		$.messager.alert("提示信息","请选择需要编辑的记录！","warning");
	}else if(reason_arr.length > 1){
		$.messager.alert("提示信息","一次只能编辑一条记录！","warning");
	}else{
		var vals = reason_arr.join(",");
		alert(vals);
		window.location.href =  "${pageContext.request.contextPath }/classes/findClassById?classId="+vals;
	}
}

function toIntoPeriod(id,Imgsource) {
	alert(id+"....");
	window.location.href = "${pageContext.request.contextPath }/period/toList?classId="+id;
	//$.post("${pageContext.request.contextPath }/period/toList",{classId:id,Imgsource:Imgsource});
}
</script>
</head>

<body>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">机构课程</a></li>
    <li><a href="#">课程发布</a></li>
    </ul>
    </div>  
    <div class="rightinfo">  
    <div class="tools"> 
    	<ul class="toolbar">
    	<li>&nbsp;课程名称：<input class="easyui-textbox"  type="text" name="classTitle"  id="classTitle" style="height:25px"/></li>
	    <li>&nbsp;课程价格：<input class="easyui-numberbox" type="text" name="classPrice1"  id="classPrice1" style="height:25px"/></li>
	    <li>-----</li>
	    <li>&nbsp;至&nbsp;&nbsp;<input class="easyui-numberbox" type="text" name="classPrice2"  id="classPrice2" style="height:25px"/></li>
        </ul>
        <ul class="toolbar1">
        <li id="searchli" class="click" onclick="doSearch()"><span><img src="${pageContext.request.contextPath }/images/search.png" /></span>搜索</li>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <li class="click" onclick="doEdit()"><span><img src="${pageContext.request.contextPath }/images/t02.png" /></span>修改</li>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <li class="click" onclick="doDeletes()"><span><img src="${pageContext.request.contextPath }/images/t03.png" /></span>删除</li>
        </ul>
    </div>
    
    <ul class="classlist" id="classlist1">
    <c:forEach items="${Classbean.rows}" var="b" varStatus="vs">
     <li>
    <div style="width:7%;height:20px;"><input type="checkbox" name="classIds" id="classIds" value="${b.classId }" id="calssIds"></input></div>
   		<span><img src="${b.classImg }"  height="195px" width="130px"/></span>
    		<div class="lright" style="margin-top:30px" >
    
   				 <h3>课程名称:${b.classTitle }</h2>
   				 <p>课程售价:${b.classPrice/100.00 }
   				 <br/>课程状态：
   				 <c:if test="${b.classStatus ==0 }">未发布</c:if>
   				 <c:if test="${b.classStatus ==1 }">正常</c:if>
   				 <c:if test="${b.classStatus ==2 }">已下架</c:if>
   				<br/>
   				<p>课程类别:${b.classCid }<br/>
   				 <a class="enter" href="javascript:void(0);" onclick="toIntoPeriod(${b.classId})">进入课程</a>
    			</div>
    </li>
    </c:forEach>
 
    </ul>  
    <div class="clear"></div>
    <div class="pagin">
    	<div class="message">共<i class="blue">${Classbean.total }</i>条记录，当前显示第&nbsp;<i class="blue">${Classbean.currentPage }&nbsp;</i>页
       
       
       
        <a class="nextPage"
		href="javascript:void(0);" onclick="doChangePage(${Classbean.currentPage==1?1:Classbean.currentPage-1})">&lt;&lt;上一页</a>
		
       <a class="nextPage"
       href="javascript:void(0);" onclick="doChangePage(${Classbean.currentPage==bean.total?Classbean.total:Classbean.currentPage+1})">&lt;&lt;下一页</a>
       </div>
       
    </div>
    
    
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="${pageContext.request.contextPath }/images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>

    
    </div>
</body>
</html>
