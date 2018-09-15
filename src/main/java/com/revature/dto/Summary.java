package com.revature.dto;

public class Summary {
	
	private String possession_time;
    private int safeties;
    private int turnovers;
    private int total_yards;
    private int fumbles;
    private int penalties;
    
	@Override
	public String toString() {
		return "Summary [possession_time=" + possession_time + ", safeties=" + safeties + ", turnovers=" + turnovers
				+ ", total_yards=" + total_yards + ", fumbles=" + fumbles + ", penalties=" + penalties + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fumbles;
		result = prime * result + penalties;
		result = prime * result + ((possession_time == null) ? 0 : possession_time.hashCode());
		result = prime * result + safeties;
		result = prime * result + total_yards;
		result = prime * result + turnovers;
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
		Summary other = (Summary) obj;
		if (fumbles != other.fumbles)
			return false;
		if (penalties != other.penalties)
			return false;
		if (possession_time == null) {
			if (other.possession_time != null)
				return false;
		} else if (!possession_time.equals(other.possession_time))
			return false;
		if (safeties != other.safeties)
			return false;
		if (total_yards != other.total_yards)
			return false;
		if (turnovers != other.turnovers)
			return false;
		return true;
	}
	public String getPossession_time() {
		return possession_time;
	}
	public void setPossession_time(String possession_time) {
		this.possession_time = possession_time;
	}
	public int getSafeties() {
		return safeties;
	}
	public void setSafeties(int safeties) {
		this.safeties = safeties;
	}
	public int getTurnovers() {
		return turnovers;
	}
	public void setTurnovers(int turnovers) {
		this.turnovers = turnovers;
	}
	public int getTotal_yards() {
		return total_yards;
	}
	public void setTotal_yards(int total_yards) {
		this.total_yards = total_yards;
	}
	public int getFumbles() {
		return fumbles;
	}
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}
	public int getPenalties() {
		return penalties;
	}
	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}
	public Summary(String possession_time, int safeties, int turnovers, int total_yards, int fumbles, int penalties) {
		super();
		this.possession_time = possession_time;
		this.safeties = safeties;
		this.turnovers = turnovers;
		this.total_yards = total_yards;
		this.fumbles = fumbles;
		this.penalties = penalties;
	}

	public Summary() {
		super();
		// TODO Auto-generated constructor stub
	}
}
