package com.sfm.beans;

import java.util.Calendar;
import java.util.List;

public class Meeting {
	private String agenda;
	private String description;
	private List<String> participants;
	private Calendar meetingDate;

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public Calendar getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Calendar meetingDate) {
		this.meetingDate = meetingDate;
	}

	@Override
	public String toString() {
		return "Meeting [agenda=" + agenda + ", description=" + description
				+ ", participants=" + participants + ", meetingDate="
				+ meetingDate + "]";
	}

}
