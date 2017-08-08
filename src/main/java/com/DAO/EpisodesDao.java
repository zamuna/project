package com.DAO;

import com.model.Episodes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public class EpisodesDao implements IEpisodesDao {
    @Autowired
    private SessionFactory sessionFactory;
    Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Episodes> getAll() {
        return null;
    }

    public void add(Episodes episodes) {

    }

    public Episodes get(int id) {
        return null;
    }

    public void update(int episodesId, Episodes episodes) {

    }

    public void delete(int episodesId) {

    }
}
