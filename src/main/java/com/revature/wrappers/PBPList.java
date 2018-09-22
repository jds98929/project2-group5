package com.revature.wrappers;

import java.util.List;

import com.revature.dto.PBP;

public class PBPList {
	private List<PBP> pbp;

	public PBPList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PBPList(List<PBP> pbp) {
		super();
		this.pbp = pbp;
	}

	/**
	 * @return the pbp
	 */
	public List<PBP> getPbp() {
		return pbp;
	}

	/**
	 * @param pbp the pbp to set
	 */
	public void setPbp(List<PBP> pbp) {
		this.pbp = pbp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pbp == null) ? 0 : pbp.hashCode());
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
		PBPList other = (PBPList) obj;
		if (pbp == null) {
			if (other.pbp != null)
				return false;
		} else if (!pbp.equals(other.pbp))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PBPList [pbp=" + pbp + "]";
	}
	
}
