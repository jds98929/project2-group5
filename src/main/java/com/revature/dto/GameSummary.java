package com.revature.dto;

public class GameSummary {
	private Home home;
	private Away away;
	public GameSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameSummary(Home home, Away away) {
		super();
		this.home = home;
		this.away = away;
	}
	/**
	 * @return the home
	 */
	public Home getHome() {
		return home;
	}
	/**
	 * @param home the home to set
	 */
	public void setHome(Home home) {
		this.home = home;
	}
	/**
	 * @return the away
	 */
	public Away getAway() {
		return away;
	}
	/**
	 * @param away the away to set
	 */
	public void setAway(Away away) {
		this.away = away;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
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
		GameSummary other = (GameSummary) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameSummary [home=" + home + ", away=" + away + "]";
	}
	
}
