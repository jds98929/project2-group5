package com.revature.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndOfPlay {
	private String clock;
	private int down;
	private int yfd;
	@JsonProperty("possession")
	private Possession poss;
	public EndOfPlay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EndOfPlay(String clock, int down, int yfd, Possession poss) {
		super();
		this.clock = clock;
		this.down = down;
		this.yfd = yfd;
		this.poss = poss;
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
	 * @return the poss
	 */
	public Possession getPoss() {
		return poss;
	}
	/**
	 * @param poss the poss to set
	 */
	public void setPoss(Possession poss) {
		this.poss = poss;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + down;
		result = prime * result + ((poss == null) ? 0 : poss.hashCode());
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
		EndOfPlay other = (EndOfPlay) obj;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (down != other.down)
			return false;
		if (poss == null) {
			if (other.poss != null)
				return false;
		} else if (!poss.equals(other.poss))
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
		return "EndOfPlay [clock=" + clock + ", down=" + down + ", yfd=" + yfd + ", poss=" + poss + "]";
	}
	
}
