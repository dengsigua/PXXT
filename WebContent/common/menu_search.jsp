<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/my.js">
</script>


<div id="divmenu">
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=文学">文学</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=生活">生活</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=计算机">计算机</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=外语">外语</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=经营">经管</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=励志">励志</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=社科">社科</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=学术">学术</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=少儿">少儿</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=艺术">艺术</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=原版">原版</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=科技">科技</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=考试">考试</a>
	<a
		href="${pageContext.request.contextPath}/pageServlet?category=生活百科">生活百科</a>
	<a href="${pageContext.request.contextPath}/pageServlet"
		style="color:#FFFF00">全部商品目录</a>
</div>
<div id="divsearch">
	<form action="${pageContext.request.contextPath}/findProductBySearch"
		method="post">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td style="text-align:right; padding-right:220px">
				Search <input
					type="text" name="name" class="inputtable" onkeyup="searchName();"
					id="name" /> 
					<input type="image" src="images/serchbutton.gif"
					border="0" style="margin-bottom:-4px">
				</td>
			</tr>
		</table>

	</form>
</div>
<div id="content"
	style="background-color:white;width:128px; text-align:left;margin-left:945px;color:black;float:left;margin-top: -20px;display: none">
</div>