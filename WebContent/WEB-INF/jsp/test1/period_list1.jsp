<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <head>
        <meta charset="UTF-8">
        <title>管理取派员</title>
        <!-- 导入jquery核心类库 -->
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
        <!-- 导入easyui类库 -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
        <link href="${pageContext.request.contextPath }/css/video-js.css" rel="stylesheet">	
        <script src="${pageContext.request.contextPath }/js/video.min.js"></script>	
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
        <script src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
        <link href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" type="text/css" rel="stylesheet">
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all-min.js"></script>
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" />
       <script>
       videojs.options.flash.swf = "video-js.swf";
       </script>
        <script type="text/javascript">
            function doAdd(){
                $('#addWindow').window("open");
            }

            function doEdit(){
                alert("修改...");
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

      
            //工具栏
            var toolbar = [ {
                id : 'button-add',  
                text : '增加',
                iconCls : 'icon-add',
                handler : doAdd
            }, {
                id : 'button-edit',
                text : '修改',
                iconCls : 'icon-edit',
                handler : doEdit
            }, {
                id : 'button-delete',
                text : '删除',
                iconCls : 'icon-cancel',
                handler : doDelete
            }];
            // 定义列
            var columns = [ [ {
                field : 'periodId',
                checkbox : true,
            },{
                field : 'periodTitle',
                title : '小节主题',
                width : 120,
                align : 'center'
            },{
                field : 'periodResourse',
                title : '资源地址',
                width : 350,
                align : 'center'
            },{
                field : 'periodIndex',
                title : '序号',
                width : 100,
                align : 'center'
            }] ];

            $(function(){
                // 先将body隐藏，再显示，不会出现页面刷新效果
                $("body").css({visibility:"visible"});

                // 取派员03息表格
                $('#grid').datagrid( {
                    iconCls : 'icon-forward',
                    fit : true,
                    border : false,
                    rownumbers : true,
                    striped : true,
                    pageList: [3,5,10],
                    pagination : true,
                    toolbar : toolbar,
                    url : "${pageContext.request.contextPath }/period/findSomePeriod",
                    idField : 'periodId',
                    columns : columns,
                    onDblClickRow : doDblClickRow
                });

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

                //对收派标准save按钮，添加点击事件
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

            });

            function doDblClickRow(){
                alert("双击表格数据...");
            }
            
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


        </script>
    </head>

    <body class="easyui-layout" style="visibility:hidden;">
        <div region="center" border="false">
            <table id="grid"></table>
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
