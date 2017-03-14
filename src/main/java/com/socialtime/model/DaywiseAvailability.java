package com.socialtime.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="DaywiseAvailability")
public class DaywiseAvailability {
	@Id
	@Column(name="dayId")
	private Byte dayId;
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = User.class, mappedBy = "availability")
	@JoinTable(name="Day_User", joinColumns = {@JoinColumn(name = "dayId")}, inverseJoinColumns = {@JoinColumn(name = "UserID")})
	private Set<User> users;
	
}
