package com.revature.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Week {
	private int id;
	private int sequence;
	private String title;
	private List<Game> games;
	public Week() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Week(int id, int sequence, String title, List<Game> games) {
		super();
		this.id = id;
		this.sequence = sequence;
		this.title = title;
		this.games = games;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the games
	 */
	public List<Game> getGames() {
		return games;
	}
	/**
	 * @param games the games to set
	 */
	public void setGames(List<Game> games) {
		this.games = games;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((games == null) ? 0 : games.hashCode());
		result = prime * result + id;
		result = prime * result + sequence;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Week other = (Week) obj;
		if (games == null) {
			if (other.games != null)
				return false;
		} else if (!games.equals(other.games))
			return false;
		if (id != other.id)
			return false;
		if (sequence != other.sequence)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Week [id=" + id + ", sequence=" + sequence + ", title=" + title + ", games=" + games + "]";
	}
	
}
