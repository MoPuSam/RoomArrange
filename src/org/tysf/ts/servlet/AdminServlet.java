package org.tysf.ts.servlet;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Student;
import org.tysf.ts.service.UserService;
import org.tysf.ts.service.imp.UserServiceImpl;
import org.tysf.ts.servlet.base.BaseServlet;
import org.tysf.ts.utils.MyBatisUtils;
@WebServlet("/adminServlet")
public class AdminServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl(MyBatisUtils.getSqlSession());
	public String findAll(HttpServletRequest req, HttpServletResponse resp){
		List<Student> list =userService.findAllStudent();
		for(int i=0;i<list.size();i++){
			int a_id=list.get(i).getA_id();
			list.get(i).setArrange(userService.findArrangeByAid(a_id));
		}
		req.setAttribute("stuList", list);
		return "/admin/manager/list.jsp";
	}
	public String findAllRater(HttpServletRequest req, HttpServletResponse resp){
		List<Rater> list =userService.findAllRater();
		for(int i=0;i<list.size();i++){
			int a_id=list.get(i).getA_id();
			list.get(i).setArrange(userService.findArrangeByAid(a_id));
			int c_id=list.get(i).getArrange().getC_id();
			list.get(i).getArrange().setCourse(userService.findCourseByCid(c_id));
		}
		req.setAttribute("raterList", list);
		return "/admin/manager/rlist.jsp";
	}
}
