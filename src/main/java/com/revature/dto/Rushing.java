package com.revature.dto;

public class Rushing {
	private double avg_yards;
	private int attempts;
	private int touchdowns;
	private int yards;
	private int longest;
	private int longest_touchdown;
	private int redzone_attempts;
	private int tlost;
	private int tlost_yards;
	private int broken_tackles;
	private int kneel_downs;
	private int scrambles;
	private int yards_after_contact;
	public Rushing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rushing(double avg_yards, int attempts, int touchdowns, int yards, int longest, int longest_touchdown,
			int redzone_attempts, int tlost, int tlost_yards, int broken_tackles, int kneel_downs, int scrambles,
			int yards_after_contact) {
		super();
		this.avg_yards = avg_yards;
		this.attempts = attempts;
		this.touchdowns = touchdowns;
		this.yards = yards;
		this.longest = longest;
		this.longest_touchdown = longest_touchdown;
		this.redzone_attempts = redzone_attempts;
		this.tlost = tlost;
		this.tlost_yards = tlost_yards;
		this.broken_tackles = broken_tackles;
		this.kneel_downs = kneel_downs;
		this.scrambles = scrambles;
		this.yards_after_contact = yards_after_contact;
	}
	public double getAvg_yards() {
		return avg_yards;
	}
	public void setAvg_yards(double avg_yards) {
		this.avg_yards = avg_yards;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getTouchdowns() {
		return touchdowns;
	}
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public int getLongest() {
		return longest;
	}
	public void setLongest(int longest) {
		this.longest = longest;
	}
	public int getLongest_touchdown() {
		return longest_touchdown;
	}
	public void setLongest_touchdown(int longest_touchdown) {
		this.longest_touchdown = longest_touchdown;
	}
	public int getRedzone_attempts() {
		return redzone_attempts;
	}
	public void setRedzone_attempts(int redzone_attempts) {
		this.redzone_attempts = redzone_attempts;
	}
	public int getTlost() {
		return tlost;
	}
	public void setTlost(int tlost) {
		this.tlost = tlost;
	}
	public int getTlost_yards() {
		return tlost_yards;
	}
	public void setTlost_yards(int tlost_yards) {
		this.tlost_yards = tlost_yards;
	}
	public int getBroken_tackles() {
		return broken_tackles;
	}
	public void setBroken_tackles(int broken_tackles) {
		this.broken_tackles = broken_tackles;
	}
	public int getKneel_downs() {
		return kneel_downs;
	}
	public void setKneel_downs(int kneel_downs) {
		this.kneel_downs = kneel_downs;
	}
	public int getScrambles() {
		return scrambles;
	}
	public void setScrambles(int scrambles) {
		this.scrambles = scrambles;
	}
	public int getYards_after_contact() {
		return yards_after_contact;
	}
	public void setYards_after_contact(int yards_after_contact) {
		this.yards_after_contact = yards_after_contact;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attempts;
		long temp;
		temp = Double.doubleToLongBits(avg_yards);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + broken_tackles;
		result = prime * result + kneel_downs;
		result = prime * result + longest;
		result = prime * result + longest_touchdown;
		result = prime * result + redzone_attempts;
		result = prime * result + scrambles;
		result = prime * result + tlost;
		result = prime * result + tlost_yards;
		result = prime * result + touchdowns;
		result = prime * result + yards;
		result = prime * result + yards_after_contact;
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
		Rushing other = (Rushing) obj;
		if (attempts != other.attempts)
			return false;
		if (Double.doubleToLongBits(avg_yards) != Double.doubleToLongBits(other.avg_yards))
			return false;
		if (broken_tackles != other.broken_tackles)
			return false;
		if (kneel_downs != other.kneel_downs)
			return false;
		if (longest != other.longest)
			return false;
		if (longest_touchdown != other.longest_touchdown)
			return false;
		if (redzone_attempts != other.redzone_attempts)
			return false;
		if (scrambles != other.scrambles)
			return false;
		if (tlost != other.tlost)
			return false;
		if (tlost_yards != other.tlost_yards)
			return false;
		if (touchdowns != other.touchdowns)
			return false;
		if (yards != other.yards)
			return false;
		if (yards_after_contact != other.yards_after_contact)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rushing [avg_yards=" + avg_yards + ", attempts=" + attempts + ", touchdowns=" + touchdowns + ", yards="
				+ yards + ", longest=" + longest + ", longest_touchdown=" + longest_touchdown + ", redzone_attempts="
				+ redzone_attempts + ", tlost=" + tlost + ", tlost_yards=" + tlost_yards + ", broken_tackles="
				+ broken_tackles + ", kneel_downs=" + kneel_downs + ", scrambles=" + scrambles
				+ ", yards_after_contact=" + yards_after_contact + "]";
	}
}
