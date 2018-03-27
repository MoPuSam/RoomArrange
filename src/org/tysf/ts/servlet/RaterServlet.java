package org.tysf.ts.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tysf.ts.pojo.Course;
import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Room;
import org.tysf.ts.pojo.Student;
import org.tysf.ts.service.UserService;
import org.tysf.ts.service.imp.UserServiceImpl;
import org.tysf.ts.servlet.base.BaseServlet;
import org.tysf.ts.utils.MyBatisUtils;
@WebServlet("/raterServlet")
public class RaterServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl(MyBatisUtils.getSqlSession());
	public String findSelf(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		Rater loginUser=(Rater) session.getAttribute("loginUser");
		int a_id=loginUser.getA_id();
		loginUser.setArrange(userService.findArrangeByAid(a_id));
		Room room=userService.findRoomByRid(loginUser.getArrange().getR_id());
		Course course=userService.findCourseByCid(loginUser.getArrange().getC_id());
		req.setAttribute("room", room);
		req.setAttribute("course", course);
		session.setAttribute("loginUser", loginUser);
		return "/admin/rater/rlist.jsp";
	}
}
