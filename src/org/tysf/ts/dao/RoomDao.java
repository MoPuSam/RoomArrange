package org.tysf.ts.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.tysf.ts.pojo.Room;

public interface RoomDao {
	@Update("update room set snum=snum+1 where r_id=#{r_id}")
	public void addNum(@Param("r_id")int r_id);
	@Select("select * from room where r_id = #{r_id}")
	public Room findRoomByRid(@Param("r_id")int r_id);
	@Select("select * from room")
	public List<Room> findAllRoom();
}
