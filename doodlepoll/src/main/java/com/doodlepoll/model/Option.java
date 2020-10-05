package com.doodlepoll.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
public class Option implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8821761046836796952L;

	private boolean available;

	private String text;

	private Date start;

	private Date end;

	private Date date;

	private Date startDate;

	private Date endDate;

	private Date dateTime;

	private Date startDateTime;

	private Date endDateTime;

	private boolean allDay;

}
