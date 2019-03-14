package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		//第1步
		StandardServiceRegistry registry = 
				new StandardServiceRegistryBuilder()
				.configure()//加载hibernate.cfg.xml
				.build();
		//第2步
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			//释放资源
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	//第3步
	public static Session openSession() {
		return sessionFactory.openSession();
	}
}
