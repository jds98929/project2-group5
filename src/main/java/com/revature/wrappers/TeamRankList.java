package com.revature.wrappers;

import java.util.List;

import com.revature.dto.TeamRank;

public class TeamRankList {
	private List<TeamRank> teamRank;

	public TeamRankList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeamRankList(List<TeamRank> teamRank) {
		super();
		this.teamRank = teamRank;
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
		TeamRankList other = (TeamRankList) obj;
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
		return "TeamRankList [teamRank=" + teamRank + "]";
	}
	
}
