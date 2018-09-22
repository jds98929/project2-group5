package com.revature.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
	private String id;
	private String name;
	private String jersey;
	@JsonProperty("birth_date")
	private String birthDate;
	private int weight;
	private int height;
	private String position;
	private int age;
	@JsonProperty("rookie_year")
	private int rookieYear;
	@JsonProperty("birth_place")
	private String birthPlace;
	@JsonProperty("high_school")
	private String highSchool;
	private String college;
	private String status;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String id, String name, String jersey, String birthDate, int weight, int height, String position,
			int age, int rookieYear, String birthPlace, String highSchool, String college, String status) {
		super();
		this.id = id;
		this.name = name;
		this.jersey = jersey;
		this.birthDate = birthDate;
		this.weight = weight;
		this.height = height;
		this.position = position;
		this.age = age;
		this.rookieYear = rookieYear;
		this.birthPlace = birthPlace;
		this.highSchool = highSchool;
		this.college = college;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJersey() {
		return jersey;
	}
	public void setJersey(String jersey) {
		this.jersey = jersey;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRookieYear() {
		return rookieYear;
	}
	public void setRookieYear(int rookieYear) {
		this.rookieYear = rookieYear;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getHighSchool() {
		return highSchool;
	}
	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + height;
		result = prime * result + ((highSchool == null) ? 0 : highSchool.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jersey == null) ? 0 : jersey.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + rookieYear;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (height != other.height)
			return false;
		if (highSchool == null) {
			if (other.highSchool != null)
				return false;
		} else if (!highSchool.equals(other.highSchool))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jersey == null) {
			if (other.jersey != null)
				return false;
		} else if (!jersey.equals(other.jersey))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (rookieYear != other.rookieYear)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", jersey=" + jersey + ", birthDate=" + birthDate + ", weight="
				+ weight + ", height=" + height + ", position=" + position + ", age=" + age + ", rookieYear="
				+ rookieYear + ", birthPlace=" + birthPlace + ", highSchool=" + highSchool + ", college=" + college
				+ ", status=" + status + "]";
	}
	
}
