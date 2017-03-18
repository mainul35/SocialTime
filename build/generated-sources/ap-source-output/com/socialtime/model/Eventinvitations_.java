package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Eventinvitations.class)
public abstract class Eventinvitations_ {

	public static volatile SingularAttribute<Eventinvitations, Boolean> isAccepted;
	public static volatile SingularAttribute<Eventinvitations, Integer> invitationId;
	public static volatile SingularAttribute<Eventinvitations, Event> event;
	public static volatile SingularAttribute<Eventinvitations, Users> users;

}

