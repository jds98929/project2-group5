package com.revature.dto;

public class GameStats {

	private Stats statistics;

	public GameStats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameStats(Stats statistics) {
		super();
		this.statistics = statistics;
	}

	public Stats getStatistics() {
		return statistics;
	}

	public void setStatistics(Stats statistics) {
		this.statistics = statistics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
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
		GameStats other = (GameStats) obj;
		if (statistics == null) {
			if (other.statistics != null)
				return false;
		} else if (!statistics.equals(other.statistics))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GameStats [statistics=" + statistics + "]";
	}
	
}