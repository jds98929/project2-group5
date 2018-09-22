package com.revature.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Division {
	private String id;
	private String name;
	private String alias;
	@JsonProperty("teams")
	List<TeamRank> teamRank;
	public Division() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Division(String id, String name, String alias, List<TeamRank> teamRank) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.teamRank = teamRank;
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the teamRank
	 */
	public List<TeamRank> getTeamRank() {
		return teamRank;
	}
	/**
	 * @param teamRank the teamRank to set
	 */
	public void setTeamRank(List<TeamRank> teamRank) {
		this.teamRank = teamRank;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teamRank == null) ? 0 : teamRank.hashCode());
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
		Division other = (Division) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
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
		if (teamRank == null) {
			if (other.teamRank != null)
				return false;
		} else if (!teamRank.equals(other.teamRank))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Division [id=" + id + ", name=" + name + ", alias=" + alias + ", teamRank=" + teamRank + "]";
	}
	
}
