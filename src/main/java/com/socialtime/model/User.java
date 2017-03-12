/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
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
@Table(name = "USER")
public class User {

    private String name;
    private String email;
    private String location;
    private String password;
    private Set<AvailableTimeSlot> availableTimeSlots = new HashSet<AvailableTimeSlot>();
    private Set<UnavailableTimeSlot> unavailableTimeSlots = new HashSet<UnavailableTimeSlot>();
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserID;

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the UserID
     */
    public Long getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    /**
     * @return the availableTimeSlots
     */
    public Set<AvailableTimeSlot> getAvailableTimeSlots() {
        return availableTimeSlots;
    }

    /**
     * @param availableTimeSlots the availableTimeSlots to set
     */
    public void setAvailableTimeSlots(Set<AvailableTimeSlot> availableTimeSlots) {
        this.availableTimeSlots = availableTimeSlots;
    }

    /**
     * @return the unavailableTimeSlots
     */
    public Set<UnavailableTimeSlot> getUnavailableTimeSlots() {
        return unavailableTimeSlots;
    }

    /**
     * @param unavailableTimeSlots the unavailableTimeSlots to set
     */
    public void setUnavailableTimeSlots(Set<UnavailableTimeSlot> unavailableTimeSlots) {
        this.unavailableTimeSlots = unavailableTimeSlots;
    }

}
