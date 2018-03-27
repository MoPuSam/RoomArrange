<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html> 
<head> 
<title>login</title> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bgstyle.css" />
<script type='text/javascript' src='${pageContext.request.contextPath}/js/jquery-1.11.1.min.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/js/jquery.particleground.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/js/demo.js'></script>
<script type="text/javascript">
$(document).ready(function(){
	var msg="${msg}";
	if(msg!=null&&msg!=""){
		alert(msg);
	}
	//切换验证码
	$(function() {
		$("#code").click(
						function() {
							this.src = "${pageContext.request.contextPath}/codeServlet?"
									+ new Date().getTime();
						})
	})
	})
</script>
</head> 

<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
<img src="${pageContext.request.contextPath}/img/bg.jpg" height="100%" width="100%"/>    
</div>
<div id="particles" style="margin: 0 auto;">
	<div class="intro">
		<p>教师资格证网络报名中心</p>
				<center>
				<div style="height: 300px;width: 300px;background-color: rgba(255,255,255,0.8);border-radius: 10%;">
				<label style="font-family: 黑体;color: rgba(0,0,0,.9);font-size: x-large;">登入口</label><br/>
				<div style="margin: 0 auto;text-align: center;margin-top: 40px">
					<form method="post" action="${pageContext.request.contextPath }/userServlet?method=login" target="_parent" name='theForm' onsubmit="return validate()">
					        <label style="font-family: 黑体;color: rgba(0,0,0,.9)">用户名:</label>
					        <input style="border-radius: 10%;height: 30px;background-color: rgba(200,200,200,0.8)" type="text" name="username" /><br/>
					        <br/>
					        <label style="font-family: 黑体;color: rgba(0,0,0,.9)">密&nbsp;&nbsp;码:</label>
					        <input style="border-radius: 10%;height: 30px;background-color: rgba(200,200,200,0.8)" type="password" name="password" /><br/>
					        <br/>
					        	<select  name="rank" style="border-radius: 10%;height: 30px;background-color: rgba(255,255,255,0.8)"> 
								<option value="0" s>学生</option> 
								<option value="1">老师</option> 
								<option value="2">管理员</option>
								</select>
									<input id="codetext" type="text" style="border-radius: 10%;width:50%;height: 30px;background-color: rgba(255,255,255,0.8)" name="inputCode">
									<img id="code"
										src="${pageContext.request.contextPath}/codeServlet" />
								<script type="text/javascript">
								//判断验证码是否正确
								$("#codetext").blur(function() {
									var code = "${codeMsg}";
									var confirm = $(this).val();
									if (code != confirm) {
										/* alert("验证码错误"); */
										ZENG.msgbox.show("验证码错误", 5, 2000);
										$(this).val("");
									}
									if (confirm=="") {
										ZENG.msgbox.show("验证码不能为空", 5, 2000);
									}
								})
								</script>
							</div>
					      <input style="background: url('${pageContext.request.contextPath}/img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
					    height:35px;width:100px;font-family: 黑体;font-size:20px;color: rgba(255,255,255,.9)" type="submit" value="登入" class="button" />
					</form>
					</div>
				</div>
		</center>
	</div>
</div>

</body> 
</html> 