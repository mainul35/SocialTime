package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Useravailability.class)
public abstract class Useravailability_ {

	public static volatile SingularAttribute<Useravailability, Hours> hoursByEndTimeId;
	public static volatile SingularAttribute<Useravailability, Hours> hoursByStartTimeId;
	public static volatile SingularAttribute<Useravailability, Integer> slotId;
	public static volatile SingularAttribute<Useravailability, Day> day;
	public static volatile SingularAttribute<Useravailability, Users> users;

}

