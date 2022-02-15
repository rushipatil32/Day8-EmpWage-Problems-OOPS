package com.emloyeewage.oops;

import java.util.Random;

public class EmpWageOOPS {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to empwage");
			Random ran = new Random();
			int present = 1;
			int empCheck = ran.nextInt(2);
			if (empCheck == present) {
				System.out.println("Employee is Present");
			}
			else {
				System.out.println("Employee is Absent");
			}
		
		}
}
