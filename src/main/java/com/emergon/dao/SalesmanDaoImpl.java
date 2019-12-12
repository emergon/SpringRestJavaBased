package com.emergon.dao;

import com.emergon.entities.Salesman;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesmanDaoImpl implements SalesmanDao{

    @Autowired
    SessionFactory sessionFactory;
    
    private Session getSession(){
        Session s = sessionFactory.getCurrentSession();
        return s;
    }
    
    @Override
    public List<Salesman> findAll() {
        Query q = getSession().createQuery("from Salesman");
        List<Salesman> list = q.getResultList();
        return list;
    }

    @Override
    public Salesman findById(int id) {
        Session session = getSession();
        Salesman s = session.byId(Salesman.class).load(id);
        return s;
    }

    @Override
    public List<Salesman> findByCity(String city) {
        Query q = getSession().createQuery("SELECT s FROM Salesman s WHERE s.scity LIKE :city");
        q.setParameter("city", "%"+city+"%");
        List<Salesman> list = q.getResultList();
        return list;
    }

    @Override
    public List<Salesman> findBetweenComm(double min, double max) {
        //String query = "select * from salesman where scomm between "+min+" and "+max;
        Query q = getSession().createQuery("SELECT s FROM Salesman s WHERE s.scomm BETWEEN :min AND :max");
        q.setParameter("min", min);
        q.setParameter("max", max);
        List<Salesman> list = q.getResultList();
        return list;
    }

    
    
}
