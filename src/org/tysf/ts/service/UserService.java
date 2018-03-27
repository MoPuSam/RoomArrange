package org.tysf.ts.service;

import java.util.List;

import org.tysf.ts.pojo.Arrange;
import org.tysf.ts.pojo.Course;
import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Room;
import org.tysf.ts.pojo.Student;
import org.tysf.ts.pojo.User;

public interface UserService {
	//登录
	public Object login(User user);
	//获取科目
	public Course findCourseByName(String c_name);
	//获取安排
	public Arrange findArrange(int c_id);
	//插入安排
	public void insertArrange(Arrange arr);
	//科目报名人数+1
	public void addCount(int c_id);
	//考场人数+1
	public void addNum(int r_id);
	//给学生安排考场
	public void setStuArrange(Student stu,int a_id);
	//获取空闲的评委
	public List<Rater> findFreeRater();
	//设置评委对应的安排
	public void setRaAid(int t_id, int a_id);
	public List<Student> findAllStudent();
	//按考场号返回考场对象
	public Room findRoomByRid(int r_id);
	public Arrange findArrangeByRid(int r_id);
	//设置学生考试序号
	public void setStuPnum(Student loginUser, int i);
	//找到所有房间
	public List<Room> findAllRoom();
	//通过学生编号找到学生
	public Student findStudentBySid(int s_id);
	public List<Rater> findAllRater();
	//查找相关安排
	public Arrange findArrangeByAid(int a_id);
	public Course findCourseByCid(int c_id);
}
