package com.greatLearning.project.services;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		String nameOfDepartment = "Hr Department";
		return nameOfDepartment;
	}
	
	public String getTodaysWork() {
		String todaysWork = "Fill Today's timesheet and mark your attendence";
		return todaysWork;
	}
	
	public String getWorkDeadLine() {
		String workDeadLine = "Complete by EOD";
		return workDeadLine;
	}
	
	public String doActivity() {
		String activity = "Team Lunch";
		return activity;
	}

}
