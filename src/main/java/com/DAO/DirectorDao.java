package com.DAO;

import com.model.Director;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public class DirectorDao implements IDirectorDao {
    @Autowired
    private SessionFactory sessionFactory;
    Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Director> getAll() {
        return null;
    }

    public void add(Director director) {

    }

    public Director get(int id) {
        return null;
    }

    public void update(int directorId, Director director) {

    }

    public void delete(int directorId) {

    }
}
