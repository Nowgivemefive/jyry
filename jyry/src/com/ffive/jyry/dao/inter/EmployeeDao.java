package com.ffive.jyry.dao.inter;

import java.util.List;

import com.ffive.jyry.beans.Employee;

public interface EmployeeDao {
	// ���ز�ѯ��������Ա��
	public List<Employee> findAll(int e_is);

}
