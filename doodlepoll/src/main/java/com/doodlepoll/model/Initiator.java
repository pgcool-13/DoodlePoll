package com.doodlepoll.model;

import java.io.Serializable;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Initiator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5090721923639176625L;

	private String name;

	@NotNull
	private String email;

	private String notify;
	
	@Column(name="time_zone")
	private String timeZone;

}
