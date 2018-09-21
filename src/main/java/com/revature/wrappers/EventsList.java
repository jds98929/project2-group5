package com.revature.wrappers;

import java.util.List;

import com.revature.dto.Events;

public class EventsList {
	private List<Events> events;

	public EventsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventsList(List<Events> events) {
		super();
		this.events = events;
	}

	/**
	 * @return the events
	 */
	public List<Events> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Events> events) {
		this.events = events;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((events == null) ? 0 : events.hashCode());
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
		EventsList other = (EventsList) obj;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (!events.equals(other.events))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EventsList [events=" + events + "]";
	}
	
	
}
