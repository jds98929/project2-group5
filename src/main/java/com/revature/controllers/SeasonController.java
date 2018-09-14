package com.revature.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.dto.Season;

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
}
