package com.revature.wrappers;

import java.util.List;

import com.revature.dto.Period;

public class PeriodList {
	private List<Period> periods;

	public PeriodList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeriodList(List<Period> periods) {
		super();
		this.periods = periods;
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
		result = prime * result + ((periods == null) ? 0 : periods.hashCode());
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
		PeriodList other = (PeriodList) obj;
		if (periods == null) {
			if (other.periods != null)
				return false;
		} else if (!periods.equals(other.periods))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PeriodList [periods=" + periods + "]";
	}
	
	
}
