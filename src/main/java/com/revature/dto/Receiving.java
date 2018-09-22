package com.revature.dto;

public class Receiving {
	private int receptions;
	private int targets;
	private int yards;
	private double avg_yards;
	private int longest;
	private int touchdowns;
	private int longest_touchdown;
	private int yards_after_catch;
	private int redzone_targets;
	private int air_yards;
	private int broken_tackles;
	private int dropped_passes;
	private int catchable_passes;
	private int yards_after_contact;
	public Receiving() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receiving(int receptions, int targets, int yards, double avg_yards, int longest, int touchdowns,
			int longest_touchdown, int yards_after_catch, int redzone_targets, int air_yards, int broken_tackles,
			int dropped_passes, int catchable_passes, int yards_after_contact) {
		super();
		this.receptions = receptions;
		this.targets = targets;
		this.yards = yards;
		this.avg_yards = avg_yards;
		this.longest = longest;
		this.touchdowns = touchdowns;
		this.longest_touchdown = longest_touchdown;
		this.yards_after_catch = yards_after_catch;
		this.redzone_targets = redzone_targets;
		this.air_yards = air_yards;
		this.broken_tackles = broken_tackles;
		this.dropped_passes = dropped_passes;
		this.catchable_passes = catchable_passes;
		this.yards_after_contact = yards_after_contact;
	}
	public int getReceptions() {
		return receptions;
	}
	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}
	public int getTargets() {
		return targets;
	}
	public void setTargets(int targets) {
		this.targets = targets;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public double getAvg_yards() {
		return avg_yards;
	}
	public void setAvg_yards(double avg_yards) {
		this.avg_yards = avg_yards;
	}
	public int getLongest() {
		return longest;
	}
	public void setLongest(int longest) {
		this.longest = longest;
	}
	public int getTouchdowns() {
		return touchdowns;
	}
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	public int getLongest_touchdown() {
		return longest_touchdown;
	}
	public void setLongest_touchdown(int longest_touchdown) {
		this.longest_touchdown = longest_touchdown;
	}
	public int getYards_after_catch() {
		return yards_after_catch;
	}
	public void setYards_after_catch(int yards_after_catch) {
		this.yards_after_catch = yards_after_catch;
	}
	public int getRedzone_targets() {
		return redzone_targets;
	}
	public void setRedzone_targets(int redzone_targets) {
		this.redzone_targets = redzone_targets;
	}
	public int getAir_yards() {
		return air_yards;
	}
	public void setAir_yards(int air_yards) {
		this.air_yards = air_yards;
	}
	public int getBroken_tackles() {
		return broken_tackles;
	}
	public void setBroken_tackles(int broken_tackles) {
		this.broken_tackles = broken_tackles;
	}
	public int getDropped_passes() {
		return dropped_passes;
	}
	public void setDropped_passes(int dropped_passes) {
		this.dropped_passes = dropped_passes;
	}
	public int getCatchable_passes() {
		return catchable_passes;
	}
	public void setCatchable_passes(int catchable_passes) {
		this.catchable_passes = catchable_passes;
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
		result = prime * result + air_yards;
		long temp;
		temp = Double.doubleToLongBits(avg_yards);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + broken_tackles;
		result = prime * result + catchable_passes;
		result = prime * result + dropped_passes;
		result = prime * result + longest;
		result = prime * result + longest_touchdown;
		result = prime * result + receptions;
		result = prime * result + redzone_targets;
		result = prime * result + targets;
		result = prime * result + touchdowns;
		result = prime * result + yards;
		result = prime * result + yards_after_catch;
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
		Receiving other = (Receiving) obj;
		if (air_yards != other.air_yards)
			return false;
		if (Double.doubleToLongBits(avg_yards) != Double.doubleToLongBits(other.avg_yards))
			return false;
		if (broken_tackles != other.broken_tackles)
			return false;
		if (catchable_passes != other.catchable_passes)
			return false;
		if (dropped_passes != other.dropped_passes)
			return false;
		if (longest != other.longest)
			return false;
		if (longest_touchdown != other.longest_touchdown)
			return false;
		if (receptions != other.receptions)
			return false;
		if (redzone_targets != other.redzone_targets)
			return false;
		if (targets != other.targets)
			return false;
		if (touchdowns != other.touchdowns)
			return false;
		if (yards != other.yards)
			return false;
		if (yards_after_catch != other.yards_after_catch)
			return false;
		if (yards_after_contact != other.yards_after_contact)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Receiving [receptions=" + receptions + ", targets=" + targets + ", yards=" + yards + ", avg_yards="
				+ avg_yards + ", longest=" + longest + ", touchdowns=" + touchdowns + ", longest_touchdown="
				+ longest_touchdown + ", yards_after_catch=" + yards_after_catch + ", redzone_targets="
				+ redzone_targets + ", air_yards=" + air_yards + ", broken_tackles=" + broken_tackles
				+ ", dropped_passes=" + dropped_passes + ", catchable_passes=" + catchable_passes
				+ ", yards_after_contact=" + yards_after_contact + "]";
	}
}
