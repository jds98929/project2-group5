package com.revature.dto;

import java.util.List;

public class Stats {
	private TeamStats home;
	private TeamStats away;
	public Stats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stats(TeamStats home, TeamStats away) {
		super();
		this.home = home;
		this.away = away;
	}
	public TeamStats getHome() {
		return home;
	}
	public void setHome(TeamStats home) {
		this.home = home;
	}
	public TeamStats getAway() {
		return away;
	}
	public void setAway(TeamStats away) {
		this.away = away;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
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
		Stats other = (Stats) obj;
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
	@Override
	public String toString() {
		return "Stats [home=" + home + ", away=" + away + "]";
	}
	
}
