package com.revature.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
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
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, String jersey, String birthDate, int weight, int height, String position, int age,
			int rookieYear) {
		super();
		this.name = name;
		this.jersey = jersey;
		this.birthDate = birthDate;
		this.weight = weight;
		this.height = height;
		this.position = position;
		this.age = age;
		this.rookieYear = rookieYear;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + height;
		result = prime * result + ((jersey == null) ? 0 : jersey.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + rookieYear;
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
		if (height != other.height)
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
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", jersey=" + jersey + ", birthDate=" + birthDate + ", weight=" + weight
				+ ", height=" + height + ", position=" + position + ", age=" + age + ", rookieYear=" + rookieYear + "]";
	}
	
}
