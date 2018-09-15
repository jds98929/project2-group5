package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.dto.Game;
import com.revature.dto.Player;
import com.revature.dto.Roster;
import com.revature.dto.Season;
import com.revature.dto.Week;
import com.revature.services.SeasonService;
@RestController
@RequestMapping("season")
public class SeasonController {
	@Autowired
	private SeasonService us;
	@GetMapping
	public List<Game> getSeason() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
				("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=2czvbmnr5ghwva9y8hbwh92w", Season.class);
		List<Week> weeks = season.getBody().getWeeks();
		for(Week w : weeks) {
			List<Game> games = w.getGames();
			System.out.println(games);
			if(w.getTitle().equals("1")) {
				return w.getGames();
			}
		}
	return null;	
	}

	@GetMapping("{teamAlias}/{weekNumber}/roster")
	public List<Player> getTeamScheduleByWeek(@PathVariable String teamAlias, @PathVariable String weekNumber) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
				("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=2czvbmnr5ghwva9y8hbwh92w", Season.class);
		System.out.println("received id field: " + season.getBody());
		List<Week> weeks = season.getBody().getWeeks();
		for (Week w: weeks) {
			if (w.getTitle().equals(weekNumber)) {
				List<Game> games = w.getGames();
				for (Game g : games) {
					if (g.getHome().getAlias().equals(teamAlias) || g.getAway().getAlias().equals(teamAlias)) {
						String url = "https://api.sportradar.us/nfl/official/trial/v5/en/games/"+ g.getId()+"/roster.json?api_key=2czvbmnr5ghwva9y8hbwh92w";
						System.out.println(url);
						try {
						RestTemplate restTemplate = new RestTemplate();
						ResponseEntity<Roster> roster = restTemplate.getForEntity
								(url, Roster.class);
						List<Player> pl = roster.getBody().getHome().getPlayers();
				        System.out.println("Result : status ("+ roster.getStatusCode() + ") has body: " + roster.hasBody());						
				        return pl;
						}catch(Exception e) {
							System.out.println("Exception : "+ e);
						}
					}
				}
			}
		}
		return null;
	}
}
