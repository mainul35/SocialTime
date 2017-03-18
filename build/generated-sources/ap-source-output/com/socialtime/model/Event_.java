package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SetAttribute<Event, Eventinvitations> eventinvitationses;
	public static volatile SingularAttribute<Event, Integer> eventId;
	public static volatile SingularAttribute<Event, Integer> minTresholders;
	public static volatile SingularAttribute<Event, Hours> hoursByStartTime;
	public static volatile SingularAttribute<Event, String> eventLocation;
	public static volatile SingularAttribute<Event, Integer> minAttendees;
	public static volatile SetAttribute<Event, Eventvotes> eventvoteses;
	public static volatile SingularAttribute<Event, String> eventName;
	public static volatile SingularAttribute<Event, Hours> hoursByEndTime;
	public static volatile SingularAttribute<Event, Day> day;
	public static volatile SingularAttribute<Event, Users> users;

}

