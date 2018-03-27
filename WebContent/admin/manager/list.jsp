<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/css/css-table.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.2.6.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/style-table.js"></script>
	</HEAD>
	<body>
		<table id="travel">
		    <thead>    
		    	<tr>
		            <th scope="col" colspan="7">考场安排</th>
		        </tr>
		        
		        <tr>
		            <th scope="col">学生编号</th>
		            <th scope="col">准考证号</th>
		            <th scope="col">学生姓名</th>
		            <th scope="col">性别</th>
		            <th scope="col">报考科目</th>
		            <th scope="col">考场</th>
		            <th scope="col">考试序号</th>
		        </tr>        
		    </thead>
		    
		    <tbody>
		    <c:forEach items="${stuList}" var="stu">
		    	<tr>
		            <td>${stu.s_id}</td>
		            <td>${stu.pcord}</td>
		            <td>${stu.name}</td>
		            <td>${stu.sex}</td>
		            <td>${stu.subject}</td>
		            <td>${stu.arrange.r_id}</td>
		            <td>${stu.pnum}</td>
		        </tr>
		    </c:forEach>    
		    </tbody>
		
		</table>
	</body>
</HTML>

