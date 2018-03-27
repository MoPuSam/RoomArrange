package org.tysf.ts.pojo;

public class Student{
	private int s_id;//学生编号
	private String idcord;//身份证号
	private String pcord;//准考证号
	private String name;//姓名
	private String sex;//性别
	private int a_id;//考场号
	private int pnum;//考试序号
	private String subject;//考试科目
	private String level;//考试等级(中小幼大学)
	private double wscore;//笔试成绩120
	private double psychics;//心理学100
	private double education;//教育学100
	private String username;//用户名
	private String password;//密码
	private String rank;//级别
	private String photo;
	private Arrange arrange;
	public Student() {
	}
	public Student(int s_id, String idcord, String pcord, String name, String sex, int a_id, int pnum, String subject,
			String level, double wscore, double psychics, double education, String username, String password,
			String rank, String photo) {
		super();
		this.s_id = s_id;
		this.idcord = idcord;
		this.pcord = pcord;
		this.name = name;
		this.sex = sex;
		this.a_id = a_id;
		this.pnum = pnum;
		this.subject = subject;
		this.level = level;
		this.wscore = wscore;
		this.psychics = psychics;
		this.education = education;
		this.username = username;
		this.password = password;
		this.rank = rank;
		this.photo = photo;
	}
	public Student(String idcord, String pcord, String name, String sex, int a_id, int pnum, String subject,
			String level, double wscore, double psychics, double education, String username, String password,
			String rank, String photo) {
		super();
		this.idcord = idcord;
		this.pcord = pcord;
		this.name = name;
		this.sex = sex;
		this.a_id = a_id;
		this.pnum = pnum;
		this.subject = subject;
		this.level = level;
		this.wscore = wscore;
		this.psychics = psychics;
		this.education = education;
		this.username = username;
		this.password = password;
		this.rank = rank;
		this.photo = photo;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getIdcord() {
		return idcord;
	}
	public void setIdcord(String idcord) {
		this.idcord = idcord;
	}
	public String getPcord() {
		return pcord;
	}
	public void setPcord(String pcord) {
		this.pcord = pcord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public double getWscore() {
		return wscore;
	}
	public void setWscore(double wscore) {
		this.wscore = wscore;
	}
	public double getPsychics() {
		return psychics;
	}
	public void setPsychics(double psychics) {
		this.psychics = psychics;
	}
	public double getEducation() {
		return education;
	}
	public void setEducation(double education) {
		this.education = education;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public Arrange getArrange() {
		return arrange;
	}
	public void setArrange(Arrange arrange) {
		this.arrange = arrange;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", idcord=" + idcord + ", pcord=" + pcord + ", name=" + name + ", sex=" + sex
				+ ", a_id=" + a_id + ", pnum=" + pnum + ", subject=" + subject + ", level=" + level + ", wscore="
				+ wscore + ", psychics=" + psychics + ", education=" + education + ", username=" + username
				+ ", password=" + password + ", rank=" + rank + ", photo=" + photo + "]";
	}
	
	
}
