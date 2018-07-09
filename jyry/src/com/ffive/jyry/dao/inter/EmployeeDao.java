package com.ffive.jyry.dao.inter;

import java.util.List;

import com.ffive.jyry.beans.Employee;

public interface EmployeeDao {
	// 返回查询到的所有员工
	public List<Employee> findAll(int e_is);

}
