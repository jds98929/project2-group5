package com.revature.dto;

import java.util.List;

public class Conferences {
	private String id;
	private String name;
	List<Division> divisions;
	public Conferences() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conferences(String id, String name, List<Division> divisions) {
		super();
		this.id = id;
		this.name = name;
		this.divisions = divisions;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the divisions
	 */
	public List<Division> getDivisions() {
		return divisions;
	}
	/**
	 * @param divisions the divisions to set
	 */
	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((divisions == null) ? 0 : divisions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conferences other = (Conferences) obj;
		if (divisions == null) {
			if (other.divisions != null)
				return false;
		} else if (!divisions.equals(other.divisions))
			return false;
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
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conferences [id=" + id + ", name=" + name + ", divisions=" + divisions + "]";
	}
	
	
}
