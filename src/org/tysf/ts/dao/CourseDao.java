package org.tysf.ts.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.tysf.ts.pojo.Course;

public interface CourseDao {
	@Select("select * from course where c_name=#{c_name}")
	public Course findByName(@Param("c_name")String c_name);
	@Update("update course set count=count+1 where c_id=#{c_id}")
	public void addCount(@Param("c_id")int c_id);
	@Select("select * from course where c_id=#{c_id}")
	public Course findCourseByCid(@Param("c_id")int c_id);
}
