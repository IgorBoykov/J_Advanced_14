package Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistry  = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory sFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = sFactory.openSession();

		Transaction transaction = session.beginTransaction();
		
		
		Cart c = new Cart(10, "A");
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(10));
		itemList.add(new Item(15));
		itemList.add(new Item(7));
		itemList.add(new Item(12));
		
		c.setItems(new HashSet<>(itemList));
		
		session.persist(c);
		
		transaction.commit();
		session.close();
	}
}
