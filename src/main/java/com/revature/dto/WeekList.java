package com.revature.dto;

import java.util.ArrayList;
import java.util.List;

public class WeekList {
	   private List<Week> weeks;
	   
	    public WeekList() {
	        weeks = new ArrayList<>();
	    }

		public WeekList(List<Week> weeks) {
			super();
			this.weeks = weeks;
		}

		public List<Week> getWeeks() {
			return weeks;
		}

		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
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
			WeekList other = (WeekList) obj;
			if (weeks == null) {
				if (other.weeks != null)
					return false;
			} else if (!weeks.equals(other.weeks))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "WeekList [weeks=" + weeks + "]";
		}
	    
}
