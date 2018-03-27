package org.tysf.ts.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tysf.ts.dao.ArrangeDao;
import org.tysf.ts.dao.CourseDao;
import org.tysf.ts.dao.RaterDao;
import org.tysf.ts.dao.RoomDao;
import org.tysf.ts.dao.UserDao;
import org.tysf.ts.pojo.Admin;
import org.tysf.ts.pojo.Arrange;
import org.tysf.ts.pojo.Course;
import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Room;
import org.tysf.ts.pojo.Student;
import org.tysf.ts.pojo.User;
import org.tysf.ts.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao=null;
	CourseDao courseDao=null;
	ArrangeDao arrangeDao=null;
	RaterDao raterDao=null;
	RoomDao roomDao=null;
	SqlSession session=null;
	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserServiceImpl(SqlSession session) {
		super();
		this.session = session;
		userDao=session.getMapper(UserDao.class);
		courseDao=session.getMapper(CourseDao.class);
		arrangeDao=session.getMapper(ArrangeDao.class);
		raterDao=session.getMapper(RaterDao.class);
		roomDao=session.getMapper(RoomDao.class);
	}

	@Override
	public Object login(User user) {
		String rank=user.getRank();
		if("0".equals(rank)){
			Student stu=userDao.findStudent(user.getUsername(),user.getPassword());
			return stu;
		}else if("1".equals(rank)){
			Rater rater=userDao.findRater(user.getUsername(),user.getPassword());
			return rater;
		}else if("2".equals(rank)){
			Admin admin=userDao.findAdmin(user.getUsername(),user.getPassword());
			return admin;
		}
		return null;
	}

	@Override
	public Course findCourseByName(String c_name) {
		return courseDao.findByName(c_name);
	}

	@Override
	public Arrange findArrange(int c_id) {
		return arrangeDao.findArrange(c_id);
	}


	@Override
	public void insertArrange(Arrange arr) {
		arrangeDao.insertArrange(arr);
		session.commit();
	}

	@Override
	public void addCount(int c_id) {
		courseDao.addCount(c_id);
		session.commit();
		
	}

	@Override
	public void addNum(int r_id) {
		roomDao.addNum(r_id);
		session.commit();
		
	}



	@Override
	public void setStuArrange(Student stu,int a_id) {
		userDao.setStuAid(stu,a_id);
		session.commit();
		
	}

	@Override
	public List<Rater> findFreeRater() {
		return raterDao.findFreeRater();
	}

	@Override
	public void setRaAid(int t_id, int a_id) {
		raterDao.setRaAid(t_id, a_id);
		session.commit();
		
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return userDao.findAllStudent();
	}

	@Override
	public Room findRoomByRid(int r_id) {
		return roomDao.findRoomByRid(r_id);
	}

	@Override
	public Arrange findArrangeByRid(int r_id) {
		return arrangeDao.findArrangeByRid(r_id);
	}

	@Override
	public void setStuPnum(Student stu, int pnum) {
		userDao.setStuPnum(stu, pnum);
		session.commit();
	}

	@Override
	public List<Room> findAllRoom() {
		return roomDao.findAllRoom();
	}

	@Override
	public Student findStudentBySid(int s_id) {
		return userDao.findStudentBySid(s_id);
	}

	@Override
	public List<Rater> findAllRater() {
		return raterDao.findWorkRater();
	}

	@Override
	public Arrange findArrangeByAid(int a_id) {
		return arrangeDao.findArrangeByAid(a_id);
	}

	@Override
	public Course findCourseByCid(int c_id) {
		return courseDao.findCourseByCid(c_id);
	}



}
