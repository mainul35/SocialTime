package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SetAttribute<Users, Eventinvitations> eventinvitationses;
	public static volatile SingularAttribute<Users, String> password;
	public static volatile SingularAttribute<Users, String> name;
	public static volatile SetAttribute<Users, Userunavailability> userunavailabilities;
	public static volatile SetAttribute<Users, Useravailability> useravailabilities;
	public static volatile SingularAttribute<Users, String> location;
	public static volatile SingularAttribute<Users, String> email;
	public static volatile SetAttribute<Users, Event> events;

}

