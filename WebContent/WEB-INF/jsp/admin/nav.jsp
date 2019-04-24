<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/skin_/nav.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<title>底部内容页</title>

<script type="text/javascript">
	function admin_1(x) {
	  // var name = x.value;
	//    alert(x);
	    var path;
	    if(x==1){
	    	alert("1");
	    	path = "company_home";
	    }else if(x==2){
	    	alert("2");
	    	path = "company_form";
	    }else if(x==4){
	    	alert("4");
	    	path = "student_home";
	    }else if(x==5){
	    	alert("5");
	    	path = "student_form";
	    }

		var e = $("#center_tabs").tabs("exists",path);
		 alert(e);
		
		if(e){
			$("#center_tabs").tabs("select",path);
		}else{
			$("#center_tabs")
			.tabs(
					"add",
					{
						title : path,
						content : '<iframe frameborder="0" width="100%" height="100%" src="${pageContext.request.contextPath }/common/'+path+'"></iframe>',
						closable : true,
						iconCls : 'icon-search'
					});
		}

	}
	
</script>
<body class="easyui-layout">

	
	<div title="系统菜单" data-options="region:'west'" style="width: 200px">
		<!-- 折叠面板效果 -->
			<div class="easyui-accordion" data-options="fit:true" style="display: block">
			<!-- 每个子div是其中的一个面板 -->
			<div title="系统管理" >
				 	<ul>
				 		<li><a id="7" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text"  >系统首页</span></a></li>
				 		<li><a id="8" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text"  >数据管理</span></a></li>
				 		<li><a id="9" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >xxxxxx</span></a></li>
				 	</ul>
			</div>
			<div title="机构管理" >
				 	<ul>
				 		<li><a id="1" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >数据统计</span></a></li>
				 		<li><a id="2" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text"  >数据管理</span></a></li>
				 		<li><a id="3" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >xxxxxx</span></a></li>
				 	</ul>
			</div>
			<div title="用户管理">
				 <ul>
				 		<li><a id="4" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >数据统计</span></a></li>
				 		<li><a id="5" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >数据管理</span></a></li>
				 		<li><a id="6" href="javascript:void(0);" onclick="admin_1(this.id)"><span class="subnav-text" >xxxxxx</span></a></li>
				 		<li><button>SD</button></li>
				 </ul>
			</div>
			<div title="面板三">test3</div>
		</div>
		
		
		
		
	</div>
	<div data-options="region:'center'">
		<div id="center_tabs" class="easyui-tabs" data-options="fit:true">
			
		</div>
	
	</div>
	
	<div data-options="region:'south'" style="height: 30px">管理员</div>


</body>
</html>