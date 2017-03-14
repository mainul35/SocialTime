/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */

@Entity
@Table(name = "Vote")
public class Vote {
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Event.class, cascade = CascadeType.ALL)
    private Event event;
    @Id
    @Column(name = "voteEventId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voteEventId;
    private Integer startTime;
    private Integer endTime;
    private Integer countVotes;

    /**
     * @return the startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the countVotes
     */
    public Integer getCountVotes() {
        return countVotes;
    }

    /**
     * @param countVotes the countVotes to set
     */
    public void setCountVotes(Integer countVotes) {
        this.countVotes = countVotes;
    }

    /**
     * @return the event
     */
    public Event getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * @return the voteEventId
     */
    public Long getVoteEventId() {
        return voteEventId;
    }

    /**
     * @param voteEventId the voteEventId to set
     */
    public void setVoteEventId(Long voteEventId) {
        this.voteEventId = voteEventId;
    }
    
}
