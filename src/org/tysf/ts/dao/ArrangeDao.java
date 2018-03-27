package org.tysf.ts.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.tysf.ts.pojo.Arrange;

public interface ArrangeDao {
	@Select("select * from arrange where c_id=#{c_id}")
	public Arrange findArrange(@Param("c_id")int c_id);
	@Insert("insert into arrange(c_id,examDate,r_id) values(#{c_id},#{examDate},#{r_id})")
	@Options(useGeneratedKeys = true, keyProperty = "a_id")
	public void insertArrange(Arrange arrange);
	@Select("select * from arrange where r_id=#{r_id}")
	public Arrange findArrangeByRid(@Param("r_id")int r_id);
	@Select("select * from arrange where a_id=#{a_id}")
	public Arrange findArrangeByAid(@Param("a_id")int a_id);
}
