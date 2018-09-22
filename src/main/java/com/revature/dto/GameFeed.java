package com.revature.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameFeed {
	private String id;
	private String scheduled;
	private String clock;
	private String quarter;
	@JsonProperty("summary")
	private GameSummary summary;
	private List<Period> periods;
	public GameFeed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameFeed(String id, String scheduled, String clock, String quarter, GameSummary summary,
			List<Period> periods) {
		super();
		this.id = id;
		this.scheduled = scheduled;
		this.clock = clock;
		this.quarter = quarter;
		this.summary = summary;
		this.periods = periods;
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
	 * @return the clock
	 */
	public String getClock() {
		return clock;
	}
	/**
	 * @param clock the clock to set
	 */
	public void setClock(String clock) {
		this.clock = clock;
	}
	/**
	 * @return the quarter
	 */
	public String getQuarter() {
		return quarter;
	}
	/**
	 * @param quarter the quarter to set
	 */
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	/**
	 * @return the summary
	 */
	public GameSummary getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(GameSummary summary) {
		this.summary = summary;
	}
	/**
	 * @return the periods
	 */
	public List<Period> getPeriods() {
		return periods;
	}
	/**
	 * @param periods the periods to set
	 */
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((periods == null) ? 0 : periods.hashCode());
		result = prime * result + ((quarter == null) ? 0 : quarter.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		GameFeed other = (GameFeed) obj;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (periods == null) {
			if (other.periods != null)
				return false;
		} else if (!periods.equals(other.periods))
			return false;
		if (quarter == null) {
			if (other.quarter != null)
				return false;
		} else if (!quarter.equals(other.quarter))
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameFeed [id=" + id + ", scheduled=" + scheduled + ", clock=" + clock + ", quarter=" + quarter
				+ ", summary=" + summary + ", periods=" + periods + "]";
	}
	
	
}
