<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">

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
							<li>${student.studentTel},欢迎您。</li>
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
					<li><a href="" style="color:#ff6700;font-weight:bold;">基本资料</a></li>
					<li><a href="${pageContext.request.contextPath }/common/edit_info2">账户安全</a></li>
					
				</ul>
			</div>
		</div>
		<div class="rtcont fr">	
			<div class="ddzxbt">我的资料</div>				
			<div style="padding:10px 10px 10px 10px">
	       <form id="studentEditForm" class="itemForm" method="post" action="${pageContext.request.contextPath }/student/edit_info">
	       <table cellpadding="5" style="border-spacing:25px 10px">          
	            <input class="easyui-textbox" type="hidden" name="studentId" id="studentId" value="${student.studentId}" ></input>	        
      
	            <input class="easyui-textbox" type="hidden" name="studentPassword" id="studentPassword" value="${student.studentPassword}" ></input>

	            <input class="easyui-textbox" type="hidden" name="studentState" id="studentState" value="${student.studentState}"  ></input>	        

	        <tr>
	            <td>头像</td>
	            <td>
	            	 <a href="javascript:void(0)" class="easyui-linkbutton" id="J_selectImage">上传图片</a>
	                 <div id="test1" style="margin-top:10px">
	                 	<!--  <img id="img" src="${student.studentImg}" height="100px" width="100px">	-->
	                 	<c:if test="${student.studentImg==null }">
					<img id="img" src="/wsy1/image/tou_default.gif"  height="100px" width="100px" alt="头像"/>
				</c:if >
				<c:if test="${student.studentImg!=null }">
					<img id="img" src="${student.studentImg }"  height="100px" width="100px" alt="头像"/>
				</c:if>
	                 </div>
	                <input type="hidden" id="studentImg" name="studentImg" value="${student.studentImg }" />
	            </td>
	        </tr>

	        <tr>
	            <td><span>昵称</span></td>
	            <td><input class="easyui-textbox" type="text" name="studentName" id="studentName" value="${student.studentName}" data-options="required:true" style="width: 350px;"></input></td>
	        </tr>
	        <tr> 
	            <td>联系方式</td>
	            <td><input class="easyui-textbox" name="studentTel" id="studentTel" value="${student.studentTel }"  data-options="min:1,max:99999999,precision:2,required:true" style="width: 350px;"></input></td>
	        </tr>
	        <tr>
	            <td>电子邮箱</td>
	            <td><input class="easyui-textbox" type="text" name="studentEmail"  id="studentEmail" value="${student.studentEmail }"  data-options="min:1,max:99999999,precision:2,required:true" style="width: 350px;" />
	            </td>
	        </tr>
	        
	        <tr>
	            <td>兴趣爱好</td>
	            <td><input class="easyui-textbox"  name="studentIntrest"  id="studentIntrest" value="${student.studentIntrest }"  data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 350px;" />
	            </td>
	        </tr>
	        

	      
	    </table>
	   
	</form>
	<div style="padding:5px;position:relative;left:110px" >
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</a>
	   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">取&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;消</a>
		<font color="#ff0000">${msg }</font>
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

<script type="text/javascript">

	KindEditor.ready(function(K) {
		var editor = K.editor({
			resizeMode : 0, //2或1或0，2时可以拖动改变宽度和高度，1时只能改变高度，0时不能拖动。
			allowFileManager : false, //true时显示浏览远程服务器按钮
			allowPreviewEmoticons : true, //true时显示浏览音频远程服务器按
			filePostName  : "uploadFile",
			//指定上传文件请求的url。
			uploadJson : '${pageContext.request.contextPath }/pic/upload',
			//上传类型，分别为image、flash、media、file
			dir : "image"
		});
		
		K('#J_selectImage').click(function() {
			editor.loadPlugin('image', function() {
				editor.plugin.imageDialog({
					clickFn : function(url, title, width, height, border, align) {
						var div = K('#test1');
						div.html('');
						 var strs = url.split("/");
						
						 var url1 = "http://";
						 for(var i in strs){
							 if(i>2&&i<strs.length-1){
								 url1=url1+strs[i]+"/"
								}					    		
					      }
						 url1=url1+strs[strs.length-1];
						 K('#studentImg').val(url1);
						div.append('<img src="' + url1 + '" height="100px" width="100px">' );
						editor.hideDialog();
					}
				});
			});
		});
	
	});
	
	
	//提交表单
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#studentEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		
		
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		
		$("#studentEditForm").submit();		
	
	}
	function clearForm(){
		$('#studentEditForm').form('reset');
		editor1.html('');
	}
</script>
	
</body>

</html>