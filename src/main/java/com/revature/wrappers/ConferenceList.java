package com.revature.wrappers;

import java.util.List;

import com.revature.dto.Conferences;

public class ConferenceList {
	private List<Conferences> conferences;

	public ConferenceList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConferenceList(List<Conferences> conferences) {
		super();
		this.conferences = conferences;
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
		ConferenceList other = (ConferenceList) obj;
		if (conferences == null) {
			if (other.conferences != null)
				return false;
		} else if (!conferences.equals(other.conferences))
			return false;
		return true;
	}
	
}
