package com.project.Home.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Game {
	private int id;
	private int number;
	private String scheduled;
	private List<Team> opponents;
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(int id, int number, String scheduled, List<Team> opponents) {
		super();
		this.id = id;
		this.number = number;
		this.scheduled = scheduled;
		this.opponents = opponents;
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
	 * @return the opponents
	 */
	public List<Team> getOpponents() {
		return opponents;
	}
	/**
	 * @param opponents the opponents to set
	 */
	public void setOpponents(List<Team> opponents) {
		this.opponents = opponents;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result + ((opponents == null) ? 0 : opponents.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
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
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (opponents == null) {
			if (other.opponents != null)
				return false;
		} else if (!opponents.equals(other.opponents))
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Game [id=" + id + ", number=" + number + ", scheduled=" + scheduled + ", opponents=" + opponents + "]";
	}
	
}
