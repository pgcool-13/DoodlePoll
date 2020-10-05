package com.doodlepolls.service;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.doodlepolls.model.Poll;
import com.doodlepolls.repository.PollRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PollService {

	private final PollRepository pollRepository;

	public List<Poll> getPolls() {
		System.out.println("Service: Inside getPools()");
		return this.pollRepository.findAll();
	}

	public List<Poll> getPollsByCreator(String creatorEmail){

		return this.pollRepository.getPollsByCreator(creatorEmail);
	}

	public List<Poll> getPollsByTitle(String title) {
		return this.pollRepository.findByTitle(title);
	}

	public List<Poll> getPollsAfterDate(Date date) {
		return this.pollRepository.findByInitiatedAfter(date);
	}

	@PostConstruct
	public void readJsonFileAndSave() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Inside Service: readJsonFileAndSave()");
		final ObjectMapper objectMapper = new ObjectMapper();
		List<Poll> pollList = objectMapper.readValue(new File("/Users/admin/Documents/Personal/Doodle/polls.json"), new TypeReference<List<Poll>>(){});

//		pollList.forEach(x -> System.out.println(x.toString()));
		this.pollRepository.deleteAll();
		this.pollRepository.saveAll(pollList);
		System.out.println("After saving");

	}

}
