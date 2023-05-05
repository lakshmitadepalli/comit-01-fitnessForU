package com.comit.fitnessForU.bean;



public class ActivityBean {
	int activityId;
	String activityName;
	String description;
	double activityFee;
	int availability;
	
	
	
	
	
	public ActivityBean() {
		
	}
	public ActivityBean(int activityId, String activityName, String description, double activityFee, int availability) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.description = description;
		this.activityFee = activityFee;
		this.availability = availability;
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getActivityFee() {
		return activityFee;
	}
	public void setActivityFee(double activityFee) {
		this.activityFee = activityFee;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "ActivityBean [activityId=" + activityId + ", activityName=" + activityName + ", description="
				+ description + ", activityFee=" + activityFee + ", availability=" + availability + "]";
	}
	
	
	
	
	

}
