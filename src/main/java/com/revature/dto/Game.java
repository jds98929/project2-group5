package com.revature.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Game {
	private String id;
	private int number;
	private String scheduled;
	private Home home;
	private Away away;
	private Scoring scoring;
	//private Broadcast broadcast;
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(String id, int number, String scheduled, Home home, Away away, Scoring scoring) {
		super();
		this.id = id;
		this.number = number;
		this.scheduled = scheduled;
		this.home = home;
		this.away = away;
		this.scoring = scoring;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	public Away getAway() {
		return away;
	}
	public void setAway(Away away) {
		this.away = away;
	}
	public Scoring getScoring() {
		return scoring;
	}
	public void setScoring(Scoring scoring) {
		this.scoring = scoring;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + number;
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((scoring == null) ? 0 : scoring.hashCode());
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
		Game other = (Game) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
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
	@Override
	public String toString() {
		return "Game [id=" + id + ", number=" + number + ", scheduled=" + scheduled + ", home=" + home + ", away="
				+ away + ", scoring=" + scoring + "]";
	}
	
}
