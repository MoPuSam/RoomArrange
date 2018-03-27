package org.tysf.ts.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.tysf.ts.pojo.Rater;

public interface RaterDao {
	@Update("update rater set a_id=#{a_id} where t_id=#{t_id}")
	public void setRaAid(@Param("t_id")int t_id,@Param("a_id")int a_id);
	@Select("select * from rater where a_id is null")
	public List<Rater> findFreeRater();
	@Select("select * from rater where a_id is not null")
	public List<Rater> findWorkRater();
}
