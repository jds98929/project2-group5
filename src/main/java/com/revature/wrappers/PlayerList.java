package com.revature.wrappers;

import java.util.List;

import com.revature.dto.Player;

public class PlayerList {
	private List<Player> players;

	public PlayerList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerList(List<Player> players) {
		super();
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((players == null) ? 0 : players.hashCode());
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
		PlayerList other = (PlayerList) obj;
		if (players == null) {
			if (other.players != null)
				return false;
		} else if (!players.equals(other.players))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayerList [players=" + players + "]";
	}
	
}
