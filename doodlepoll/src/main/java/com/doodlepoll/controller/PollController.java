package com.doodlepoll.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.doodlepoll.model.Poll;
import com.doodlepoll.service.PollService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@AllArgsConstructor
public class PollController {

	private final PollService pollService;

	@GetMapping("/api/polls/user/{email}")
	public List<Poll> getPollsByCreator(@PathVariable("email") String creatorEmail) {
		return pollService.getPollsByCreator(creatorEmail);

	}

	@GetMapping("/api/polls/title/{title}")
	public List<Poll> getPollsByTitle(@PathVariable("title") String title) {
		return pollService.getPollsByTitle(title);

	}

	@GetMapping("/api/polls/date/{date}")
	public List<Poll> getPollsAfterDate(@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date) {	//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
		return pollService.getPollsAfterDate(date);

	}

	@GetMapping("/api/polls")
	public List<Poll> getPolls(){
		return this.pollService.getPolls();
	}

}