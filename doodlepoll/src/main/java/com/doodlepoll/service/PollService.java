package com.doodlepoll.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.doodlepoll.model.Poll;
import com.doodlepoll.repository.PollRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PollService {

	Logger log = LoggerFactory.getLogger(PollService.class);
	
	private final PollRepository pollRepository;

	public List<Poll> getPolls() {
		log.info("Service: Inside getPools()");
		return this.pollRepository.findAll();
	}

	public List<Poll> getPollsByCreator(String creatorEmail){
		log.info("Inside PollService: getPollsByCreator()");
		return this.pollRepository.getPollsByCreator(creatorEmail);
	}

	public List<Poll> getPollsByTitle(String title) {
		log.info("Inside PollService: getPollsByTitle()");
		return this.pollRepository.findByTitle(title);
	}

	public List<Poll> getPollsAfterDate(Date date) {
		log.info("Inside PollService: getPollsAfterDate()");
		return this.pollRepository.findByInitiatedAfter(date);
	}

	@PostConstruct
	public void readJsonFileAndSave() throws JsonParseException, JsonMappingException, IOException {
		log.info("Inside PollService: readJsonFileAndSave()");
		final ObjectMapper objectMapper = new ObjectMapper();
		List<Poll> pollList = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("polls.json"), new TypeReference<List<Poll>>(){});
		this.pollRepository.deleteAll();
		this.pollRepository.saveAll(pollList);
		log.info("After saving json file data in database");

	}

}
