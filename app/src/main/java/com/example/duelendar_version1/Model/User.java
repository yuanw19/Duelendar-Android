package com.example.duelendar_version1.Model;

public class User {
	private String userBackground;
	private String userCollege;
	private String userCollegeImage;
	private String userLocation;
	private String collegeLocation;

	//default constructor
	public User() {
		this.userBackground = null;
		this.userCollege = null;
		this.userCollegeImage = null;
		this.userLocation = "China";
		this.collegeLocation = "United States";
	}

	//customized constructor
	public User(String userBackground, String userCollege, String userCollegeImage,
				String userLocation, String collegeLocation) {
		this.userBackground = userBackground;
		this.userCollege = userCollege;
		this.userCollegeImage = userCollegeImage;
		this.userLocation = userLocation;
		this.collegeLocation = collegeLocation;
	}

	public String getUserBackground() {
		return userBackground;
	}

	public String getUserLocation() { return userLocation; }

	public String getCollegeLocation() { return collegeLocation; }

	public String getUserCollege() {return userCollege;}

	public String getUserCollegeImage() {return userCollegeImage;}

	public void setUserBackground(String userBackground) {
		this.userBackground = userBackground;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public void setUserCollege(String userCollege) {
		this.userCollege = userCollege;
	}

	public void setUserCollegeImage(String userCollegeImage) {
		this.userCollegeImage = userCollegeImage;
	}
}