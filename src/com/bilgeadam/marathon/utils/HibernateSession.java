package com.bilgeadam.marathon.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bilgeadam.marathon.entity.Account;
import com.bilgeadam.marathon.entity.AccountType;
import com.bilgeadam.marathon.entity.Branch;
import com.bilgeadam.marathon.entity.Customer;
import com.bilgeadam.marathon.entity.ProcessDetail;
import com.bilgeadam.marathon.entity.Process;


public class HibernateSession {
	

		private static final SessionFactory sessionFactory= sessionFactory();
		
		
		private static SessionFactory sessionFactory() {
			
			SessionFactory factory = null;
			
			try {
				Configuration configuration = new Configuration();		
				
				configuration.addAnnotatedClass(Account.class);
				configuration.addAnnotatedClass(AccountType.class);
				configuration.addAnnotatedClass(Branch.class);
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Process.class);
				configuration.addAnnotatedClass(ProcessDetail.class);

				
				factory =configuration.configure("marathonDB.cfg.xml").buildSessionFactory();
				System.out.println("Connection to PostgreSQL via Hibernate established.");
				
			
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
			return factory;
			
		}
		
		public static SessionFactory getSessionFactory() {
			
			try {
				return sessionFactory;
			} catch (Exception ex) {
				// TODO: handle exception
			}
			return sessionFactory;
			
		}
		
		
	}

