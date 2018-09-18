package com.revature.wrappers;

import java.util.List;

import com.revature.dto.Division;

public class DivisionList {
	private List<Division> divisions;

	public DivisionList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DivisionList(List<Division> divisions) {
		super();
		this.divisions = divisions;
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
		DivisionList other = (DivisionList) obj;
		if (divisions == null) {
			if (other.divisions != null)
				return false;
		} else if (!divisions.equals(other.divisions))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DivisionList [divisions=" + divisions + "]";
	}
	
}
