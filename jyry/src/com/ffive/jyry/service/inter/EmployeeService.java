package com.ffive.jyry.service.inter;

import java.util.List;

import com.ffive.jyry.beans.Employee;

public interface EmployeeService {
	// ���ز�ѯ��������Ա��
		public List<Employee> findAll(int e_is);
}