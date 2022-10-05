package com.greatLearning.project.services;

public class AdminDepartment  extends SuperDepartment{
	
	public String departmentName() {
		String nameOfDepartment = "Admin Department";
		return nameOfDepartment;
	}
	
	public String getTodaysWork() {
		String todaysWork = "Complete your document submission";
		return todaysWork;
	}
	
	public String getWorkDeadLine() {
		String workDeadLine = "Complete by EOD";
		return workDeadLine;
		
	}

}
