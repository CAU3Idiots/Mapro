package com.cauIdiots.mapro.repository;

import com.cauIdiots.mapro.domain.Feed;

import javax.persistence.EntityManager;

public class JpaFeedRepository implements FeedRepository {

    private final EntityManager em;

    public JpaFeedRepository(EntityManager em) {
        this.em = em;
    }


    @Override
    public Feed save(Feed feed) {
        em.persist(feed);
        return feed;
    }
}
