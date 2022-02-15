package com.emloyeewage.oops;

import java.util.Random;

class Employee {
	static final int is_full_time = 1;	
	static final int is_Part_time = 2;	
	static final int Emp_Rate_Per_Day = 20;	
	static final int Emp_Rate_For_Month = 20;	
	static final int Total_Working_Hrs_Month = 100;	
	private static final int IS_FULL_TIME = 0;

	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		return empCheck;
	}

	public static int empWrkHrs(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case is_full_time -> empWrkHrs = 8;
		case is_Part_time -> empWrkHrs = 4;
		default -> empWrkHrs = 0;
		}
		return empWrkHrs;
	}

	public static int empWage(int empWrkHrs) {
		int empWage = empWrkHrs * Emp_Rate_Per_Day;
		return empWage;
	}

	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWrkHrs = 0;
		int empWage = 0;
		int empCheck = 0;
		int totalEmpWrkHrs = 0;
		while (day < Emp_Rate_For_Month && totalEmpWrkHrs < Total_Working_Hrs_Month) {
			empCheck = empCheck();
			empWrkHrs = empWrkHrs(empCheck);
			empWage = empWage(empWrkHrs);
			totalEmpWrkHrs += empWrkHrs;
			++day;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}

}

public class EmployeeWage {
	public static void main(String[] args) {
		int totalEmpSalary;
		System.out.println("Welcome to empwage");
		totalEmpSalary = Employee.totalEmpSalary();
		System.out.println("totalEmpSalary = " + totalEmpSalary);
	}

}