<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>场地列表</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/color.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/demo/demo.css">	
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>	
    <link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />		
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.grid.css" />
</head>
<body>
<div class="place" >
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">机构课程</a></li>
    <li><a href="#">课程发布</a></li>
    </ul>
    </div>
	<div style="margin:20px 0;"></div>
	<table id="dg" class="easyui-datagrid" title="场地列表" 
			data-options="rownumbers:true,url:'${pageContext.request.contextPath }/place/findplace',method:'post',toolbar:'#tb',collapsible:true,remoteSort:false,
				multiSort:true"
			pagination="true"
			rownumbers="true" fitColumns="true"  
			nowrap="true"
			>
		<thead>
			<tr>
			    <th data-options="field:'ck',checkbox:true" ></th>
			    <th data-options="field:'placeId',align:'center',sortable:true,hidden: true">ID</th>
				<th data-options="field:'placeName',width:170,align:'center',sortable:true">标题</th>
				<th data-options="field:'placeAddress',width:170,align:'center',sortable:true">地址</th>
				<th data-options="field:'placeCompany',width:170,align:'center',sortable:true">所属机构</th>
				<th data-options="field:'placeStarttime',width:170,align:'center',sortable:true,
				formatter:function(value,row,index){ 
var date = new Date(value); 
return myformatter(date); 
} 
				" >起始时间</th>
				<th data-options="field:'placeEndtime',width:170,align:'center',sortable:true,
				formatter:function(value,row,index){ 
var date = new Date(value); 
return myformatter(date); 
} 
				" >结束时间</th>
				<th data-options="field:'placeSize',width:170,align:'center',sortable:true">场地规模</th>
				<!--  <th data-options="field:'placeState',width:170,align:'center',sortable:true">场地状态</th>-->
				<th data-options="field:'placeContent',width:170,align:'center',sortable:true,formatter:show1">场地介绍</th>
				<th data-options="field:'placeTel',width:170,align:'center',sortable:true">联系方式</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding:5px;height:auto">
		<div style="margin-bottom:5px">
			<!--  <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>-->
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
			<!--  <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveUser()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="cutUser()">剪切</a>-->
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
			<input class="easyui-textbox" id="searchname" data-options="prompt:'请在此输入查询条件'," style="width:200px;">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchUser()">搜索</a>		
		</div>
		</div>
	
	<div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
		<form id="fm" method="post"  action="" style="margin:0;padding:20px 50px">
			<h3>场地信息</h3>
			<input type="hidden" name="placeId" >
			<div style="margin-bottom:10px">
				<input name="placeName" class="easyui-textbox" required="true" label="标题:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeAddress" class="easyui-textbox" required="true" label="地址:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeCompany" class="easyui-textbox" required="true" label="所属机构:" style="width:100%">
			</div>
			
			<div style="margin-bottom:10px">
				<input name="placeSize" class="easyui-textbox" required="true" label="场地规模:"  style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeState" class="easyui-textbox" required="true" label="场地状态:"  style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeTel" class="easyui-textbox" required="true" label="联系方式:"  style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeContent" class="easyui-textbox" required="true" label="场地介绍:"  style="width:100%">
			</div>
			<!--  <div style="margin-bottom:10px">
				<input name="placeStarttime" class="easyui-datebox" required="true"  label="起始时间:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="placeEndtime"  class="easyui-datebox" required="true" label="结束时间:" style="width:100%">
			</div> --> 
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>
	</div>
	
	<script type="text/javascript">
		var url;
		function newUser(){
			$('#dlg').dialog('open').dialog('center').dialog('setTitle','新增');
			$('#fm').form('clear');	
			url = '${pageContext.request.contextPath }/place/addplace';
		}
		function editUser(){
			var row = $('#dg').datagrid('getSelected');
			alert(row.placeId);
			if (row){
				$('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑');
				$('#fm').form('load',row);
				url = '${pageContext.request.contextPath}/place/editplace?id='+row.placeId;
			}
		}
		function saveUser(){		
		$('#fm').form('submit',{
			url: url,
			onSubmit: function(){
			return $(this).form('validate');
			},
			success: function(result){
			var result = eval('('+result+')');					
			if (result.success){
			   //alert("xx");
			   // $('#dlg').dialog('close');		// close the dialog
			   $('#dg').datagrid('reload');	// reload the user data					
		   } else {
			   $.messager.show({
			   title: 'Error',
			   msg: result.errorMsg
			 });						
		   }
		  }
			});
			$('#dlg').dialog('close');		// close the dialog
			$('#dg').datagrid('reload');
			$.messager.alert('提示','操作成功，请刷新!');
		}
		<!--
		function destroyUser(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.confirm('注意','你确定要删除这条信息吗',function(r){
					if (r){
						$.post('${pageContext.request.contextPath}/place/deleteplace',{ids:row.placeId},function(result){
							if (result.success){								
								$('#dg').datagrid('reload');	// reload the user data								
								$.messager.alert('提示','操作成功!');
							} else {
								$.messager.show({	// show error message
									title: 'Error',
									msg: result.errorMsg
								});
							}
						},'json');
					}
				});				
			}
		}
		-->
		function destroyUser(){
			var rows = $('#dg').datagrid('getSelections');	
			if(rows.length == 0){			
				$.messager.alert("提示信息","请选择需要删除的记录！","warning");
			}else{			
			if (rows){
				var array = new Array();
				for(var i=0;i<rows.length;i++){
					var id = rows[i].placeId;
					array.push(id);
				}
				var ids = array.join(",");
				alert(ids);
				$.messager.confirm('注意','你确定要删除这条信息吗',function(r){
					if (r){
						$.post('${pageContext.request.contextPath}/place/deleteplace',{ids:ids},function(result){
							if (result.success){								
								$('#dg').datagrid('reload');	// reload the user data
								$.messager.alert('提示','操作成功!');
							} else {
								$.messager.show({	// show error message
									title: 'Error',
									msg: result.errorMsg
								});
							}
						},'json');
					}
				});				
			}	
			}
		}

		
		function searchUser(){	
			alert("搜索");
			var searchids=$('#searchname').val();
			alert(searchids);
			$('#dg').datagrid('load',{
				placeName: $('#searchname').val(),
			});
		}
		
		function show1(val,row){
		    if (val){
		        return '<span style="font-size:15px" title="' + val + '">' + val + '</span>';
		    } else {
		        return val;
		    }
		}

		function show2(value, row, index){
		    var content = '';
		    if(value != undefined && value != '' && value != null ){ 
		        var abValue = value +'';
		        content = '<a style="font-size:15px" href="javascript:void(0);"  title="' + abValue + '" class="easyui-tooltip">' + abValue + '</a>'; 
		    }   
		    return content;
		}

		
		function myformatter(date){ 
			var y = date.getFullYear(); 
			var m = date.getMonth()+1; 
			var d = date.getDate();
			var h = date.getHours();
			var min = date.getMinutes();
			var s = date.getSeconds();
			
			return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d); 
			}
	</script>
</body>
</html>