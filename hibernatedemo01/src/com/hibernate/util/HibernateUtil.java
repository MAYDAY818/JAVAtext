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
		//��1��
		StandardServiceRegistry registry = 
				new StandardServiceRegistryBuilder()
				.configure()//����hibernate.cfg.xml
				.build();
		//��2��
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			//�ͷ���Դ
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	//��3��
	public static Session openSession() {
		return sessionFactory.openSession();
	}
}
