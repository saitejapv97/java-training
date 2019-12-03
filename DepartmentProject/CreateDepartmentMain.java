package com.hcl.jdbcpro;

import java.util.List;



public class CreateDepartmentMain {

	public static void main(String[] args) {
		DepartmentDAO dao=new DepartmentDAO();
		List<Department> departmentList=dao.showDepartment();
		for (Department department1 : departmentList) {
			System.out.println("Department No" +department1.getDeptno());
			System.out.println("Department Name " +department1.getDname());
			System.out.println("Location " +department1.getLoc());
			System.out.println("City" +department1.getCity());
			System.out.println("Head " +department1.getHead());
			System.out.println("-----------------------");
		}
	}
}
