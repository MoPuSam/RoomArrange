<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		<script type='text/javascript' src='${pageContext.request.contextPath}/js/jquery-1.11.1.min.js'></script>
	</HEAD>
	<body>
	<center>
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/stuServlet?method=signUp" method="post">
			<input id="sign" style="background: rgba(0, 0, 0, 0.8);
			    height:550px;width:700px;font-family: 黑体;font-size:300px;color: rgba(255,255,255,.9)" type="submit" value="报名" class="button" />
		</form>
		<c:if test="${ loginUser.wscore lt 70.0 or loginUser.psychics lt 60.0 or loginUser.education lt 60.0}">
			<script type="text/javascript">
				$(document).ready(function(){
					$("#sign").click( function () {
						alert("您的理论考试未达标，无法报名");
						$(this).attr("disabled","disabled");
						});
					})
				</script>
		</c:if>
		<c:if test="${not empty flag or loginUser.a_id !=0}">
			<script type="text/javascript">
				$(document).ready(function(){
					$("#sign").click( function () {
						alert("您已报名，请不要重复报名");
						$(this).attr("disabled","disabled");
						});
					})
				</script>
		</c:if>
	</center>
	</body>
</HTML>

