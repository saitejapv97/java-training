package com.hcl.jdbcpro;

import java.util.Scanner;



public class DeleteDepartmentmain {

	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department No ");
		deptno=sc.nextInt();
		DepartmentDAO dao=new DepartmentDAO();
		System.out.println(dao.deleteDepartment(deptno));
	}
}
