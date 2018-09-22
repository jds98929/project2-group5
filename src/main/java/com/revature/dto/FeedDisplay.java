package com.revature.dto;

import java.util.List;

public class FeedDisplay {
	private String clock;
	private String quarter;
	private String number;
	private int sequence;
	private String id;
	private String description;
	private int down;
	private int yfd;
	private String alias;
	public FeedDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedDisplay(String clock, String quarter, String number, int sequence, String id, String description,
			int down, int yfd, String alias) {
		super();
		this.clock = clock;
		this.quarter = quarter;
		this.number = number;
		this.sequence = sequence;
		this.id = id;
		this.description = description;
		this.down = down;
		this.yfd = yfd;
		this.alias = alias;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the sequence
	 */
	public int getSequence() {
		return sequence;
	}
	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(int sequence) {
		this.sequence = sequence;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the down
	 */
	public int getDown() {
		return down;
	}
	/**
	 * @param down the down to set
	 */
	public void setDown(int down) {
		this.down = down;
	}
	/**
	 * @return the yfd
	 */
	public int getYfd() {
		return yfd;
	}
	/**
	 * @param yfd the yfd to set
	 */
	public void setYfd(int yfd) {
		this.yfd = yfd;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + down;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((quarter == null) ? 0 : quarter.hashCode());
		result = prime * result + sequence;
		result = prime * result + yfd;
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
		FeedDisplay other = (FeedDisplay) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (down != other.down)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (quarter == null) {
			if (other.quarter != null)
				return false;
		} else if (!quarter.equals(other.quarter))
			return false;
		if (sequence != other.sequence)
			return false;
		if (yfd != other.yfd)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FeedDisplay [clock=" + clock + ", quarter=" + quarter + ", number=" + number + ", sequence=" + sequence
				+ ", id=" + id + ", description=" + description + ", down=" + down + ", yfd=" + yfd + ", alias=" + alias
				+ "]";
	}
	
}
