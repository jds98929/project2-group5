package com.revature.dto;

public class Schedule {
	private Game g;
	private GameStats gs;
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(Game g, GameStats gs) {
		super();
		this.g = g;
		this.gs = gs;
	}
	public Game getG() {
		return g;
	}
	public void setG(Game g) {
		this.g = g;
	}
	public GameStats getGs() {
		return gs;
	}
	public void setGs(GameStats gs) {
		this.gs = gs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((g == null) ? 0 : g.hashCode());
		result = prime * result + ((gs == null) ? 0 : gs.hashCode());
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
		Schedule other = (Schedule) obj;
		if (g == null) {
			if (other.g != null)
				return false;
		} else if (!g.equals(other.g))
			return false;
		if (gs == null) {
			if (other.gs != null)
				return false;
		} else if (!gs.equals(other.gs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Schedule [g=" + g + ", gs=" + gs + "]";
	}
	
}
