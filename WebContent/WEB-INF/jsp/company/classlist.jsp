<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">

<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/admin.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
	// 工具栏
	var toolbar = [ {
		id : 'button-view',	
		text : '编辑',
		iconCls : 'icon-search',
		handler : doView
	}, {
		id : 'button-add',
		text : '发布',
		iconCls : 'icon-ok',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '禁用',
		iconCls : 'icon-cancel',
		handler : doDelete
	}];
	//定义冻结列
	var frozenColumns = [ [ {
		field : 'classId',
		checkbox : true,
		rowspan : 2
	} ] ];


	// 定义标题栏
	var columns = [ [  {
		field : 'classTitle',
		title : '课程名称',
		width : 100,
		rowspan : 2
	},{
		field : 'classSellPoint',
		title : '课程卖点',
		width : 200,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'classPrice',
		title : '课程价格',
		width : 140,
		rowspan : 2,
		align : 'center'
	},{
		field : 'classCount',
		title : '课时数',
		width : 140,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'classStatus',
		title : '课程状态',
		align : 'center',
		width : 140,
		rowspan : 2,
		formatter : function(data,row, index){
			if(data==0){
				return "没有发布"
			}else if(data==1){
				return "正常使用";
			}else if(data==2){
				return "下架";
			}
			else {
				return "删除";
			}
		}
	} ]
	];
	$(function(){
		$("body").css({visibility:"visible"});
		// 初始化 datagrid
		// 创建grid
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			method:"get",
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			pageList: [1,2,3],
			pagination : true,
			pageSize:3,
			toolbar : toolbar,//工具栏
			idField : 'classId', 
			url : "${pageContext.request.contextPath }/classes/findSomeClasses", 
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
	
	function doAdd() {
		alert("添加用户");
		location.href="${pageContext.request.contextPath}/common/addClass";
	}

	function doView() {
		alert("编辑用户");
		var item = $('#grid').datagrid('getSelected');
		console.info(item);
		//window.location.href = "edit.html";
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
	
</script>		
</head>
<body class="easyui-layout" style="visibility:hidden;">
<div region="north" style="height:150px" border="false">

   <div class="admin-index">
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 100}">
        <dt class="qs"><i class="am-icon-users"></i></dt>
        <dd>455</dd>
        <dd class="f12">团队数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 300}">
        <dt class="cs"><i class="am-icon-area-chart"></i></dt>
        <dd>455</dd>
        <dd class="f12">今日收入</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 600}">
        <dt class="hs"><i class="am-icon-shopping-cart"></i></dt>
        <dd>455</dd>
        <dd class="f12">商品数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 900}">
        <dt class="ls"><i class="am-icon-cny"></i></dt>
        <dd>455</dd>
        <dd class="f12">全部收入</dd>
      </dl>
    </div>
 
</div>
  
    <div region="center" border="false">
    	<table id="grid"></table>
	</div>

</div>

</body>
</html>