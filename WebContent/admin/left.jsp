<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/css/left.css" rel="stylesheet" type="text/css"/>
<link rel="StyleSheet" href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
<style type="text/css">
body{margin:0;padding:0;overflow-x:hidden;}
html, body{height:100%;}
img{border:none;}
*{font-family:'微软雅黑';font-size:12px;color:#626262;}
dl,dt,dd{display:block;margin:0;}
a{text-decoration:none;}

#bg{background-image:url(${pageContext.request.contextPath}/images/content/dotted.png);}
.container{width:100%;height:100%;margin:auto;}

/*left*/
.leftsidebar_box{width:160px;height:auto !important;overflow:visible !important;position:fixed;height:100% !important;background-color:#3992d0;}
.line{height:2px;width:100%;background-image:url(${pageContext.request.contextPath}/images/left/line_bg.png);background-repeat:repeat-x;}
.leftsidebar_box dt{padding-left:40px;padding-right:10px;background-repeat:no-repeat;background-position:10px center;color:#f5f5f5;font-size:14px;position:relative;line-height:48px;cursor:pointer;}
.leftsidebar_box dd{background-color:#317eb4;padding-left:40px;}
.leftsidebar_box dd a{color:#f5f5f5;line-height:20px;}
.leftsidebar_box dt img{position:absolute;right:10px;top:20px;}
.system_log dt{background-image:url(${pageContext.request.contextPath}/images/left/system.png)}
.custom dt{background-image:url(${pageContext.request.contextPath}/images/left/custom.png)}
.channel dt{background-image:url(${pageContext.request.contextPath}/images/left/channel.png)}
.app dt{background-image:url(${pageContext.request.contextPath}/images/left/app.png)}
.cloud dt{background-image:url(${pageContext.request.contextPath}/images/left/cloud.png)}
.syetem_management dt{background-image:url(${pageContext.request.contextPath}/images/left/syetem_management.png)}
.source dt{background-image:url(${pageContext.request.contextPath}/images/left/source.png)}
.statistics dt{background-image:url(${pageContext.request.contextPath}/images/left/statistics.png)}
.leftsidebar_box dl dd:last-child{padding-bottom:10px;}
</style>
</head>
<body>
<div class="container">

	 <div class="leftsidebar_box">
		<div class="line"></div>
		<%--<dl class="system_log">
			<dt onClick="changeImage()">系统记录<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">充值记录</a></dd>
			<dd><a href="#">短信充值记录</a></dd>
			<dd><a href="#">消费记录</a></dd>
			<dd><a href="#">操作记录</a></dd>
		</dl> --%>
	<c:if test="${loginUser.rank eq 0}">
		<dl class="custom">
			<dt onClick="changeImage()">学生登录<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="${pageContext.request.contextPath}/admin/student/signup.jsp" target="mainFrame">理论考试报名</a></dd>
			<dd><a href="${pageContext.request.contextPath}/admin/student/signup.jsp" target="mainFrame">能力测试报名</a></dd>
			<dd><a id="sign" href="${pageContext.request.contextPath}/stuServlet?method=printExamCord" target="mainFrame">打印准考证</a></dd>
		</dl>
	</c:if>
		<%-- <dl class="channel">
			<dt>渠道管理<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">渠道主页</a></dd>
			<dd><a href="#">渠道标准管理</a></dd>
			<dd><a href="#">系统通知</a></dd>
			<dd><a href="#">渠道商管理</a></dd>
			<dd><a href="#">渠道商链接</a></dd>
		</dl>
	
		<dl class="app">
			<dt onClick="changeImage()">APP管理<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">App运营商管理</a></dd>
			<dd><a href="#">开放接口管理</a></dd>
			<dd><a href="#">接口类型管理</a></dd>
		</dl>
	
		<dl class="cloud">
			<dt>大数据云平台<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">平台运营商管理</a></dd>
		</dl> --%>
		<c:if test="${loginUser.rank eq 2}">
		<dl class="syetem_management">
			<dt>系统管理<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">设置截止日期</a></dd>
			<dd><a href="${pageContext.request.contextPath}/adminServlet?method=findAll" target="mainFrame">查看考场安排</a></dd>
			<dd><a href="${pageContext.request.contextPath}/adminServlet?method=findAllRater" target="mainFrame">查看评委安排</a></dd>
		</dl>
		</c:if>
		<c:if test="${loginUser.rank eq 1}">
		<dl class="source">
			<dt>评委登录<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="${pageContext.request.contextPath}/raterServlet?method=findSelf" target="mainFrame">查看所在考场</a></dd>
		</dl>
		</c:if>
		<%-- <dl class="statistics">
			<dt>统计分析<img src="${pageContext.request.contextPath}/images/left/select_xl01.png"></dt>
			<dd class="first_dd"><a href="#">客户统计</a></dd>
		</dl> --%>
	
	</div>

</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript">
$(".leftsidebar_box dt").css({"background-color":"#3992d0"});
$(".leftsidebar_box dt img").attr("src","${pageContext.request.contextPath}/images/left/select_xl01.png");
$(function(){
	$(".leftsidebar_box dd").hide();
	$(".leftsidebar_box dt").click(function(){
		$(".leftsidebar_box dt").css({"background-color":"#3992d0"})
		$(this).css({"background-color": "#317eb4"});
		$(this).parent().find('dd').removeClass("menu_chioce");
		$(".leftsidebar_box dt img").attr("src","${pageContext.request.contextPath}/images/left/select_xl01.png");
		$(this).parent().find('img').attr("src","${pageContext.request.contextPath}/images/left/select_xl.png");
		$(".menu_chioce").slideUp(); 
		$(this).parent().find('dd').slideToggle();
		$(this).parent().find('dd').addClass("menu_chioce");
	});
})
</script>

</body>
</html>
