package com.greatLearning.project.driver;

import com.greatLearning.project.services.*;

public class Main {
	
	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment td = new TechDepartment();
		
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadLine());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println("========");
		
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadLine());
		System.out.println(hr.isTodayAHoliday());
		System.out.println(hr.doActivity());

		
		System.out.println("===========");
		
		System.out.println("Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadLine());
		System.out.println(td.isTodayAHoliday());
		
		System.out.println("=======");
		
	}
}
