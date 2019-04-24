<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<html>
<head>


<title>bookStore列表</title>
<%--导入css --%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/main.css" type="text/css" />
</head>
<script type="text/javascript">
	function refeshdiv(){
		window.location.reload(); 
	}
</script>
<body class="main">
	<jsp:include page="menu_search.jsp" />
	<div id="divpagecontent" id="class_list">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td>
					<table cellspacing="0" class="listcontent">
						<tr>
							<td>
								<h1>课程目录</h1>
								<button onclick="refeshdiv()">刷新</button>
								<hr />
								
								<div style="margin-top:20px; margin-bottom:5px">
									<img
										src="${pageContext.request.contextPath }/image/productlist.gif"
										width="100%" height="38" />
								</div>

								<table cellspacing="0" class="booklist" >
									<tr>
										<c:forEach items="${bean.rows}" var="b" varStatus="vs">
											<td>

												<div class="divbookpic">
													<p>
														<a href="#"><img
															src="${b.classImg }"
															width="115" height="129" border="0" /> </a>
													</p>
												</div>

												<div class="divlisttitle">
													<a href="${pageContext.request.contextPath }/classes/findClassById?classId=${b.classId}">课程名字:${b.classTitle }<br/>售价:${b.classPrice/100.00 } </a>
													<br>
													<button onclick="deleteClassById(${b.classId})">删除课程</button>
												</div>
												
											</td>
											<c:if test="${vs.count % 4 == 0}">
												</tr>
												<tr>
											</c:if>
										</c:forEach>
									</tr>
								</table>
								<div class="pagination">
									<ul>
										<li class="disablepage"><a
											href="${pageContext.request.contextPath  }/classes/classeslist?currentPage=${bean.currentPage==1?1:bean.currentPage-1}">&lt;&lt;上一页</a>
										</li>
										<li>第${bean.currentPage }页/共${bean.total }页</li>

										<li class="nextPage"><a
											href="${pageContext.request.contextPath  }/classes/classeslist?currentPage=${bean.currentPage==bean.total?bean.total:bean.currentPage+1}">&lt;&lt;下一页</a>
										</li>

									</ul>
								</div></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
<script type="text/javascript">
function deleteClassById(id){
	if(confirm("你确定要删除么？")){
		window.location.href = "${pageContext.request.contextPath }/classes/deleteClassById?classId="+id;
	}	
}
</script>
</html>
