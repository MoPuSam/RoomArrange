package org.tysf.ts.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//mybatis的工具类
public class MyBatisUtils {
	//单例化
	private static SqlSessionFactory ssf;
	private MyBatisUtils(){};
	public static SqlSession getSqlSession(){
		try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			if(ssf==null){
				ssf=new SqlSessionFactoryBuilder().build(is);
			}
			return ssf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
