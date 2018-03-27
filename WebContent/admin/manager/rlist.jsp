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
		            <th scope="col" colspan="5">评委安排</th>
		        </tr>
		        
		        <tr>
		            <th scope="col">评委编号</th>
		            <th scope="col">评委姓名</th>
		            <th scope="col">负责科目</th>
		            <th scope="col">监考时间</th>
		            <th scope="col">负责考场</th>
		        </tr>        
		    </thead>
		    
		    <tbody>
		    <c:forEach items="${raterList}" var="rater">
		    	<tr>
		            <td>${rater.t_id}</td>
		            <td>${rater.name}</td>
		            <td>${rater.arrange.course.c_name}</td>
		            <td>${rater.arrange.examDate}</td>
		            <td>${rater.arrange.r_id}</td>
		        </tr>
		    </c:forEach>    
		    </tbody>
		
		</table>
	</body>
</HTML>

