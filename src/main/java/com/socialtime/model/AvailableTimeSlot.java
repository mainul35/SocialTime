/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author HP
 */

@Entity
@Table(name = "AvailableTimeSlot")
public class AvailableTimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;
    private Integer startTime;
    private Integer endTime;

    /**
     * @return the slotId
     */
    public Long getSlotId() {
        return slotId;
    }

    /**
     * @param slotId the slotId to set
     */
    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }

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
    
    
}
