/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity

@Table(name = "FeasibleTimeSlot")
public class FeasibleTimeSlot {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventId", nullable = false, referencedColumnName = "eventId")
    private Event event;
    private Integer lowerTime;
    private Integer upperTime;
    @Id
    @Column(name = "feasibleTimeSlotId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feasibleTimeSlotId;

    /**
     * @return the lowerTime
     */
    public Integer getLowerTime() {
        return lowerTime;
    }

    /**
     * @param lowerTime the lowerTime to set
     */
    public void setLowerTime(Integer lowerTime) {
        this.lowerTime = lowerTime;
    }

    /**
     * @return the upperTime
     */
    public Integer getUpperTime() {
        return upperTime;
    }

    /**
     * @param upperTime the upperTime to set
     */
    public void setUpperTime(Integer upperTime) {
        this.upperTime = upperTime;
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
     * @return the feasibleTimeSlotId
     */
    public Long getFeasibleTimeSlotId() {
        return feasibleTimeSlotId;
    }

    /**
     * @param feasibleTimeSlotId the feasibleTimeSlotId to set
     */
    public void setFeasibleTimeSlotId(Long feasibleTimeSlotId) {
        this.feasibleTimeSlotId = feasibleTimeSlotId;
    }
    
}
