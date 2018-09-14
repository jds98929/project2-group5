package com.revature.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scoring {
	@JsonProperty("home_points")
	private int homePoints;
	@JsonProperty("away_points")
	private int awayPoints;
	public Scoring() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scoring(int homePoints, int awayPoints) {
		super();
		this.homePoints = homePoints;
		this.awayPoints = awayPoints;
	}
	/**
	 * @return the homePoints
	 */
	public int getHomePoints() {
		return homePoints;
	}
	/**
	 * @param homePoints the homePoints to set
	 */
	public void setHomePoints(int homePoints) {
		this.homePoints = homePoints;
	}
	/**
	 * @return the awayPoints
	 */
	public int getAwayPoints() {
		return awayPoints;
	}
	/**
	 * @param awayPoints the awayPoints to set
	 */
	public void setAwayPoints(int awayPoints) {
		this.awayPoints = awayPoints;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + awayPoints;
		result = prime * result + homePoints;
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
		Scoring other = (Scoring) obj;
		if (awayPoints != other.awayPoints)
			return false;
		if (homePoints != other.homePoints)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Scoring [homePoints=" + homePoints + ", awayPoints=" + awayPoints + "]";
	}
	
}
