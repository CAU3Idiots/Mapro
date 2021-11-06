package com.cauIdiots.mapro.repository.feedRepository;

import com.cauIdiots.mapro.domain.Feed;
import com.cauIdiots.mapro.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class JpaFeedRepository implements FeedRepository{

    private final EntityManager em;

    @Override
    public Feed save(Feed feed) {

//        Long id = 1L;
//        Member member = em.find(Member.class,id);
        //feed.setMember(member);
        em.persist(feed);
        return feed;
    }

}
