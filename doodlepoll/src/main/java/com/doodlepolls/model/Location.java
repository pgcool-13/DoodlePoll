package com.doodlepolls.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5096562736141768360L;

	private String name;
	
	private String address;
	
	private String countryCode;
	
	private String locationId;
}
