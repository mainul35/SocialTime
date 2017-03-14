package com.socialtime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event_user")
public class UserEvent {
	@Column(name = "eventId")
	private Long eventId;
	@Column(name = "userId")
	private Long userId;
	private Boolean accepted;
	
	public Boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	
}
