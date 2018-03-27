package org.tysf.ts.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ExamDateUtils {
	private static String[] dates={"2017-06-1 08:00:00","2017-06-1 14:00:00","2017-06-2 08:00:00","2017-06-2 14:00:00","2017-06-3 08:00:00","2017-06-3 14:00:00"};
	public static Timestamp getDate() throws ParseException{
		Random random = new Random();
		int index=random.nextInt(6);
		return Timestamp.valueOf(dates[index]);
	}
}
