package com.doodlepoll.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class PollParticipant implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 671512248135467375L;

	private int id;
	
	private String name;
	
	private int[] preferences;
}
