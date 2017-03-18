package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Day.class)
public abstract class Day_ {

	public static volatile SingularAttribute<Day, String> dayName;
	public static volatile SingularAttribute<Day, Integer> dayId;
	public static volatile SetAttribute<Day, Userunavailability> userunavailabilities;
	public static volatile SetAttribute<Day, Useravailability> useravailabilities;
	public static volatile SetAttribute<Day, Event> events;

}

