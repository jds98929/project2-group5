package com.revature.dto;

import java.util.List;

public class PlayerProfile {
	private String id;
	private String name;
	private String jersey;
	private int weight;
	private int height;
	private String position;
	private String birth_place;
	private String college;
	private String high_school;
	private int rookie_year;
	private String birth_date;
	private List<Season> seasons;
	public PlayerProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerProfile(String id, String name, String jersey, int weight, int height, String position,
			String birth_place, String college, String high_school, int rookie_year, String birth_date,
			List<Season> seasons) {
		super();
		this.id = id;
		this.name = name;
		this.jersey = jersey;
		this.weight = weight;
		this.height = height;
		this.position = position;
		this.birth_place = birth_place;
		this.college = college;
		this.high_school = high_school;
		this.rookie_year = rookie_year;
		this.birth_date = birth_date;
		this.seasons = seasons;
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
	public String getBirth_place() {
		return birth_place;
	}
	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getHigh_school() {
		return high_school;
	}
	public void setHigh_school(String high_school) {
		this.high_school = high_school;
	}
	public int getRookie_year() {
		return rookie_year;
	}
	public void setRookie_year(int rookie_year) {
		this.rookie_year = rookie_year;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public List<Season> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth_date == null) ? 0 : birth_date.hashCode());
		result = prime * result + ((birth_place == null) ? 0 : birth_place.hashCode());
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + height;
		result = prime * result + ((high_school == null) ? 0 : high_school.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jersey == null) ? 0 : jersey.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + rookie_year;
		result = prime * result + ((seasons == null) ? 0 : seasons.hashCode());
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
		PlayerProfile other = (PlayerProfile) obj;
		if (birth_date == null) {
			if (other.birth_date != null)
				return false;
		} else if (!birth_date.equals(other.birth_date))
			return false;
		if (birth_place == null) {
			if (other.birth_place != null)
				return false;
		} else if (!birth_place.equals(other.birth_place))
			return false;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (height != other.height)
			return false;
		if (high_school == null) {
			if (other.high_school != null)
				return false;
		} else if (!high_school.equals(other.high_school))
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
		if (rookie_year != other.rookie_year)
			return false;
		if (seasons == null) {
			if (other.seasons != null)
				return false;
		} else if (!seasons.equals(other.seasons))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PlayerProfile [id=" + id + ", name=" + name + ", jersey=" + jersey + ", weight=" + weight + ", height="
				+ height + ", position=" + position + ", birth_place=" + birth_place + ", college=" + college
				+ ", high_school=" + high_school + ", rookie_year=" + rookie_year + ", birth_date=" + birth_date
				+ ", seasons=" + seasons + "]";
	}
}
