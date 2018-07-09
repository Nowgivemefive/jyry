package com.ffive.jyry.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.ffive.jyry.utils.DBHelper;
import com.ffive.jyry.beans.Employee;
import com.ffive.jyry.dao.inter.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> findAll(int e_is) {
		List<Employee> emplyee_list =new ArrayList<Employee>();
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = DBHelper.getConnection();
			String sql = "SELECT * FROM t_emp where e_is = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, e_is);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp =new Employee();
				emp.setEmp_id(rs.getInt("e_id"));
				emp.setPart_id(rs.getInt("p_id"));
				emp.setEmp_loginname(rs.getString("e_loginname"));
				emp.setEmp_img(rs.getString("e_img"));
				emp.setEmp_sex(rs.getString("e_sex"));
				emp.setEmp_flag(rs.getInt("e_flag"));
				emp.setEmp_admin(rs.getInt("e_admin"));
				emp.setEmp_remark(rs.getString("e_remark"));
				emp.setEmp_truename(rs.getString("e_truename"));
				emp.setEmp_is(rs.getInt("e_is"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBHelper.free(rs, ps, conn);
		}
		return emplyee_list;

	}

}
