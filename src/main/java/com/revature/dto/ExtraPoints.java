package com.revature.dto;

public class ExtraPoints {
	private int attempts;
	private int made;
	private int blocked;
	public ExtraPoints() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExtraPoints(int attempts, int made, int blocked) {
		super();
		this.attempts = attempts;
		this.made = made;
		this.blocked = blocked;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attempts;
		result = prime * result + blocked;
		result = prime * result + made;
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
		ExtraPoints other = (ExtraPoints) obj;
		if (attempts != other.attempts)
			return false;
		if (blocked != other.blocked)
			return false;
		if (made != other.made)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ExtraPoints [attempts=" + attempts + ", made=" + made + ", blocked=" + blocked + "]";
	}
}
