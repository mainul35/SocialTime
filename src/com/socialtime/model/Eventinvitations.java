package com.socialtime.model;
// Generated Mar 16, 2017 11:49:00 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Eventinvitations generated by hbm2java
 */
@Entity
@Table(name = "eventinvitations", catalog = "socialtime"
)
public class Eventinvitations implements java.io.Serializable {

    private int invitationId;
    private Event event;
    private Users users;
    private boolean isAccepted;

    public Eventinvitations() {
    }

    public Eventinvitations(int invitationId, Event event, Users users, boolean isAccepted) {
        this.invitationId = invitationId;
        this.event = event;
        this.users = users;
        this.isAccepted = isAccepted;
    }

    @Id

    @Column(name = "invitationId", unique = true, nullable = false)
    public int getInvitationId() {
        return this.invitationId;
    }

    public void setInvitationId(int invitationId) {
        this.invitationId = invitationId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventId", nullable = false)
    public Event getEvent() {
        return this.event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userEmail", nullable = false)
    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Column(name = "isAccepted", nullable = false)
    public boolean isIsAccepted() {
        return this.isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

}
