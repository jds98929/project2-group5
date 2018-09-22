package com.revature.dto;

import java.util.List;

public class Season {
	private String id;
	private int year;
	private String type;
	private String name;
	private List<Week> weeks;
	private List<Team> teams;
	public Season() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Season(String id, int year, String type, String name, List<Week> weeks, List<Team> teams) {
		super();
		this.id = id;
		this.year = year;
		this.type = type;
		this.name = name;
		this.weeks = weeks;
		this.teams = teams;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Week> getWeeks() {
		return weeks;
	}
	public void setWeeks(List<Week> weeks) {
		this.weeks = weeks;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
		result = prime * result + year;
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
		Season other = (Season) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (weeks == null) {
			if (other.weeks != null)
				return false;
		} else if (!weeks.equals(other.weeks))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Season [id=" + id + ", year=" + year + ", type=" + type + ", name=" + name + ", weeks=" + weeks
				+ ", teams=" + teams + "]";
	}	
}
