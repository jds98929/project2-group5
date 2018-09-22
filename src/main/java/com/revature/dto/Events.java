package com.revature.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Events {
	private String id;
	private String type;
	private String description;
	@JsonProperty("end_situation")
	private EndOfPlay end;
	@JsonProperty("play_type")
	private String playType;
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Events(String id, String type, String description, EndOfPlay end, String playType) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.end = end;
		this.playType = playType;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the end
	 */
	public EndOfPlay getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(EndOfPlay end) {
		this.end = end;
	}
	/**
	 * @return the playType
	 */
	public String getPlayType() {
		return playType;
	}
	/**
	 * @param playType the playType to set
	 */
	public void setPlayType(String playType) {
		this.playType = playType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((playType == null) ? 0 : playType.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Events other = (Events) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (playType == null) {
			if (other.playType != null)
				return false;
		} else if (!playType.equals(other.playType))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Events [id=" + id + ", type=" + type + ", description=" + description + ", end=" + end + ", playType="
				+ playType + "]";
	}
	
}
