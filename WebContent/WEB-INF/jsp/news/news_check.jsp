<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>通知列表</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/color.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/demo/demo.css">	
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>	
<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />		
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.grid.css" />
<!--  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.7.0.js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.7.0.js/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.7.0.js/themes/color.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.7.0.js/demo/demo.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.7.0.js/jquery.easyui.min.js"></script>
-->
</head>

<body>
	<div class="place" >
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">教学安排</a></li>
    <li><a href="#">通知列表</a></li>
    </ul>
    </div>
	<div style="margin:20px 0;"></div>
	<table id="dg" class="easyui-datagrid" title="通知列表" 
			data-options="rownumbers:true,url:'${pageContext.request.contextPath }/news/findnews',method:'get',toolbar:'#tb',collapsible:true,remoteSort:false,
				multiSort:true"
			pagination="true" idField="newsId"
			rownumbers="true" fitColumns="true"
			nowrap="true"
			 >
		<thead>
			<tr>
			    <th data-options="field:'ck',checkbox:true" ></th>
				<!--  <th data-options="field:'newsId',width:170">通知ID</th>-->
				<th data-options="field:'newsName',width:170,align:'center',sortable:true">通知主题</th>
				<th data-options="field:'newsType',width:170,align:'center',sortable:true">通知类型</th>
				<th data-options="field:'newsTarget',width:170,align:'center',sortable:true">通知范围</th>
				<th data-options="field:'newsTime',width:170,align:'center',sortable:true,
				formatter:function(value,row,index){ 
var date = new Date(value); 
return myformatter(date); 
} 
				" >发布时间</th>
				<th data-options="field:'newsDesc',width:170,align:'center',align:'center',sortable:true,formatter:show1">通知内容</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding:5px;height:auto">
		<div style="margin-bottom:5px">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
			<input class="easyui-textbox" id="searchname" data-options="prompt:'请在此输入查询条件'," style="width:200px;">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchUser()">搜索</a>		
		</div>
		<!--<div>
			 日期范围: <input class="easyui-datebox" style="width:120px">
			- <input class="easyui-datebox" style="width:120px">
			
			<select class="easyui-combobox" panelHeight="auto" style="width:180px">
				<option value="java">Java</option>
				<option value="c">C</option>
				<option value="basic">Basic</option>
				<option value="perl">Perl</option>
				<option value="python">Python</option>
			</select> 
			<input class="easyui-textbox" id="searchid" data-options="prompt:'请输入学员昵称'," style="width:250px;height:27px;line-height:26px;border:1px solid #ccc">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchUser()">搜索</a>		
		</div>-->
		<!-- <div>
			<input class="easyui-textbox" data-options="buttonText:'搜索',buttonIcon:'icon-search',prompt:'请输入学员昵称'" style="width:300px;height:27px;">			
		</div> -->
		
		
	</div>
	
	<div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
		<form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
			<h3>通知信息</h3>
		
			<div style="margin-bottom:10px">
				<input name="newsName" class="easyui-textbox" required="true" label="通知主题:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="newsType" class="easyui-textbox" required="true" label="通知类型:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="newsTarget" class="easyui-textbox" required="true" label="通知范围:" style="width:100%">
			</div>
			<!-- <div style="margin-bottom:10px">
				<input name="newsTime"  class="easyui-textbox" required="true" label="发布时间:" style="width:100%">
			</div> -->
			<div style="margin-bottom:10px">
				<input name="newsDesc" class="easyui-textbox" required="true" label="通知内容:"  style="width:100%">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>
	</div>
	
	<script type="text/javascript">
		var url;
		function editUser(){
			var row = $('#dg').datagrid('getSelected');
			alert(row.newsId);
			if (row){
				$('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑');
				$('#fm').form('load',row);
				url = '${pageContext.request.contextPath}/news/editnews?id='+row.newsId;
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
						$.post('${pageContext.request.contextPath}/sign_up/deletesignup',{ids:row.signUpId},function(result){
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

		function destroyUser(){
			var rows = $('#dg').datagrid('getSelections');
			if(rows.length == 0){			
				$.messager.alert("提示信息","请选择需要删除的记录！","warning");
			}else{		
				var array = new Array();
				for(var i=0;i<rows.length;i++){
					var id = rows[i].signUpId;
					array.push(id);
				}
				var ids = array.join(",");
				alert(ids);
				window.location.href = '${pageContext.request.contextPath}/sign_up/deletesignup?ids='+ids;
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
					var id = rows[i].newsId;
					array.push(id);
				}
				var ids = array.join(",");
				alert(ids);
				$.messager.confirm('注意','你确定要删除这条信息吗',function(r){
					if (r){
						$.post('${pageContext.request.contextPath}/news/deletenews',{ids:ids},function(result){
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
			var searchids=$('#searchname').val();
			alert(searchids);
			$('#dg').datagrid('load',{
				newsName: $('#searchname').val(),
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
			
			return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d)+' '+(h<10?('0'+h):h)+':'+(min<10?('0'+min):min)+':'+(s<10?('0'+s):s); 
			}

	</script>
</body>
</html>