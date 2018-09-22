package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.dto.Conferences;
import com.revature.dto.Division;
import com.revature.dto.Game;
import com.revature.dto.GameStats;
import com.revature.dto.Player;
import com.revature.dto.Roster;
import com.revature.dto.Schedule;
import com.revature.dto.Season;
import com.revature.dto.SeasonStandings;
import com.revature.dto.TeamRank;
import com.revature.dto.Week;
import com.revature.services.SeasonService;
@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("season")
@CrossOrigin(origins = "http://localhost:3000")
public class SeasonController extends Thread{
	static String key = "mzgx958n3fyxn6nvpg82r5jb";
	@Autowired
	private SeasonService us;
	@GetMapping
	public Season getSeason() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
	    ("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=" + key, Season.class);
		System.out.println("received id field: " + season.getBody());
		
		return season.getBody();
	}
	@GetMapping ("week/{weekNumber}")
	public List<Game> getGames(@PathVariable String weekNumber) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
				("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=" + key, Season.class);
		System.out.println("received id field: " + season.getBody());
		List<Week> weeks = season.getBody().getWeeks();
		for (Week w: weeks) {
			if (w.getTitle().equals(weekNumber)) {
				return w.getGames();
			}
		}
				
		return null;
	}
	@GetMapping("{teamAlias}/{weekNumber}/schedule")
	public Schedule getTeamScheduleByWeek(@PathVariable String teamAlias, @PathVariable String weekNumber) {
		Game game = new Game();
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
		("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=" + key, Season.class);
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
		String url = "https://api.sportradar.us/nfl/official/trial/v5/en/games/" + game.getId() + "/statistics.json?api_key=" + key;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    ResponseEntity<GameStats> gameStats = rt.getForEntity
				(url, GameStats.class);
	    Schedule schedule = new Schedule(game, gameStats.getBody());
		return schedule;
	}
	@GetMapping ("standings/{conference}/{alias}")
	public List<TeamRank> getDivsions(@PathVariable String conference, @PathVariable String alias){
		RestTemplate rt = new RestTemplate();
		String url = "https://api.sportradar.us/nfl/official/trial/v5/en/seasons/2018/standings.json?api_key=" + key;
		ResponseEntity<SeasonStandings> seasonStand = rt.getForEntity
				(url, SeasonStandings.class);
		System.out.println(seasonStand.getBody());
		List<Conferences> confs = seasonStand.getBody().getConferences();
		for (Conferences c: confs) {
			if(c.getName().toUpperCase().equals(conference.toUpperCase())) {
				List<Division> divs = c.getDivisions();
				for (Division d: divs) {
					if (d.getAlias().toUpperCase().equals(alias.toUpperCase())) {
						return d.getTeamRank();
					}
				}
			}
		}
		return null;
	}
	
	
	@GetMapping("{teamAlias}/{weekNumber}/roster")
	public List<Player> getRosterByWeek(@PathVariable String teamAlias, @PathVariable String weekNumber) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Season> season = rt.getForEntity
		("https://api.sportradar.us/nfl/official/trial/v5/en/games/2018/REG/schedule.json?api_key=" + key, Season.class);
		System.out.println("received id field: " + season.getBody());
		List<Week> weeks = season.getBody().getWeeks();
		for (Week w: weeks) {
			if (w.getTitle().equals(weekNumber)) {
				List<Game> games = w.getGames();
				for (Game g : games) {
					if (g.getHome().getAlias().equals(teamAlias) || g.getAway().getAlias().equals(teamAlias)) {
						String url = "https://api.sportradar.us/nfl/official/trial/v5/en/games/"+ g.getId()+"/roster.json?api_key=" + key;
						System.out.println(url);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
						RestTemplate restTemplate = new RestTemplate();
						ResponseEntity<Roster> roster = restTemplate.getForEntity
								(url, Roster.class);
						List<Player> pl = (roster.getBody().getHome() == null) ? roster.getBody().getAway().getPlayers() : 
							roster.getBody().getHome().getPlayers();
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
