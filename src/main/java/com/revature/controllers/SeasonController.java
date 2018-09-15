package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.dto.Game;
import com.revature.dto.Season;
import com.revature.dto.Week;

@RestController
@RequestMapping("season")
public class SeasonController {
	
	@GetMapping
	public Season getSeason() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
				("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/03/schedule.json?api_key=2czvbmnr5ghwva9y8hbwh92w", Season.class);
		System.out.println("received id field: " + season.getBody());
		
		return season.getBody();
	}
	
	@GetMapping("{teamAlias}/{weekNumber}/schedule")
	public Object getTeamScheduleByWeek(@PathVariable String teamAlias, @PathVariable String weekNumber) {
		Game game = new Game();
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
				("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=2czvbmnr5ghwva9y8hbwh92w", Season.class);
		System.out.println("received id field: " + season.getBody());
		List<Week> weeks = season.getBody().getWeeks();
		for (Week w: weeks) {
			if (w.getTitle().equals(weekNumber)) {
				//System.out.println("WEEK");
				List<Game> games = w.getGames();
				for (Game g : games) {
					if (g.getHome().getAlias().equals(teamAlias) || g.getAway().getAlias().equals(teamAlias)) {
						game = g;
					}
				}
			}
		}
		String url = "https://api.sportradar.us/nfl/official/trial/v5/en/games/" + game.getId() + "/statistics.json?api_key=2czvbmnr5ghwva9y8hbwh92w";
	    ResponseEntity<Object> gameStats = rt.getForEntity
				(url, Object.class);

		return gameStats; 
	}
}
