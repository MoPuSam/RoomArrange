package org.tysf.ts.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class Arrange {
	private int a_id;
	private int c_id;
	private Timestamp examDate;
	private int r_id;
	private Course course;
	public Arrange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Arrange(int a_id, int c_id, Timestamp examDate, int r_id) {
		super();
		this.a_id = a_id;
		this.c_id = c_id;
		this.examDate = examDate;
		this.r_id = r_id;
	}
	public Arrange(int c_id, Timestamp examDate, int r_id) {
		super();
		this.c_id = c_id;
		this.examDate = examDate;
		this.r_id = r_id;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public Timestamp getExamDate() {
		return examDate;
	}
	public void setExamDate(Timestamp examDate) {
		this.examDate = examDate;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Arrange [a_id=" + a_id + ", c_id=" + c_id + ", examDate=" + examDate + ", r_id=" + r_id + "]";
	}
	
}
