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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
    <link href="${pageContext.request.contextPath }/css/video-js.css" rel="stylesheet">	
	<link href="${pageContext.request.contextPath }/css/style1.css" rel="stylesheet" type="text/css" />		
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.grid.css" />
	<link href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all-min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/video.min.js"></script>	
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>	
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" />
</head>
<body>
<script type="text/javascript">

function doAdd(){
    $('#addWindow').window("open");
}
function doDelete(){
	var rows = $('#grid').datagrid('getSelections');
	if(rows.length == 0){	
		$.messager.alert("提示信息","请选择需要删除的记录！","warning");
	}else{        		
		var array = new Array();
		for(var i=0;i<rows.length;i++){
			var id = rows[i].periodId;
			array.push(id);
		}
		var ids = array.join(",");
		alert(ids);
		window.location.href = '${pageContext.request.contextPath}/period/delePeriod?ids='+ids;
	}
}

$(function(){
	   // 添加取派员窗口
    $('#addWindow').window({
        title: '添加取派员',
        width: 800,
        modal: true,
        shadow: true,
        closed: true,
        height: 400,
        resizable:false
    });
    $("#save").click(function(){
        //判断是否form中的所有表单对象都通过校验
        if($("#standardForm").form('validate')){
        	var url = $("#periodResourse").val();
        	alert(url);
        	//都通过校验
            $("#standardForm").submit();
          //  $('#grid').datagrid('reload');
        }else{
            $.messager.alert("警告","表单存在非法内容，请重新填写","warning");
        }
        //关闭窗口
        $("#addWindow").window('sclose');
    });
    function doPlayer(){
     	var url = $("#periodResourse").val();     
     	 var player = videojs('my-video');        
     	 player.src(url); 
     	 player.controls=true;
     	 player.autoplay();
     	 $('#palyerWindow').window("open");
    }
    $('#palyerWindow').window({
        title: '添加取派员',
        width: 800,
        modal: true,
        shadow: true,
        closed: true,
        height: 500,
        resizable:false
    });
    $("#addWindow").window('sclose');
});
</script>
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
			data-options="rownumbers:true,url:'${pageContext.request.contextPath }/period/findSomePeriod',method:'post',toolbar:'#tb'"
			pagination="true"
			rownumbers="true" fitColumns="true"  >
		<thead>
			<tr>
			    <th data-options="field:'ck',checkbox:true" ></th>
			    <th data-options="field:'placeId'">ID</th>
				<th data-options="field:'placeName',width:170">章节主题</th>
				<th data-options="field:'placeAddress',width:170">章节序号</th>
				<th data-options="field:'placeCompany',width:270">视频资源</th>
			
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding:5px;height:auto">
		<div style="margin-bottom:5px">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="doAdd()">新增</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
			<!--  <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveUser()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="cutUser()">剪切</a>-->
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="doDelete()">删除</a>
			<input class="easyui-textbox" id="searchname" data-options="prompt:'请在此输入查询条件'," style="width:200px;">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchUser()">搜索</a>		
		</div>
		</div>
	
	<div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
		<form id="fm" method="post"  action="" style="margin:0;padding:20px 50px">
			<h3>场地信息</h3>
			<input type="hidden" name="placeId" >
			<div style="margin-bottom:10px">
				<input name="periodTitle" class="easyui-textbox" required="true" label="章节主题:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="periodIndex" class="easyui-textbox" required="true" label="章节序号:" style="width:100%">
			</div>
			<div style="margin-bottom:10px">
				<input name="periodResourse" class="easyui-textbox" required="true" label="视频资源:" style="width:100%">
			</div>
			
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>
	</div>
	

	
	
	<div class="easyui-window" title="对收派员进行添加或者修改" id="addWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
            <div region="north" style="height:31px;overflow:hidden;" split="false" border="false">
                <div class="datagrid-toolbar">
                    <a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">保存</a>
                </div>
            </div>

            <div region="center" style="overflow:auto;padding:5px;" border="false">
                <form id="standardForm" action="${pageContext.request.contextPath }/period/addPeriod" method="post">
                    <table class="table-edit" width="80%" align="center">
                        <tr class="title">
                            <td colspan="4">小节信息</td>
                        </tr>
                        <tr>
                            <td>小节主题</td>
                            <td>
                            	<input type="hidden" name="classesId" id="classesId" value="${classId}">
                                <input type="text" name="periodTitle" class="easyui-validatebox" required="true" />
                            </td>
                            <td>小节序号</td>
                            <td>
                                <input type="text" name="periodIndex" class="easyui-validatebox" required="true" />
                            </td>
                        </tr>
                        <tr>
                            
                        </tr>
                        <tr>
                            <td>视频资源</td>
                            <td>
                                <input type="text" name="periodResourse" id="periodResourse" class="easyui-validatebox" required="true" />
   								<input type="button" id="insertfile" value="选择文件" />
                            </td>
                            
                            <td>
                                <input type="button" id="videobtn" value="查看视频" onclick="doPlayer()" />
                            </td>
                        </tr>       
                    </table>
                </form>
            </div>
        </div>

        <div class="easyui-window" title="播放视频" closed="true" id="palyerWindow" collapsible="false" minimizable="false" maximizable="false" style="width: 800px; top:20px;left:200px">
       	 <video id="my-video" class="video-js" controls preload="auto" width="740" height="450" poster="">
				<source id="videoSource" src="" type="video/mp4"/>
		  </video>
        </div>
        
        
</body>
	<script>
	KindEditor.ready(function(K) {
		var editor = K.editor({
			allowFileManager : true,
			filePostName  : "uploadFile",
			//指定上传文件请求的url。
			uploadJson : '${pageContext.request.contextPath }/pic/upload'
		});
		K('#insertfile').click(function() {
			editor.loadPlugin('insertfile', function() {
				editor.plugin.fileDialog({
					
					clickFn : function(url, title) {
						 var strs = url.split("/");
						 var url1 = "http://";
						 for(var i in strs){
							 if(i>2&&i<strs.length-1){
								 url1=url1+strs[i]+"/"
								}					    		
					      }
						 url1=url1+strs[strs.length-1];						 
						 K("#periodResourse").val(url1);		
						editor.hideDialog();
					}
				});
			});
		});
	});
	</script>
</html>