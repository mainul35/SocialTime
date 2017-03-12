/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class FeasibleTimeSlot {
    private Event event;
    private Integer lowerTime;
    private Integer upperTime;
    @Id
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
