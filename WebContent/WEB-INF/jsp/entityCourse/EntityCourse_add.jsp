<!--_meta 作为公共模版分离出去-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui1/themes/icon.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" /><link href="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/js/kindeditor/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui1/jquery.easyui.min.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/js/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/My97DatePicker/4.8/WdatePicker.js"></script>

</head>
<body>
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
		    			$("#entitycourseCat").val(node.text);
		    			$("#entitycourseCat").attr("style","width: 120px;height:30px;visibility:visible");
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
<div class="page-container" >
	<form id="classAddForm" class="form form-horizontal" method="post" action="${pageContext.request.contextPath }/entityCourse/AddEntityCourse">	    
	    <div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">课程类目：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="selectCat()">选择类目</a>
	            <input type="text" name="entitycourseCat" id="entitycourseCat"   style="width: 120px;height:30px;visibility:hidden"  readonly ></input>
			</div>
		</div>    
	    <div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">课程题目：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<input class="easyui-textbox input-text"   type="text" name="entitycourseTitle" id="entitycourseTitle" value="" data-options="required:true" style="width:180px;"></input>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">课程卖点：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<input class="easyui-textbox input-text" name="entitycoursePoint" id="entitycoursePoint" value="" data-options="multiline:true,validType:'length[0,150]'" style="width: 180px;"></input>
			</div>
		</div>	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">课程价格：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<input class="easyui-numberbox input-text" type="text" name="entitycoursePrice"  id="entitycoursePrice" value=""  data-options="min:1,max:99999999,precision:2,required:true" tyle="width: 180px;"/>
			</div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">班级规格：<span class="c-red">*</label>
			<div class="formControls col-xs-8 col-sm-9"> 
			<span class="select-box" style=" width:25%">
				<select class="select" name="entitycourseGuige">
					<option>班级级别</option>
					<option value="1">春季班</option>
					<option value="2">秋季班</option>

				</select>
				</span> 
				<span class="select-box"  style=" width:25%">
				<select class="select" name="entitycourseBanxing">
					<option>班制</option>
					<option value="1">大班</option>
					<option value="2">中班</option>
					<option value="3">小班</option>

				</select>
				</span>
				<span class="select-box"  style=" width:25%">
				<select class="select" name="entitycourseType">
					<option>班型</option>
					<option value="1">全日制</option>
					<option value="2">小时制</option>
				</select>
				</span>
				</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">报名时间：<span class="c-red">*</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="entitycourseBmstarttime" placeholder="报名起始时间" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd ',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:180px;">
				--
				<input type="text" name="entitycourseBmendtime" placeholder="报名结束时间" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd ',minDate:'#F{$dp.$D(\'datemin\')}' })" id="datemax" class="input-text Wdate" style="width:180px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">开课时间1：<span class="c-red">*</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="entitycourseKbstarttime" placeholder="报名起始时间" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd ',maxDate:'#F{$dp.$D(\'datemax1\')||\'%y-%M-%d\'}' })" id="datemin1" class="input-text Wdate" style="width:180px;">
				--
				<input type="text" name="entitycourseKbendtime" placeholder="报名结束时间" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd ',minDate:'#F{$dp.$D(\'datemin1\')}' })" id="datemax1" class="input-text Wdate" style="width:180px;">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">展示图片：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<a href="javascript:void(0)" class="easyui-linkbutton" id="J_selectImage">上传图片</a>
	                 <div id="test1">
	                 	<img id="img" src="">	
	                 </div>
	                <input type="hidden" id="entitycourseImg" name="entitycourseImg" value="" />
			</div>
		</div>	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">课程描述：<span class="c-red">*</span></label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea style="width:800px;height:300px;visibility:hidden;" name="entitycourseDesc" id="entitycourseDesc" value=""></textarea>
			</div>
		</div>    
	   </div>
	</form>

	<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="submitForm();" class="easyui-linkbutton" >保存</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
				<button onClick="clearForm();" class="easyui-linkbutton">重置</button>
				<font color="#ff0000">${msg }</font>
			</div>
	</div>


<script type="text/javascript">

	var editor1;
	KindEditor.ready(function (TAOTAO)
	{
    // 请注意修改 textarea 的名字，我这里是 Description
   	    editor1 = TAOTAO.create('#classAddForm [name="entitycourseDesc"]', {
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
						 K('#entitycourseImg').val(url1);
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
		editor1.sync();
		$("#classAddForm [name=entitycoursePrice]").val(eval($("#classAddForm [name=entitycoursePrice]").val()) * 100);	
		$("#classAddForm").submit();		
	}
	function clearForm(){
		$('#classAddForm').form('reset');
		editor1.html('');
	}
</script>

</body>
</html>