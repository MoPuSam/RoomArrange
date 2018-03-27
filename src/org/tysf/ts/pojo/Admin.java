package org.tysf.ts.pojo;

public class Admin{
	private int id;
	private String username;
	private String password;
	private String rank;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String username, String password, String rank) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rank = rank;
	}
	public Admin(String username, String password, String rank) {
		super();
		this.username = username;
		this.password = password;
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", rank=" + rank + "]";
	}
	
	
}
