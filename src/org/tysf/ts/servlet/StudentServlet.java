package org.tysf.ts.servlet;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tysf.ts.pojo.Arrange;
import org.tysf.ts.pojo.Course;
import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Room;
import org.tysf.ts.pojo.Student;
import org.tysf.ts.service.UserService;
import org.tysf.ts.service.imp.UserServiceImpl;
import org.tysf.ts.servlet.base.BaseServlet;
import org.tysf.ts.utils.ExamDateUtils;
import org.tysf.ts.utils.MyBatisUtils;
@WebServlet("/stuServlet")
public class StudentServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl(MyBatisUtils.getSqlSession());
	public String signUp(HttpServletRequest req, HttpServletResponse resp) throws ParseException{
		HttpSession session = req.getSession();
		Student loginUser=(Student) session.getAttribute("loginUser");
		Course course=userService.findCourseByName(loginUser.getSubject());
		int c_id=course.getC_id();
		Arrange arrange=userService.findArrange(c_id);
		if(arrange!=null){
			//若存在安排
			Room exRoom=userService.findRoomByRid(arrange.getR_id());
			if(exRoom.getSnum()<=3){//考场人数未满
				userService.setStuArrange(loginUser,arrange.getA_id());
				//设置学生考试序号
				userService.setStuPnum(loginUser,exRoom.getSnum()+1);
				userService.addCount(c_id);
				userService.addNum(exRoom.getR_id());
			}else{//考场人数已满,新增安排
				newArrange(loginUser,c_id);
			}
		}else{
			//若不存在安排,则新增安排
			newArrange(loginUser,c_id);
		}
		session.setAttribute("flag", true);
		return "/admin/student/success.jsp";
	}
	public String printExamCord(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		Student loginUser=(Student) session.getAttribute("loginUser");
		Student stu=userService.findStudentBySid(loginUser.getS_id());
		if(stu.getA_id()==0){
			return "/admin/student/failed.jsp";
		}
		Arrange arrange=userService.findArrangeByAid(stu.getA_id());
		Room room=userService.findRoomByRid(arrange.getR_id());
		req.setAttribute("room", room);
		req.setAttribute("arrange", arrange);
		req.setAttribute("student", stu);
		return "/admin/student/examcard.jsp";
	}
	public void newArrange(Student loginUser,int c_id) throws ParseException{
		try {
			Timestamp examDate = ExamDateUtils.getDate();
			List<Room> list=userService.findAllRoom();
			Random random=new Random();
			int o=random.nextInt(list.size());
			int r_id=list.get(o).getR_id();
			Arrange arr=new Arrange(c_id, examDate, r_id);
			userService.insertArrange(arr);
			userService.setStuArrange(loginUser,arr.getA_id());
			//设置学生考试序号
			userService.setStuPnum(loginUser,1);
			userService.addCount(c_id);
			userService.addNum(r_id);
			List<Rater> rlist=userService.findFreeRater();
			if(rlist.size()>=3){
				for(int i=0;i<3;i++){
					userService.setRaAid(rlist.get(i).getT_id(),arr.getA_id());
				}
			}
		} catch (Exception e) {
			newArrange(loginUser,c_id);
		}
	}
}
