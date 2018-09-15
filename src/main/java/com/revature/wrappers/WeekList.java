package com.revature.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.revature.dto.Week;

public class WeekList {
	 private List<Week> weeks;
	 
	    public WeekList() {
	        weeks = new ArrayList<>();
	    }

		public WeekList(List<Week> weeks) {
			super();
			this.weeks = weeks;
		}

		/**
		 * @return the weeks
		 */
		public List<Week> getWeeks() {
			return weeks;
		}

		/**
		 * @param weeks the weeks to set
		 */
		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
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
			WeekList other = (WeekList) obj;
			if (weeks == null) {
				if (other.weeks != null)
					return false;
			} else if (!weeks.equals(other.weeks))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "WeekList [weeks=" + weeks + "]";
		}
	    
}
