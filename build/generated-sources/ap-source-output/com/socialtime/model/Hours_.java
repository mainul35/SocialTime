package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hours.class)
public abstract class Hours_ {

	public static volatile SetAttribute<Hours, Userunavailability> userunavailabilitiesForStartTimeId;
	public static volatile SetAttribute<Hours, Event> eventsForEndTime;
	public static volatile SingularAttribute<Hours, Integer> hourId;
	public static volatile SingularAttribute<Hours, String> hour;
	public static volatile SetAttribute<Hours, Useravailability> useravailabilitiesForStartTimeId;
	public static volatile SetAttribute<Hours, Userunavailability> userunavailabilitiesForEndTimeId;
	public static volatile SetAttribute<Hours, Eventvotes> eventvotesesForStartTimeId;
	public static volatile SetAttribute<Hours, Eventvotes> eventvotesesForEndTimeId;
	public static volatile SetAttribute<Hours, Event> eventsForStartTime;
	public static volatile SetAttribute<Hours, Useravailability> useravailabilitiesForEndTimeId;

}

