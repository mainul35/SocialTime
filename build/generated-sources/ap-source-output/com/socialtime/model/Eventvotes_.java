package com.socialtime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Eventvotes.class)
public abstract class Eventvotes_ {

	public static volatile SingularAttribute<Eventvotes, Hours> hoursByEndTimeId;
	public static volatile SingularAttribute<Eventvotes, Hours> hoursByStartTimeId;
	public static volatile SingularAttribute<Eventvotes, Integer> countVotes;
	public static volatile SingularAttribute<Eventvotes, Integer> poolId;
	public static volatile SingularAttribute<Eventvotes, Event> event;

}

