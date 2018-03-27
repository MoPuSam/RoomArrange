package org.tysf.ts.pojo;

public class User {
	private String username;
	private String password;
	private String rank;
	private User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String rank) {
		super();
		this.username = username;
		this.password = password;
		this.rank = rank;
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
		return "User [username=" + username + ", password=" + password + ", rank=" + rank + "]";
	}
	
}
