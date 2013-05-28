package com.eungoo.app.repository;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eungoo.app.domain.BabbleTrans;

@Repository
public class BabbleRepository {
	@Autowired
	SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private Criteria getCriteria() {
		return getSession().createCriteria(BabbleTrans.class);
	}

	public void clearSession() {
		getSession().clear();
	}

	public void add(BabbleTrans babbleTrans) {
		babbleTrans.setRegDate(new Date());
		getSession().save(babbleTrans);
	}

	public void delete(int seq) {
		getSession().createQuery("delete from BabbleTrans where seq = ?").setInteger(0, seq).executeUpdate();
	}

	public BabbleTrans get(int seq) {
		return (BabbleTrans)getCriteria().add(Restrictions.eq("seq", seq)).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<BabbleTrans> list() {
		return getCriteria().list();
	}

	public void update(BabbleTrans babbleTrans) {
		getSession().update(babbleTrans);
	}
}