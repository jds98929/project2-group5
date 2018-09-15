package com.revature.dto;

import java.util.List;

public class TeamStats {
	
	private String name;
	private String market;
	private Summary summary;
	
	public TeamStats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamStats(String name, String market, Summary summary) {
		super();
		this.name = name;
		this.market = market;
		this.summary = summary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public Summary getSummary() {
		return summary;
	}
	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		TeamStats other = (TeamStats) obj;
		if (market == null) {
			if (other.market != null)
				return false;
		} else if (!market.equals(other.market))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TeamStats [name=" + name + ", market=" + market + ", summary=" + summary + "]";
	}
	
	
}
