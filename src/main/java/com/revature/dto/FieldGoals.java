package com.revature.dto;

public class FieldGoals {
	private int attempts;
	private int made;
	private int blocked;
	private int yards;
	private int avg_yards;
	private int longest;
	public FieldGoals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FieldGoals(int attempts, int made, int blocked, int yards, int avg_yards, int longest) {
		super();
		this.attempts = attempts;
		this.made = made;
		this.blocked = blocked;
		this.yards = yards;
		this.avg_yards = avg_yards;
		this.longest = longest;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getMade() {
		return made;
	}
	public void setMade(int made) {
		this.made = made;
	}
	public int getBlocked() {
		return blocked;
	}
	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public int getAvg_yards() {
		return avg_yards;
	}
	public void setAvg_yards(int avg_yards) {
		this.avg_yards = avg_yards;
	}
	public int getLongest() {
		return longest;
	}
	public void setLongest(int longest) {
		this.longest = longest;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attempts;
		result = prime * result + avg_yards;
		result = prime * result + blocked;
		result = prime * result + longest;
		result = prime * result + made;
		result = prime * result + yards;
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
		FieldGoals other = (FieldGoals) obj;
		if (attempts != other.attempts)
			return false;
		if (avg_yards != other.avg_yards)
			return false;
		if (blocked != other.blocked)
			return false;
		if (longest != other.longest)
			return false;
		if (made != other.made)
			return false;
		if (yards != other.yards)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FieldGoals [attempts=" + attempts + ", made=" + made + ", blocked=" + blocked + ", yards=" + yards
				+ ", avg_yards=" + avg_yards + ", longest=" + longest + "]";
	}
	
}
