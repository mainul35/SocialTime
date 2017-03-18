package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Userunavailability.class)
public abstract class Userunavailability_ {

	public static volatile SingularAttribute<Userunavailability, Hours> hoursByEndTimeId;
	public static volatile SingularAttribute<Userunavailability, Hours> hoursByStartTimeId;
	public static volatile SingularAttribute<Userunavailability, Integer> slotId;
	public static volatile SingularAttribute<Userunavailability, Day> day;
	public static volatile SingularAttribute<Userunavailability, Users> users;

}

