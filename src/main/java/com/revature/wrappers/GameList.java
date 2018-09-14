package com.revature.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.revature.dto.Game;

public class GameList {
	private List<Game> games;
	
	public GameList() {
		games = new ArrayList<>();
	}

	public GameList(List<Game> games) {
		super();
		this.games = games;
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
		GameList other = (GameList) obj;
		if (games == null) {
			if (other.games != null)
				return false;
		} else if (!games.equals(other.games))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameList [games=" + games + "]";
	}
	
}
