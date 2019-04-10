package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Whisky> getWhiskyByAge(Long id, int age) {
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("id", id));
            cr.createAlias("whisky", "whiskyAlias");
            cr.add(Restrictions.eq("whiskyAlias.age", age));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }

//    @Transactional
//    public List<Whisky> getWhiskyByRegion(String region) {
//        List<Whisky> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Distillery.class);
//            cr.createAlias("whisky", "whiskyAlias");
//            cr.add(Restrictions.eq("whiskyAlias.age", region));
//            result = cr.list();
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
//        return result;
//    }
}
