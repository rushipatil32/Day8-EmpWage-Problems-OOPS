package com.emloyeewage.oops;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to empwage");

		int empCheck = Employee.empCheck();
		Employee.empSalary(empCheck);
	}

}
class Employee {
	static final int is_full_time = 1;
	static final int is_part_time = 2;
	static final int Emp_Rate_Per_Hr = 20;
	static final int Emp_Rate_For_Month = 20;

	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		return empCheck;
	}
	public static int empSalary(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case is_full_time -> empWrkHrs = 8;
		case is_part_time -> empWrkHrs = 4;
		default -> empWrkHrs = 0;
		}
		int empWage = empWrkHrs * Emp_Rate_Per_Hr;
		System.out.println("empWage = " + empWage);
		return empWage;
	}
	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWage = 0;
		int empCheck = 0;
		while (day < Emp_Rate_For_Month) {
		    empCheck = empCheck();
		    empWage = empSalary(empCheck);
		    ++day;
		    totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	    }
}