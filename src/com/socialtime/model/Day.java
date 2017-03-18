package com.socialtime.model;
// Generated Mar 16, 2017 11:49:00 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Day generated by hbm2java
 */
@Entity
@Table(name = "day", catalog = "socialtime"
)
public class Day implements java.io.Serializable {

    private int dayId;
    private String dayName;
    private Set<Userunavailability> userunavailabilities = new HashSet<Userunavailability>(0);
    private Set<Event> events = new HashSet<Event>(0);
    private Set<Useravailability> useravailabilities = new HashSet<Useravailability>(0);

    public Day() {
    }

    public Day(int dayId, String dayName) {
        this.dayId = dayId;
        this.dayName = dayName;
    }

    public Day(int dayId, String dayName, Set<Userunavailability> userunavailabilities, Set<Event> events, Set<Useravailability> useravailabilities) {
        this.dayId = dayId;
        this.dayName = dayName;
        this.userunavailabilities = userunavailabilities;
        this.events = events;
        this.useravailabilities = useravailabilities;
    }

    @Id
    @Column(name = "dayId", unique = true, nullable = false)
    public int getDayId() {
        return this.dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    @Column(name = "dayName", nullable = false, length = 20)
    public String getDayName() {
        return this.dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "day")
    public Set<Userunavailability> getUserunavailabilities() {
        return this.userunavailabilities;
    }

    public void setUserunavailabilities(Set<Userunavailability> userunavailabilities) {
        this.userunavailabilities = userunavailabilities;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "day")
    public Set<Event> getEvents() {
        return this.events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "day")
    public Set<Useravailability> getUseravailabilities() {
        return this.useravailabilities;
    }

    public void setUseravailabilities(Set<Useravailability> useravailabilities) {
        this.useravailabilities = useravailabilities;
    }

}