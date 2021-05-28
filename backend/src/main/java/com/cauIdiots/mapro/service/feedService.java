package com.cauIdiots.mapro.service;

import com.cauIdiots.mapro.DAO.feedDAO;
import com.cauIdiots.mapro.DTO.feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Service
public class feedService {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Autowired
    private feedDAO feedRepository;

    public feed save(feed target) {
        feedRepository.save(target);
        return target;
    }

    @Transactional
    public List<feed> areaSearchFeed(float x_start, float x_end, float y_start, float y_end) {
        EntityManager em = emf.createEntityManager();
        String execute_query = "select feed.* from mapro_database_develop.feed feed, mapro_database_develop.feed_location loc " +
                "    where feed.index = loc.feed " +
                "    and loc.latitude between :y_start and :y_end " +
                "    and loc.longitude between :x_start and :x_end;";
        List<feed> feed_result = (List<feed>)em.createQuery(execute_query).getResultList();

        return feed_result;
    }
}
