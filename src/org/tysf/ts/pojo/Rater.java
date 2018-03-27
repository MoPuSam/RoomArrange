package org.tysf.ts.pojo;

public class Rater{
	private int t_id;
	private String name;
	private int a_id;
	private String username;
	private String password;
	private String rank;
	private Arrange arrange;
	public Rater() {
		// TODO Auto-generated constructor stub
	}
	public Rater(String username, String password, String rank, int t_id, String name, int a_id, String username2,
			String password2, String rank2) {
		this.t_id = t_id;
		this.name = name;
		this.a_id = a_id;
		username = username2;
		password = password2;
		rank = rank2;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int g_id) {
		this.a_id = g_id;
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
	
	public Arrange getArrange() {
		return arrange;
	}
	public void setArrange(Arrange arrange) {
		this.arrange = arrange;
	}
	@Override
	public String toString() {
		return "Rater [t_id=" + t_id + ", name=" + name + ", a_id=" + a_id + ", username=" + username + ", password="
				+ password + ", rank=" + rank + "]";
	}

	
}
