package com.revature.dto;

public class TeamRank {
	private String id;
	private String name;
	private int wins;
	private int losses;
	private int ties;
	public TeamRank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamRank(String id, String name, int wins, int losses, int ties) {
		super();
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}
	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	/**
	 * @return the ties
	 */
	public int getTies() {
		return ties;
	}
	/**
	 * @param ties the ties to set
	 */
	public void setTies(int ties) {
		this.ties = ties;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + losses;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ties;
		result = prime * result + wins;
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
		TeamRank other = (TeamRank) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (losses != other.losses)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ties != other.ties)
			return false;
		if (wins != other.wins)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TeamRank [id=" + id + ", name=" + name + ", wins=" + wins + ", losses=" + losses + ", ties=" + ties
				+ "]";
	}
	
}
