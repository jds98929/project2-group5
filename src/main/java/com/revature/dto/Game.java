package com.revature.dto;

public class Game {
	private String id;
	private int number;
	private String scheduled;
	private Home home;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Game [id=" + id + ", number=" + number + ", scheduled=" + scheduled + ", home=" + home + ", away="
				+ away + ", scoring=" + scoring + ", broadcast=" + broadcast + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((broadcast == null) ? 0 : broadcast.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + number;
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((scoring == null) ? 0 : scoring.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
			return false;
		if (broadcast == null) {
			if (other.broadcast != null)
				return false;
		} else if (!broadcast.equals(other.broadcast))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number != other.number)
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		if (scoring == null) {
			if (other.scoring != null)
				return false;
		} else if (!scoring.equals(other.scoring))
			return false;
		return true;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the scheduled
	 */
	public String getScheduled() {
		return scheduled;
	}
	/**
	 * @param scheduled the scheduled to set
	 */
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	/**
	 * @return the home
	 */
	public Home getHome() {
		return home;
	}
	/**
	 * @param home the home to set
	 */
	public void setHome(Home home) {
		this.home = home;
	}
	/**
	 * @return the away
	 */
	public Away getAway() {
		return away;
	}
	/**
	 * @param away the away to set
	 */
	public void setAway(Away away) {
		this.away = away;
	}
	/**
	 * @return the scoring
	 */
	public Scoring getScoring() {
		return scoring;
	}
	/**
	 * @param scoring the scoring to set
	 */
	public void setScoring(Scoring scoring) {
		this.scoring = scoring;
	}
	/**
	 * @return the broadcast
	 */
	public Broadcast getBroadcast() {
		return broadcast;
	}
	/**
	 * @param broadcast the broadcast to set
	 */
	public void setBroadcast(Broadcast broadcast) {
		this.broadcast = broadcast;
	}
	public Game(String id, int number, String scheduled, Home home, Away away, Scoring scoring, Broadcast broadcast) {
		super();
		this.id = id;
		this.number = number;
		this.scheduled = scheduled;
		this.home = home;
		this.away = away;
		this.scoring = scoring;
		this.broadcast = broadcast;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Away away;
	private Scoring scoring;
	private Broadcast broadcast;
	
}
