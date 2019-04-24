<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报名列表</title>
<link rel="stylesheet" type="text/css" href="https://www.jeasyui.com/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="https://www.jeasyui.com/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="https://www.jeasyui.com/easyui/themes/color.css">
	<link rel="stylesheet" type="text/css" href="https://www.jeasyui.com/easyui/demo/demo.css">	
	<script type="text/javascript" src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="https://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
	
	<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />
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
    <div style="margin:20px 0;"></div>
	<table id="dg" title="学员列表" class="easyui-datagrid" "
			url="${pageContext.request.contextPath }/company/findSomeStudent"
			toolbar="#toolbar" pagination="true"
			rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="studentId" width="50">学员id</th>
				<th field="studentName" width="50">学员昵称</th>
				<th field="studentTel" width="50">联系方式</th>
				<th field="studentEmail" width="50">Email</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
	</div>
	
	<div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
		<form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
			<h3>学员信息</h3>
			<div style="margin-bottom:10px">
				<input name="studentId" value="${studentId}"  class="easyui-textbox" required="true" label="学员id:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="studentName" value="${ studentName}" class="easyui-textbox" required="true" label="学员昵称:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="studentTel"  value="${studentTel }" class="easyui-textbox" required="true" label="联系方式:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="studentEmail" value="${studentEmail}" class="easyui-textbox" required="true" validType="email" label="Email:" style="width:100%">
			</div>
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
			alert("添加!");
			url = '${pageContext.request.contextPath}/company/addstudent';
		}
		function editUser(){
			var row = $('#dg').datagrid('getSelected');
			alert(row.studentId);
			if (row){
				$('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑');
				$('#fm').form('load',row);
				url = '${pageContext.request.contextPath}/company/editstudent?id='+row.studentId;
			}
		}
		function saveUser(){
			alert("保存1!");
			$('#fm').form('submit',{				
				url: url,
				onSubmit: function(){
					return $(this).form('validate');
				},
				success: function(result){
					var result = eval('('+result+')');
					if (result.errorMsg){
						$.messager.show({
							title: 'Error',
							msg: result.errorMsg
						});
					} else {
						$('#dlg').dialog('close');		// close the dialog
						$('#dg').datagrid('reload');	// reload the user data
					}
				}
			});
			alert("保存2!");
		}
		function destroyUser(){
			var row = $('#dg').datagrid('getSelected');
			alert(row.studentId);
			if (row){
				$.messager.confirm('注意','你确定要删除这条信息吗',function(r){
				if (r){		
					    
					//var strids=[];
                    //for(var i=0;i<row.length;i++)
                       // {
                       // strids.push(row[i].studentId);
                        //}
                  //  var ids=strids.join(",");

						$.post('${pageContext.request.contextPath}/company/deletestudent',{ids:row.studentId},function(result){
							if (result.success){
								$('#dg').datagrid('reload');	// reload the user data
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
			else{
				 $.messager.alert('警告','请选择要删除的数据!'); 
			        return;
			}
		}
	</script>
</body>
</html>