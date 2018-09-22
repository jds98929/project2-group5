package com.revature.dto;

import java.util.List;

import com.revature.dto.Conferences;

public class SeasonStandings {
	private String id;
	private List<Conferences> conferences;
	public SeasonStandings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeasonStandings(String id, List<Conferences> conferences) {
		super();
		this.id = id;
		this.conferences = conferences;
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
	 * @return the conferences
	 */
	public List<Conferences> getConferences() {
		return conferences;
	}
	/**
	 * @param conferences the conferences to set
	 */
	public void setConferences(List<Conferences> conferences) {
		this.conferences = conferences;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conferences == null) ? 0 : conferences.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		SeasonStandings other = (SeasonStandings) obj;
		if (conferences == null) {
			if (other.conferences != null)
				return false;
		} else if (!conferences.equals(other.conferences))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SeasonStandings [id=" + id + ", conferences=" + conferences + "]";
	}
	
}
