<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>电子书城</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css" type="text/css" />
</head>

<body class="main">

	<div id="divpagecontent">
		<table width="100%" border="0" cellspacing="0">
			<tr>

				<td>

					<table cellspacing="0" class="infocontent">
						<tr>
							<td>

								<table width="100%%" border="0" cellspacing="0">
									<tr>
										<td width="30%">

											<div class="divbookcover">
												<p>
													<img src="${cla.classImg }" width="213" height="269" border="0" />
												</p>
											</div>

											<div style="text-align:center; margin-top:25px">
												<a href="${pageContext.request.contextPath }/chapter/chapterlist?classId=${cla.classId}"> <button>详情管理</button> 
												</a>
												<a href="${pageContext.request.contextPath }/classes/editContext?classId=${cla.classId}"> <button>内容修改</button> 
												</a>
												<a href="${pageContext.request.contextPath }/chapter/chapterlist?classId=${cla.classId}"> <button>删除课程</button> 
												</a>
											</div>
										</td>
										<td style="padding:20px 5px 5px 5px"><img
											src="${pageContext.request.contextPath }/image/miniicon3.gif" width="16" height="13" /><font
											class="bookname">&nbsp;&nbsp;${cla.classTitle }</font>

											<hr />售价：<font color="#FF0000">￥:${cla.classPrice/100.00 }元</font>
											<hr /> 类别：${cla.classSellPoint }

											<hr />
											<p>
												<b>内容简介：</b>
											</p>${cla.classDesc }</td>
									</tr>
								</table>
							</td>
						</tr>
					</table></td>
			</tr>
		</table>
	</div>


	


</body>
</html>
