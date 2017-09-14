package com.javacodegeeks.enterprise.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.javacodegeeks.enterprise.hibernate.MyInterceptor;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;

	private static SessionFactory buildSessionFactory() {
		
		    Configuration configuration = new Configuration().setInterceptor(new MyInterceptor());
	        configuration.configure();
	        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        return sessionFactory;		
	}
	

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

}