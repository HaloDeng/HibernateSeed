package com.halo.seed.dao;

import com.halo.seed.entity.IndexEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexDAOImpl implements IndexDAO {
    @Autowired
    private SessionFactory sessionFactory;
    private Session getSession(){
       return sessionFactory.getCurrentSession();
    }
    public void add(IndexEntity entity) {
        getSession().saveOrUpdate(entity);
    }

    public IndexEntity querySingle(Integer id) {
        IndexEntity indexEntity = (IndexEntity) getSession().get(IndexEntity.class,id);
        return indexEntity;
    }
}
