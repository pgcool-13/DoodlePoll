package com.doodlepoll.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
public class Invitees implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6727150480967097957L;

	private String name;
	
	private String email;
}
