package com.revature.dto;

public class GameTeamStatistics {

	private String teamCity;
	private String teamName;
	private String possessionTime;
	private String safeties;
	private String turnovers;
	private String rushingYards;
	private String totalYards;
	private String fumble;
	private String penalties;
	public GameTeamStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GameTeamStatistics [teamCity=" + teamCity + ", teamName=" + teamName + ", possessionTime="
				+ possessionTime + ", safeties=" + safeties + ", turnovers=" + turnovers + ", rushingYards="
				+ rushingYards + ", totalYards=" + totalYards + ", fumble=" + fumble + ", penalties=" + penalties + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fumble == null) ? 0 : fumble.hashCode());
		result = prime * result + ((penalties == null) ? 0 : penalties.hashCode());
		result = prime * result + ((possessionTime == null) ? 0 : possessionTime.hashCode());
		result = prime * result + ((rushingYards == null) ? 0 : rushingYards.hashCode());
		result = prime * result + ((safeties == null) ? 0 : safeties.hashCode());
		result = prime * result + ((teamCity == null) ? 0 : teamCity.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((totalYards == null) ? 0 : totalYards.hashCode());
		result = prime * result + ((turnovers == null) ? 0 : turnovers.hashCode());
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
		GameTeamStatistics other = (GameTeamStatistics) obj;
		if (fumble == null) {
			if (other.fumble != null)
				return false;
		} else if (!fumble.equals(other.fumble))
			return false;
		if (penalties == null) {
			if (other.penalties != null)
				return false;
		} else if (!penalties.equals(other.penalties))
			return false;
		if (possessionTime == null) {
			if (other.possessionTime != null)
				return false;
		} else if (!possessionTime.equals(other.possessionTime))
			return false;
		if (rushingYards == null) {
			if (other.rushingYards != null)
				return false;
		} else if (!rushingYards.equals(other.rushingYards))
			return false;
		if (safeties == null) {
			if (other.safeties != null)
				return false;
		} else if (!safeties.equals(other.safeties))
			return false;
		if (teamCity == null) {
			if (other.teamCity != null)
				return false;
		} else if (!teamCity.equals(other.teamCity))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (totalYards == null) {
			if (other.totalYards != null)
				return false;
		} else if (!totalYards.equals(other.totalYards))
			return false;
		if (turnovers == null) {
			if (other.turnovers != null)
				return false;
		} else if (!turnovers.equals(other.turnovers))
			return false;
		return true;
	}
	public String getTeamCity() {
		return teamCity;
	}
	public void setTeamCity(String teamCity) {
		this.teamCity = teamCity;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPossessionTime() {
		return possessionTime;
	}
	public void setPossessionTime(String possessionTime) {
		this.possessionTime = possessionTime;
	}
	public String getSafeties() {
		return safeties;
	}
	public void setSafeties(String safeties) {
		this.safeties = safeties;
	}
	public String getTurnovers() {
		return turnovers;
	}
	public void setTurnovers(String turnovers) {
		this.turnovers = turnovers;
	}
	public String getRushingYards() {
		return rushingYards;
	}
	public void setRushingYards(String rushingYards) {
		this.rushingYards = rushingYards;
	}
	public String getTotalYards() {
		return totalYards;
	}
	public void setTotalYards(String totalYards) {
		this.totalYards = totalYards;
	}
	public String getFumble() {
		return fumble;
	}
	public void setFumble(String fumble) {
		this.fumble = fumble;
	}
	public String getPenalties() {
		return penalties;
	}
	public void setPenalties(String penalties) {
		this.penalties = penalties;
	}
	public GameTeamStatistics(String teamCity, String teamName, String possessionTime, String safeties,
			String turnovers, String rushingYards, String totalYards, String fumble, String penalties) {
		super();
		this.teamCity = teamCity;
		this.teamName = teamName;
		this.possessionTime = possessionTime;
		this.safeties = safeties;
		this.turnovers = turnovers;
		this.rushingYards = rushingYards;
		this.totalYards = totalYards;
		this.fumble = fumble;
		this.penalties = penalties;
	}
	
//	
}
