<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<script type="text/javascript">

function  selectCat(){
	alert("cc");
	var id = 1;
	$("<div>").css({padding:"5px"}).html("<ul>")
	.window({
		width:'500',
	    height:"450",
	    modal:true,
	    closed:true,
	    iconCls:'icon-save',
	    title:'选择类目',
	    onOpen : function(){
	    	var _win = this;
	    	$("ul",_win).tree({
	    		url:'${pageContext.request.contextPath }/classCat/findCatList',
	    		animate:true,
	    		onClick : function(node){
	    			id=node.id;
	    		//	alert(node.state);
	    			if(node.state=="open"){			
		    			$("#classCid").val(node.text);
		    			$("#classCid").attr("type","text");
		    			$(_win).window('close');
	    			}
	    			
	    		}
	    	});
	    },
	    onClose : function(){
	    	$(this).window("destroy");
	    }
	}).window('open');
};
</script>
</head>
<body>
    <div style="padding:10px 10px 10px 10px">
	<form id="classAddForm" class="itemForm" method="post" action="${pageContext.request.contextPath }/classes/addclass">
	    <table cellpadding="5">
	        <tr>
	            <td>商品类目:</td>
	            <td>
	            	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="selectCat()">选择类目</a>
	            	<input type="hidden" name="classCid" id="classCid"   style="width: 120px;height:30px" readonly></input>
	            </td>
	        </tr>
	        <tr>
	            <td>商品标题:</td>
	            <td><input class="easyui-textbox" type="text" name="classTitle" id="classTitle" value="${classes.classTitle }" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>商品卖点:</td>
	            <td><input class="easyui-textbox" name="classSellPoint" id="classSellPoint" value="${classes.classSellPoint }" data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>商品价格:</td>
	            <td><input class="easyui-numberbox" type="text" name="classPrice"  id="classPrice" value="${classes.classPrice }"  data-options="min:1,max:99999999,precision:2,required:true" />
	            </td>
	        </tr>
	        
	        <tr>
	            <td>商品图片:</td>
	            <td>
	            	 <a href="javascript:void(0)" class="easyui-linkbutton" id="J_selectImage">上传图片</a>
	                 <div id="test1">
	                 	<img id="img" src="">	
	                 </div>
	                <input type="hidden" id="classImg" name="classImg" value="${classes.classImg }" />
	            </td>
	        </tr>
	        <tr>
	            <td>商品描述:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="classDesc" id="classDesc" value="${classes.classDesc }"></textarea>
	            </td>
	        </tr>
	      
	    </table>
	   
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
		<font color="#ff0000">${msg }</font>
	</div>
</div> 
<script type="text/javascript">

	var editor1;
	KindEditor.ready(function (TAOTAO)
	{
    // 请注意修改 textarea 的名字，我这里是 Description
   	    editor1 = TAOTAO.create('#classAddForm [name="classDesc"]', {
        allowFileManager: true
   	 });    
	});
	
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
						 K('#classImg').val(url1);
						div.append('<img src="' + url1 + '">');
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
		if(!$('#classAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		
		//同步文本框中的商品描述
		editor1.sync();
		$("#classAddForm [name=classPrice]").val(eval($("#classAddForm [name=classPrice]").val()) * 100);
		
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		
		$("#classAddForm").submit();		
	
	}
	function clearForm(){
		$('#classAddForm').form('reset');
		editor1.html('');
	}
</script>
	
</body>

</html>