package com.service;

import com.DAO.ICastDao;
import com.model.Cast;
import org.springframework.stereotype.Service;


/**
 * Created by Zamuna on 8/7/2017.
 */
@Service
public class CastService {
    private ICastDao castDao;
    //@Transactional
    public Cast CreateCast(){
        Cast cast = new Cast();
        cast.setName("Jenifer Ainston");
        cast.setRole("Rachel Geller");
        castDao.add(cast);
        return cast;

    }
}
