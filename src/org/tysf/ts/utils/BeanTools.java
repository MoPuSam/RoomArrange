package org.tysf.ts.utils;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
public class BeanTools {
	/*方式一：传递javabean实例，将数据封装到实例对象中
	 * 对BeanUtils进一步封装，同时处理日期转换
	 * 将数据封装给javaBean实例，支持时间类型转换
	 * 例如 User usre = new User()
	 * BeanTools.populate(User,request.getParameterMap())
	 */
	public static void populate(Object bean,Map<String,String[]> properties ){
		//创建BeanUtils提供的时间转换器
		DateConverter dateConverter = new DateConverter();
		//设置需要转换的格式
		dateConverter.setPatterns(new String[]{"yyyy-MM-dd","yyyy-MM-dd HH:mm:ss"});
		//注册转换器
		ConvertUtils.register(dateConverter, Date.class);
		try {
			//封装数据
			BeanUtils.populate(dateConverter, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 方式2 传递JavaBean Class类型，通过反射进行实例化，然后封装数据
	 * 高级封装，不需要new JAVABean
	 * 例如：User user = BeanTools.populate(User.class,request.getParameter());
	 */
	public static<T> T populate(Class<T> beanClass,Map<String,String[]> properties){
		//使用反射创建实例
		try {
			T  bean = beanClass.newInstance();
			//创建BeanUtils提供的时间转换器
			DateConverter dateConverter = new DateConverter();
			//设置需要转换的格式
			dateConverter.setPatterns(new String[]{"yyyy-MM-dd","yyyy-MM-dd HH:mm:ss"});
			//注册转换器
			ConvertUtils.register(dateConverter, Date.class);
			//封装数据
			BeanUtils.populate(bean, properties);
			return bean;
		} catch (Exception e) {
			throw new RuntimeException();
		}
		//
	}
}
