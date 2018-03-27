package org.tysf.ts.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tysf.ts.pojo.User;
import org.tysf.ts.service.UserService;
import org.tysf.ts.service.imp.UserServiceImpl;
import org.tysf.ts.servlet.base.BaseServlet;
import org.tysf.ts.utils.BeanTools;
import org.tysf.ts.utils.MyBatisUtils;

import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
@WebServlet("/userServlet")
public class UserServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl(MyBatisUtils.getSqlSession());
	public String login(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String rank=req.getParameter("rank");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		User user=new User(username,password,rank);
			Object loginUser = userService.login(user);
			if (loginUser != null ){
				//登录成功
				// session作用域记录登录状态
				req.getSession().setAttribute("loginUser", loginUser);
				//判断验证码
				if(checkCode(req, resp)){
					// 重定向到首页
					return "/admin/home.jsp";
				}else{
					req.setAttribute("msg", "验证码输入有误");
					return "/index.jsp";
				}
				
			} else {
				// 设置msg信息;
				// 通过baseservlet转发到登录界面
				// 使用Request域记录错误信息
				req.setAttribute("msg", "用户名或密码不匹配");
				// 请求转发到登录页
				return "/index.jsp";
			}
	}
	/*
	 * 检查验证码是否输入正确
	 */
	public boolean checkCode(HttpServletRequest req, HttpServletResponse resp) {
		String codeMsg = (String) req.getSession().getAttribute("codeMsg");
		String inputCode = req.getParameter("inputCode");
		System.out.println(codeMsg);
		System.out.println(inputCode);
		return codeMsg.equals(inputCode);
	}
}
