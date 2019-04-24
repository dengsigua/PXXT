<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/skin_/table.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.grid.css" />
<title>Insert title here</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
	// 工具栏
	
	//定义冻结列
	var frozenColumns = [ [ {
		field : 'companyId',
		checkbox : true,
		rowspan : 2
	}, {
		field : 'companyName',
		title : '机构名称',
		width : 100,
		rowspan : 2
	} ] ];


	// 定义标题栏
	var columns = [ [ {
		field : 'companyCity',
		title : '所属城市',
		width : 80,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'companyContacts',
		title : '联系人',
		width : 140,
		rowspan : 2,
		align : 'center'
	}, {
		title : '其他信息',
		colspan : 2
	}, {
		field : 'companyTel',
		title : '联系方式',
		align : 'center',
		width : 140,
		rowspan : 2
	} ], [ {
		field : 'companyEmail',
		title : '机构邮箱',
		width : 170,
		align : 'center'
	}, {
		field : 'companyLabels',
		title : '机构标签',
		width : 170,
		align : 'center'
	}, {
		field : 'companyState',
		title : '状态',
		width : 100,
		align : 'center',
		formatter : function(data,row, index){
				if(data==0){
					return "未启用"
				}else if(data==1){
					return "正常使用";
				}else if(data==2){
					return "已禁用";
				}
				
			}
	}] ];
	$(function(){
		$("body").css({visibility:"visible"});
		// 初始化 datagrid
		// 创建grid
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			method:"post",
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			pageList: [3,5,10],
			pagination : true,
			pageSize:3,
			toolbar : "#tb",//工具栏
			idField : 'companyId', 
			url : "${pageContext.request.contextPath }/admin/findSomeCompany", 
			frozenColumns : frozenColumns,
			columns : columns,
			onClickRow : onClickRow,
			onDblClickRow : doDblClickRow
		});
		
	
		
	});
	// 双击
	function doDblClickRow(rowIndex, rowData) {
		var items = $('#grid').datagrid('selectRow',rowIndex);
		doView();
	}
	// 单击
	function onClickRow(rowIndex){

	}
	
	



	function doDelete() {
		alert("禁用用户");
	
		var rows = $('#grid').datagrid('getSelections');
		if(rows.length == 0){	
			$.messager.alert("提示信息","请选择需要删除的记录！","warning");
		}else{
		
			var array = new Array();
			for(var i=0;i<rows.length;i++){
				var id = rows[i].companyId;
				array.push(id);
			}
			var ids = array.join(",");
			alert(ids);
			window.location.href = '${pageContext.request.contextPath}/admin/prohibitCompany?ids='+ids;
		}
	}
	
	function doAllow() {
		alert("解禁用户");
	
		var rows = $('#grid').datagrid('getSelections');
		if(rows.length == 0){	
			$.messager.alert("提示信息","请选择需要解禁的记录！","warning");
		}else{
		
			var array = new Array();
			for(var i=0;i<rows.length;i++){
				var id = rows[i].companyId;
				array.push(id);
			}
			var ids = array.join(",");
			alert(ids);
			window.location.href = '${pageContext.request.contextPath}/admin/allowCompany?ids='+ids;
		}
	}
	function doSearch() {
		$('#grid').datagrid("load",{
			"companyName": $("#companyName").val(),
			"companyCity": $("#companyCity").val()
		} );
	
	}
</script>		
</head>
<body class="easyui-layout" style="visibility:hidden;">
    <div region="center" border="false">
    	<table id="grid"></table>
	</div>
	<div id="tb">
	         机构名称：<input type="text" name="companyName"  id="companyName" />
	         所属城市：<input type="text" name="companyCity"  id="companyCity" />
		<a id="searchbtn" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">搜索</a> 
        <a id="prohitbtn" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="doDelete()">禁止</a> 
        <a id="unprohitbtn" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doAllow()">解禁</a> 
	</div>
</body>
</html>