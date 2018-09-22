package com.revature.dto;

public class Kickoffs {
	private int kickoffs;
	private int endzone;
	private int inside_20;
	private int return_yards;
	private int touchbacks;
	private int yards;
	private int out_of_bounds;
	private int onside_attempts;
	private int onside_successes;
	private int squib_kicks;
	public Kickoffs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kickoffs(int kickoffs, int endzone, int inside_20, int return_yards, int touchbacks, int yards,
			int out_of_bounds, int onside_attempts, int onside_successes, int squib_kicks) {
		super();
		this.kickoffs = kickoffs;
		this.endzone = endzone;
		this.inside_20 = inside_20;
		this.return_yards = return_yards;
		this.touchbacks = touchbacks;
		this.yards = yards;
		this.out_of_bounds = out_of_bounds;
		this.onside_attempts = onside_attempts;
		this.onside_successes = onside_successes;
		this.squib_kicks = squib_kicks;
	}
	public int getKickoffs() {
		return kickoffs;
	}
	public void setKickoffs(int kickoffs) {
		this.kickoffs = kickoffs;
	}
	public int getEndzone() {
		return endzone;
	}
	public void setEndzone(int endzone) {
		this.endzone = endzone;
	}
	public int getInside_20() {
		return inside_20;
	}
	public void setInside_20(int inside_20) {
		this.inside_20 = inside_20;
	}
	public int getReturn_yards() {
		return return_yards;
	}
	public void setReturn_yards(int return_yards) {
		this.return_yards = return_yards;
	}
	public int getTouchbacks() {
		return touchbacks;
	}
	public void setTouchbacks(int touchbacks) {
		this.touchbacks = touchbacks;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public int getOut_of_bounds() {
		return out_of_bounds;
	}
	public void setOut_of_bounds(int out_of_bounds) {
		this.out_of_bounds = out_of_bounds;
	}
	public int getOnside_attempts() {
		return onside_attempts;
	}
	public void setOnside_attempts(int onside_attempts) {
		this.onside_attempts = onside_attempts;
	}
	public int getOnside_successes() {
		return onside_successes;
	}
	public void setOnside_successes(int onside_successes) {
		this.onside_successes = onside_successes;
	}
	public int getSquib_kicks() {
		return squib_kicks;
	}
	public void setSquib_kicks(int squib_kicks) {
		this.squib_kicks = squib_kicks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endzone;
		result = prime * result + inside_20;
		result = prime * result + kickoffs;
		result = prime * result + onside_attempts;
		result = prime * result + onside_successes;
		result = prime * result + out_of_bounds;
		result = prime * result + return_yards;
		result = prime * result + squib_kicks;
		result = prime * result + touchbacks;
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
		Kickoffs other = (Kickoffs) obj;
		if (endzone != other.endzone)
			return false;
		if (inside_20 != other.inside_20)
			return false;
		if (kickoffs != other.kickoffs)
			return false;
		if (onside_attempts != other.onside_attempts)
			return false;
		if (onside_successes != other.onside_successes)
			return false;
		if (out_of_bounds != other.out_of_bounds)
			return false;
		if (return_yards != other.return_yards)
			return false;
		if (squib_kicks != other.squib_kicks)
			return false;
		if (touchbacks != other.touchbacks)
			return false;
		if (yards != other.yards)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kickoffs [kickoffs=" + kickoffs + ", endzone=" + endzone + ", inside_20=" + inside_20
				+ ", return_yards=" + return_yards + ", touchbacks=" + touchbacks + ", yards=" + yards
				+ ", out_of_bounds=" + out_of_bounds + ", onside_attempts=" + onside_attempts + ", onside_successes="
				+ onside_successes + ", squib_kicks=" + squib_kicks + "]";
	}
	
}
