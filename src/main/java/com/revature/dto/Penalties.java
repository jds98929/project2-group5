package com.revature.dto;

public class Penalties {
	private int penalties;
	private int yards;
	public Penalties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Penalties(int penalties, int yards) {
		super();
		this.penalties = penalties;
		this.yards = yards;
	}
	public int getPenalties() {
		return penalties;
	}
	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + penalties;
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
		Penalties other = (Penalties) obj;
		if (penalties != other.penalties)
			return false;
		if (yards != other.yards)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Penalties [penalties=" + penalties + ", yards=" + yards + "]";
	}
}
