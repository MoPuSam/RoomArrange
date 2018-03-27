package org.tysf.ts.pojo;

import java.util.Date;

public class Course {
	private int c_id;//科目编号
	private String c_name;//科目名称
	private int count;//报考人数
	private Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Course(int c_id, String c_name, int count) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.count = count;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", count=" + count + "]";
	}
	
}
