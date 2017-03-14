
import com.socialtime.model.AvailableTimeSlot;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mainul35
 */
public class Main {
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public static void main(String[] args) {
		SessionFactory sf = getSessionFactory();
		Session session = null;
		Transaction transaction = null;
		try {
			session = sf.openSession();
			transaction = session.beginTransaction();
			AvailableTimeSlot ats = new AvailableTimeSlot();
			ats.setStartTime(10);
			ats.setEndTime(14);
			session.save(ats);
			session.flush();
			transaction.commit();
			List<AvailableTimeSlot> atses = session.createQuery("from AvailableTimeSlot").list();
			for (AvailableTimeSlot atse : atses) {
				System.err.println(atse.getStartTime() + ", " + atse.getEndTime());
			}
		} catch (Exception e) {
		}
	}
}
