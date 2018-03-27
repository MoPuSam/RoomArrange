package org.tysf.ts.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.tysf.ts.pojo.Arrange;
import org.tysf.ts.pojo.Room;
import org.tysf.ts.service.UserService;
import org.tysf.ts.service.imp.UserServiceImpl;
import org.tysf.ts.utils.ExamDateUtils;
import org.tysf.ts.utils.MyBatisUtils;

public class ArrangeTest {
	@Test
	public void addArrange() throws ParseException{
		UserService userService = new UserServiceImpl(MyBatisUtils.getSqlSession());
		String date="2017-05-27 08:00:00";
		Random random=new Random();
		int room=random.nextInt(3);
		/*SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Timestamp examDate=new Timestamp(sdf.parse(date).getTime());*/
		Timestamp examDate=Timestamp.valueOf(date);
		System.out.println(examDate);
		Arrange arr=new Arrange(5, examDate, room);
		System.out.println(room);
		try {
			userService.insertArrange(arr);
		} catch (Exception e) {
			addArrange();
			System.out.println("exception!=================================================");
		}
	}
}
