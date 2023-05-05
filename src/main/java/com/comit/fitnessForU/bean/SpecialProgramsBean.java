package com.comit.fitnessForU.bean;

public class SpecialProgramsBean {
	int specialID;
	String specialName;
	String description;
	double specialFee;
	int availability;
	
	
	
	public SpecialProgramsBean(int specialID, String specialName, String description, double specialFee,
			int availability) {
		super();
		this.specialID = specialID;
		this.specialName = specialName;
		this.description = description;
		this.specialFee = specialFee;
		this.availability = availability;
	}
	public SpecialProgramsBean() {
		
	}
	public int getSpecialID() {
		return specialID;
	}
	public void setSpecialID(int specialID) {
		this.specialID = specialID;
	}
	public String getSpecialName() {
		return specialName;
	}
	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSpecialFee() {
		return specialFee;
	}
	public void setSpecialFee(double specialFee) {
		this.specialFee = specialFee;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "SpecialProgramsBean [specialID=" + specialID + ", specialName=" + specialName + ", description="
				+ description + ", specialFee=" + specialFee + ", availability=" + availability + "]";
	}
	
	
	
	

}
