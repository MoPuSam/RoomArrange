package org.tysf.ts.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.tysf.ts.pojo.Admin;
import org.tysf.ts.pojo.Rater;
import org.tysf.ts.pojo.Student;

public interface UserDao {
	@Select("select * from student where username=#{username} and password=#{password}")
	Student findStudent(@Param("username")String username, @Param("password")String password);
	@Select("select * from rater where username=#{username} and password=#{password}")
	Rater findRater(@Param("username")String username, @Param("password")String password);
	@Select("select * from admin where username=#{username} and password=#{password}")
	Admin findAdmin(@Param("username")String username, @Param("password")String password);
	@Update("update student set a_id=#{a_id} where s_id=#{stu.s_id}")
	public void setStuAid(@Param("stu")Student stu,@Param("a_id")int a_id);
	@Select("select * from student where a_id !=0")
	public List<Student> findAllStudent();
	@Update("update student set pnum=#{pnum} where s_id=#{stu.s_id}")
	public void setStuPnum(@Param("stu")Student stu,@Param("pnum")int pnum);
	@Select("select * from student where s_id=#{s_id}")
	public Student findStudentBySid(@Param("s_id")int s_id);
}
