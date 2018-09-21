package com.revature.dto;

public class Statistics {
	private int games_played;
	private int games_started;
	private Kickoffs kickoffs;
	private FieldGoals field_goals;
	private ExtraPoints extra_points;
	private Defense defense;
	private Rushing	rushing;
	private Passing passing;
	private Penalties penalties;
	private Receiving receiving;
	public Statistics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statistics(int games_played, int games_started, Kickoffs kickoffs, FieldGoals field_goals,
			ExtraPoints extra_points, Defense defense, Rushing rushing, Passing passing, Penalties penalties,
			Receiving receiving) {
		super();
		this.games_played = games_played;
		this.games_started = games_started;
		this.kickoffs = kickoffs;
		this.field_goals = field_goals;
		this.extra_points = extra_points;
		this.defense = defense;
		this.rushing = rushing;
		this.passing = passing;
		this.penalties = penalties;
		this.receiving = receiving;
	}
	public int getGames_played() {
		return games_played;
	}
	public void setGames_played(int games_played) {
		this.games_played = games_played;
	}
	public int getGames_started() {
		return games_started;
	}
	public void setGames_started(int games_started) {
		this.games_started = games_started;
	}
	public Kickoffs getKickoffs() {
		return kickoffs;
	}
	public void setKickoffs(Kickoffs kickoffs) {
		this.kickoffs = kickoffs;
	}
	public FieldGoals getField_goals() {
		return field_goals;
	}
	public void setField_goals(FieldGoals field_goals) {
		this.field_goals = field_goals;
	}
	public ExtraPoints getExtra_points() {
		return extra_points;
	}
	public void setExtra_points(ExtraPoints extra_points) {
		this.extra_points = extra_points;
	}
	public Defense getDefense() {
		return defense;
	}
	public void setDefense(Defense defense) {
		this.defense = defense;
	}
	public Rushing getRushing() {
		return rushing;
	}
	public void setRushing(Rushing rushing) {
		this.rushing = rushing;
	}
	public Passing getPassing() {
		return passing;
	}
	public void setPassing(Passing passing) {
		this.passing = passing;
	}
	public Penalties getPenalties() {
		return penalties;
	}
	public void setPenalties(Penalties penalties) {
		this.penalties = penalties;
	}
	public Receiving getReceiving() {
		return receiving;
	}
	public void setReceiving(Receiving receiving) {
		this.receiving = receiving;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defense == null) ? 0 : defense.hashCode());
		result = prime * result + ((extra_points == null) ? 0 : extra_points.hashCode());
		result = prime * result + ((field_goals == null) ? 0 : field_goals.hashCode());
		result = prime * result + games_played;
		result = prime * result + games_started;
		result = prime * result + ((kickoffs == null) ? 0 : kickoffs.hashCode());
		result = prime * result + ((passing == null) ? 0 : passing.hashCode());
		result = prime * result + ((penalties == null) ? 0 : penalties.hashCode());
		result = prime * result + ((receiving == null) ? 0 : receiving.hashCode());
		result = prime * result + ((rushing == null) ? 0 : rushing.hashCode());
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
		Statistics other = (Statistics) obj;
		if (defense == null) {
			if (other.defense != null)
				return false;
		} else if (!defense.equals(other.defense))
			return false;
		if (extra_points == null) {
			if (other.extra_points != null)
				return false;
		} else if (!extra_points.equals(other.extra_points))
			return false;
		if (field_goals == null) {
			if (other.field_goals != null)
				return false;
		} else if (!field_goals.equals(other.field_goals))
			return false;
		if (games_played != other.games_played)
			return false;
		if (games_started != other.games_started)
			return false;
		if (kickoffs == null) {
			if (other.kickoffs != null)
				return false;
		} else if (!kickoffs.equals(other.kickoffs))
			return false;
		if (passing == null) {
			if (other.passing != null)
				return false;
		} else if (!passing.equals(other.passing))
			return false;
		if (penalties == null) {
			if (other.penalties != null)
				return false;
		} else if (!penalties.equals(other.penalties))
			return false;
		if (receiving == null) {
			if (other.receiving != null)
				return false;
		} else if (!receiving.equals(other.receiving))
			return false;
		if (rushing == null) {
			if (other.rushing != null)
				return false;
		} else if (!rushing.equals(other.rushing))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Statistics [games_played=" + games_played + ", games_started=" + games_started + ", kickoffs="
				+ kickoffs + ", field_goals=" + field_goals + ", extra_points=" + extra_points + ", defense=" + defense
				+ ", rushing=" + rushing + ", passing=" + passing + ", penalties=" + penalties + ", receiving="
				+ receiving + "]";
	}
}
