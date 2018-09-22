package com.revature.dto;

public class Passing {
	private int attempts;
	private int completions;
	private double cmp_pct;
	private int yards;
	private double avg_yards;
	private int sacks;
	private int sack_yards;
	private int touchdowns;
	private int longest;
	private int interceptions;
	private double rating;
	private int longest_touchdown;
	private int air_yards;
	private int redzone_attempts;
	private int gross_yards;
	private int throw_aways;
	private int defended_passes;
	private int dropped_passes;
	private int spikes;
	private int blitzes;
	private int hurries;
	private int knockdowns;
	private int pocket_time;
	private int avg_pocket_time;
	private int net_yards;
	public Passing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passing(int attempts, int completions, double cmp_pct, int yards, double avg_yards, int sacks,
			int sack_yards, int touchdowns, int longest, int interceptions, double rating, int longest_touchdown,
			int air_yards, int redzone_attempts, int gross_yards, int throw_aways, int defended_passes,
			int dropped_passes, int spikes, int blitzes, int hurries, int knockdowns, int pocket_time,
			int avg_pocket_time, int net_yards) {
		super();
		this.attempts = attempts;
		this.completions = completions;
		this.cmp_pct = cmp_pct;
		this.yards = yards;
		this.avg_yards = avg_yards;
		this.sacks = sacks;
		this.sack_yards = sack_yards;
		this.touchdowns = touchdowns;
		this.longest = longest;
		this.interceptions = interceptions;
		this.rating = rating;
		this.longest_touchdown = longest_touchdown;
		this.air_yards = air_yards;
		this.redzone_attempts = redzone_attempts;
		this.gross_yards = gross_yards;
		this.throw_aways = throw_aways;
		this.defended_passes = defended_passes;
		this.dropped_passes = dropped_passes;
		this.spikes = spikes;
		this.blitzes = blitzes;
		this.hurries = hurries;
		this.knockdowns = knockdowns;
		this.pocket_time = pocket_time;
		this.avg_pocket_time = avg_pocket_time;
		this.net_yards = net_yards;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getCompletions() {
		return completions;
	}
	public void setCompletions(int completions) {
		this.completions = completions;
	}
	public double getCmp_pct() {
		return cmp_pct;
	}
	public void setCmp_pct(double cmp_pct) {
		this.cmp_pct = cmp_pct;
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
	public int getSacks() {
		return sacks;
	}
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	public int getSack_yards() {
		return sack_yards;
	}
	public void setSack_yards(int sack_yards) {
		this.sack_yards = sack_yards;
	}
	public int getTouchdowns() {
		return touchdowns;
	}
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	public int getLongest() {
		return longest;
	}
	public void setLongest(int longest) {
		this.longest = longest;
	}
	public int getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getLongest_touchdown() {
		return longest_touchdown;
	}
	public void setLongest_touchdown(int longest_touchdown) {
		this.longest_touchdown = longest_touchdown;
	}
	public int getAir_yards() {
		return air_yards;
	}
	public void setAir_yards(int air_yards) {
		this.air_yards = air_yards;
	}
	public int getRedzone_attempts() {
		return redzone_attempts;
	}
	public void setRedzone_attempts(int redzone_attempts) {
		this.redzone_attempts = redzone_attempts;
	}
	public int getGross_yards() {
		return gross_yards;
	}
	public void setGross_yards(int gross_yards) {
		this.gross_yards = gross_yards;
	}
	public int getThrow_aways() {
		return throw_aways;
	}
	public void setThrow_aways(int throw_aways) {
		this.throw_aways = throw_aways;
	}
	public int getDefended_passes() {
		return defended_passes;
	}
	public void setDefended_passes(int defended_passes) {
		this.defended_passes = defended_passes;
	}
	public int getDropped_passes() {
		return dropped_passes;
	}
	public void setDropped_passes(int dropped_passes) {
		this.dropped_passes = dropped_passes;
	}
	public int getSpikes() {
		return spikes;
	}
	public void setSpikes(int spikes) {
		this.spikes = spikes;
	}
	public int getBlitzes() {
		return blitzes;
	}
	public void setBlitzes(int blitzes) {
		this.blitzes = blitzes;
	}
	public int getHurries() {
		return hurries;
	}
	public void setHurries(int hurries) {
		this.hurries = hurries;
	}
	public int getKnockdowns() {
		return knockdowns;
	}
	public void setKnockdowns(int knockdowns) {
		this.knockdowns = knockdowns;
	}
	public int getPocket_time() {
		return pocket_time;
	}
	public void setPocket_time(int pocket_time) {
		this.pocket_time = pocket_time;
	}
	public int getAvg_pocket_time() {
		return avg_pocket_time;
	}
	public void setAvg_pocket_time(int avg_pocket_time) {
		this.avg_pocket_time = avg_pocket_time;
	}
	public int getNet_yards() {
		return net_yards;
	}
	public void setNet_yards(int net_yards) {
		this.net_yards = net_yards;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + air_yards;
		result = prime * result + attempts;
		result = prime * result + avg_pocket_time;
		long temp;
		temp = Double.doubleToLongBits(avg_yards);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + blitzes;
		temp = Double.doubleToLongBits(cmp_pct);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + completions;
		result = prime * result + defended_passes;
		result = prime * result + dropped_passes;
		result = prime * result + gross_yards;
		result = prime * result + hurries;
		result = prime * result + interceptions;
		result = prime * result + knockdowns;
		result = prime * result + longest;
		result = prime * result + longest_touchdown;
		result = prime * result + net_yards;
		result = prime * result + pocket_time;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + redzone_attempts;
		result = prime * result + sack_yards;
		result = prime * result + sacks;
		result = prime * result + spikes;
		result = prime * result + throw_aways;
		result = prime * result + touchdowns;
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
		Passing other = (Passing) obj;
		if (air_yards != other.air_yards)
			return false;
		if (attempts != other.attempts)
			return false;
		if (avg_pocket_time != other.avg_pocket_time)
			return false;
		if (Double.doubleToLongBits(avg_yards) != Double.doubleToLongBits(other.avg_yards))
			return false;
		if (blitzes != other.blitzes)
			return false;
		if (Double.doubleToLongBits(cmp_pct) != Double.doubleToLongBits(other.cmp_pct))
			return false;
		if (completions != other.completions)
			return false;
		if (defended_passes != other.defended_passes)
			return false;
		if (dropped_passes != other.dropped_passes)
			return false;
		if (gross_yards != other.gross_yards)
			return false;
		if (hurries != other.hurries)
			return false;
		if (interceptions != other.interceptions)
			return false;
		if (knockdowns != other.knockdowns)
			return false;
		if (longest != other.longest)
			return false;
		if (longest_touchdown != other.longest_touchdown)
			return false;
		if (net_yards != other.net_yards)
			return false;
		if (pocket_time != other.pocket_time)
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (redzone_attempts != other.redzone_attempts)
			return false;
		if (sack_yards != other.sack_yards)
			return false;
		if (sacks != other.sacks)
			return false;
		if (spikes != other.spikes)
			return false;
		if (throw_aways != other.throw_aways)
			return false;
		if (touchdowns != other.touchdowns)
			return false;
		if (yards != other.yards)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Passing [attempts=" + attempts + ", completions=" + completions + ", cmp_pct=" + cmp_pct + ", yards="
				+ yards + ", avg_yards=" + avg_yards + ", sacks=" + sacks + ", sack_yards=" + sack_yards
				+ ", touchdowns=" + touchdowns + ", longest=" + longest + ", interceptions=" + interceptions
				+ ", rating=" + rating + ", longest_touchdown=" + longest_touchdown + ", air_yards=" + air_yards
				+ ", redzone_attempts=" + redzone_attempts + ", gross_yards=" + gross_yards + ", throw_aways="
				+ throw_aways + ", defended_passes=" + defended_passes + ", dropped_passes=" + dropped_passes
				+ ", spikes=" + spikes + ", blitzes=" + blitzes + ", hurries=" + hurries + ", knockdowns=" + knockdowns
				+ ", pocket_time=" + pocket_time + ", avg_pocket_time=" + avg_pocket_time + ", net_yards=" + net_yards
				+ "]";
	}
}
