/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @Column(name = "eventId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventID;
    private String name;
    private String location;
    private String description;
    private Integer StartTime;
    private Integer EndTime;
    @ManyToMany(targetEntity = User.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "EVENT_USER", joinColumns = {@JoinColumn(name = "")})
    private Set<User> invitedAttendees;
    private Integer minimumNumberOfAttendees;
    private Integer minimumThresholders;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the StartTime
     */
    public Integer getStartTime() {
        return StartTime;
    }

    /**
     * @param StartTime the StartTime to set
     */
    public void setStartTime(Integer StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * @return the EndTime
     */
    public Integer getEndTime() {
        return EndTime;
    }

    /**
     * @param EndTime the EndTime to set
     */
    public void setEndTime(Integer EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * @return the eventID
     */
    public Long getEventID() {
        return eventID;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    /**
     * @return the invitedAttendees
     */
    public Set<User> getInvitedAttendees() {
        return invitedAttendees;
    }

    /**
     * @param invitedAttendees the invitedAttendees to set
     */
    public void setInvitedAttendees(Set<User> invitedAttendees) {
        this.invitedAttendees = invitedAttendees;
    }

    /**
     * @return the minimumNumberOfAttendees
     */
    public Integer getMinimumNumberOfAttendees() {
        return minimumNumberOfAttendees;
    }

    /**
     * @param minimumNumberOfAttendees the minimumNumberOfAttendees to set
     */
    public void setMinimumNumberOfAttendees(Integer minimumNumberOfAttendees) {
        this.minimumNumberOfAttendees = minimumNumberOfAttendees;
    }

    /**
     * @return the minimumThresholders
     */
    public Integer getMinimumThresholders() {
        return minimumThresholders;
    }

    /**
     * @param minimumThresholders the minimumThresholders to set
     */
    public void setMinimumThresholders(Integer minimumThresholders) {
        this.minimumThresholders = minimumThresholders;
    }

    
}
