package com.greatLearning.project.services;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
			String nameOfDepartment = "Tech Department";
			return nameOfDepartment;
		}
		
		public String getTodaysWork() {
			String todaysWork = "Complete coding of module 1";
			return todaysWork;
		}
		
		public String getWorkDeadLine() {
			String workDeadLine = "Complete by EOD";
			return workDeadLine;
		}
		
		public String getTechStackInformation() {
			String techStackInformation = "core  Java";
			return techStackInformation;
		}

	}