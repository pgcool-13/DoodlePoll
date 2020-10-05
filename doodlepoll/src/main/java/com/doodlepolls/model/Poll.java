package com.doodlepolls.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "poll")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Poll extends BaseEntity{

	@Id @NotNull
	private String id;

	@NotNull
	@Column(name="admin_key")
	private String adminKey;

	@Column(name="latest_change")
	private Date latestChange;

	@NotNull
	private Date initiated;

	@Column(name="participants_count")
	private int participantsCount;

	@Column(name="invitees_count")
	private int inviteesCount;

	private String type;

	@Column(name="time_zone")
	private boolean timeZone;

	@Column(name="row_constraint")
	private int rowConstraint;

	@Column(name="column_constraint")
	private int columnConstraint;

	private boolean hidden;

	@Column(name="preferences_type")
	private String preferencesType;

	private String state;

	private String locale;

	private String title;

	@Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Location location;

	@Column(columnDefinition="VARCHAR(5000)")
	private String description;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private Initiator initiator;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private Option[] options;

	@Column(name="options_hash")
	private String optionsHash;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private PollParticipant[] participants;

	@Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
	private Invitees[] invitees;

	@Column(name="date_text")
	private boolean dateText;

	@Column(name="multi_day")
	private boolean multiDay;

	private String device;

	private String levels;

}
