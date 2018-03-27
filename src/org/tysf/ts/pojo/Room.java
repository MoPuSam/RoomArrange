package org.tysf.ts.pojo;

public class Room {
	private int r_id;//考场号
	private String loc;//考场地点
	private int snum;//考生人数
	private Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int r_id, String loc, int snum) {
		super();
		this.r_id = r_id;
		this.loc = loc;
		this.snum = snum;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	@Override
	public String toString() {
		return "Room [r_id=" + r_id + ", loc=" + loc + ", snum=" + snum + "]";
	}

}
