package com.ffive.jyry.beans;

public class Employee {
	
	private Integer emp_id; // 员工ID
	private Integer part_id; // 部门ID
	private String emp_loginname; // 登录名
	private String emp_img; // 头像路径
	private String emp_sex; // 性别
	private Integer emp_flag;
	private Integer emp_admin;
	private String emp_remark;
	private String emp_truename; // 员工真实姓名
	private Integer emp_is; //员工是否离职
	
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Integer getPart_id() {
		return part_id;
	}
	public void setPart_id(Integer part_id) {
		this.part_id = part_id;
	}
	public String getEmp_loginname() {
		return emp_loginname;
	}
	public void setEmp_loginname(String emp_loginname) {
		this.emp_loginname = emp_loginname;
	}
	public String getEmp_img() {
		return emp_img;
	}
	public void setEmp_img(String emp_img) {
		this.emp_img = emp_img;
	}
	public String getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public Integer getEmp_flag() {
		return emp_flag;
	}
	public void setEmp_flag(Integer emp_flag) {
		this.emp_flag = emp_flag;
	}
	public Integer getEmp_admin() {
		return emp_admin;
	}
	public void setEmp_admin(Integer emp_admin) {
		this.emp_admin = emp_admin;
	}
	public String getEmp_remark() {
		return emp_remark;
	}
	public void setEmp_remark(String emp_remark) {
		this.emp_remark = emp_remark;
	}
	public String getEmp_truename() {
		return emp_truename;
	}
	public void setEmp_truename(String emp_truename) {
		this.emp_truename = emp_truename;
	}
	public Integer getEmp_is() {
		return emp_is;
	}
	public void setEmp_is(Integer emp_is) {
		this.emp_is = emp_is;
	}

}
