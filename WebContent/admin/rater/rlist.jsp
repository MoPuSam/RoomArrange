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
		            <th scope="col" colspan="6">我的安排</th>
		        </tr>
		        
		        <tr>
		            <th scope="col">评委编号</th>
		            <th scope="col">评委姓名</th>
		            <th scope="col">负责科目</th>
		            <th scope="col">监考时间</th>
		            <th scope="col">考场编号</th>
		            <th scope="col">考场地点</th>
		        </tr>        
		    </thead>
		    
		    <tbody>
		    	<tr>
		            <td>${loginUser.t_id}</td>
		            <td>${loginUser.name}</td>
		            <td>${course.c_name}</td>
		            <td>${loginUser.arrange.examDate}</td>
		            <td>${loginUser.arrange.r_id}</td>
		            <td>${room.loc}</td>
		        </tr>
		    </tbody>
		
		</table>
	</body>
</HTML>

