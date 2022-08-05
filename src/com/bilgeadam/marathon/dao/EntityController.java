package com.bilgeadam.marathon.dao;

import org.hibernate.Session;

import com.bilgeadam.marathon.utils.HibernateSession;

public class EntityController<T> implements IRepository<T> {

	@Override
	public void create(T entity) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
    }

	@Override
	public void update(long id, T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
