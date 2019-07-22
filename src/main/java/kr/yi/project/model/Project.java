package kr.yi.project.model;

import java.util.Date;

public class Project {
	private int p_no;
	private String p_name;
	private String p_content;
	private Date p_startdate;
	private Date p_enddate;
	private String p_state;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int p_no, String p_name, String p_content, Date p_startdate, Date p_enddate, String p_state) {
		super();
		this.p_no = p_no;
		this.p_name = p_name;
		this.p_content = p_content;
		this.p_startdate = p_startdate;
		this.p_enddate = p_enddate;
		this.p_state = p_state;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public Date getP_startdate() {
		return p_startdate;
	}
	public void setP_startdate(Date p_startdate) {
		this.p_startdate = p_startdate;
	}
	public Date getP_enddate() {
		return p_enddate;
	}
	public void setP_enddate(Date p_enddate) {
		this.p_enddate = p_enddate;
	}
	public String getP_state() {
		return p_state;
	}
	public void setP_state(String p_state) {
		this.p_state = p_state;
	}
	@Override
	public String toString() {
		return "Project [p_no=" + p_no + ", p_name=" + p_name + ", p_content=" + p_content + ", p_startdate="
				+ p_startdate + ", p_enddate=" + p_enddate + ", p_state=" + p_state + "]";
	}
	
	
	
}
