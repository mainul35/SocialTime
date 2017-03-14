package com.socialtime.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.socialtime.model.Event;
import com.socialtime.util.SocialTimeSessionFactory;

public class EventDao {
	
	public static Long create(Event e) {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully created " + e.toString());
		return e.getEventID();

	}

	public static List<Event> read() {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Event> events = session.createQuery("FROM event").list();
		session.close();
		System.out.println("Found " + events.size() + " Employees");
		return events;

	}

	public static void update(Event e) {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		Event evt = (Event)session.load(Event.class, e.getEventID());
		evt.setDescription(e.getDescription());
		evt.setEndTime(e.getEndTime());
		evt.setInvitedAttendees(e.getInvitedAttendees());
		evt.setLocation(e.getLocation());
		evt.setMinimumNumberOfAttendees(e.getMinimumNumberOfAttendees());
		evt.setMinimumThresholders(e.getMinimumThresholders());
		evt.setName(e.getName());
		evt.setStartTime(e.getStartTime());
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully updated " + e.toString());

	}

	public static void delete(Long id) {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		Event e = findByID(id);
		session.delete(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted " + e.toString());

	}

	public static Event findByID(Long id) {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		Event evt = (Event)session.load(Event.class, id);
		session.close();
		return evt;
	}
	
	public static void deleteAll() {
		Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("DELETE FROM Event ");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted all employees.");

	}
}
