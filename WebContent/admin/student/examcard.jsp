<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		
	</HEAD>
	<body>
		<div style="width: 600px;height: 280px;margin: 0 auto;background-color: white;">
			<%-- <div style="width: 76px;height: 101px;background-color: white;">
				<img alt="photo" src="${pageContext.request.contextPath}/${loginUser.photo}">
			</div> --%>
			<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
			  <TBODY>
			  <TR>
			    <TD width=310>
			      <TABLE 
			      style="BORDER-RIGHT: #000000 1px solid; BORDER-TOP: #000000 1px solid; BORDER-LEFT: #000000 1px solid; BORDER-BOTTOM: #000000 1px solid" 
			      height=200 cellSpacing=0 cellPadding=5 width="100%" align=center 
			        border=0><TBODY>
			        <TR>
			          <TD vAlign=top>
			            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
			              <TBODY>
			              <TR>
			                <TD 
			                style="FONT-WEIGHT: bold; FONT-SIZE: 18px; PADDING-BOTTOM: 1px; PADDING-TOP: 1px" 
			                align=middle colSpan=2>准 考 证 </TD></TR>
			              <TR>
			                <TD align=middle colSpan=2>2017上半年教师从业资格考试 </TD></TR>
			              <TR>
			                <TD>学生编号： ${student.s_id} </TD>
			                <TD vAlign=center align=middle width="76px" height="101px" 
			                  rowSpan=5><IMG height="101px" src="${pageContext.request.contextPath}/${student.photo}" 
			                  width=100> </TD></TR>
			              <TR>
			                <TD>报名序号： 11020 </TD></TR>
			              <TR>
			                <TD>姓&nbsp;&nbsp;&nbsp;&nbsp;名： ${student.name} </TD></TR>
			              <TR>
			                <TD>证件号码： ${student.idcord}</TD></TR>
			              <TR>
			                <TD>准考证号： ${student.pcord} </TD></TR>
			              <TR>
			                <TD colSpan=2>考场地点：${room.loc} </TD></TR>
			              <TR>
			                <TD colSpan=2>考场号： ${room.r_id} </TD></TR>
			              <TR>
			                <TD colSpan=2>
			                  <TABLE style="TEXT-ALIGN: center" cellSpacing=0 cellPadding=0 
			                  width="100%" border=0>
			                    <TBODY>
			                    <TR>
			                      <TD>科目 </TD>
			                      <TD>考场号 </TD>
			                      <TD>考试序号 </TD>
			                      <TD>考试日期 </TD>
			                      </TR>
			                    <TR>
			                      <TD>${student.subject} </TD>
			                      <TD>${arrange.r_id} </TD>
			                      <TD>${student.pnum} </TD>
			                      <TD>${arrange.examDate } </TD>
			                      </TR>
			              <TR>
			                <TD>&nbsp; </TD>
			                <TD>&nbsp; </TD></TR>
			    <TD width=30></TD>
			    <TD width=310></TD></TR>
			  <TR>
			    <TD width=310></TD>
			    <TD width=30></TD>
			    <TD width=310></TD></TR></TBODY></TABLE>
		</div>
	</body>
</HTML>

