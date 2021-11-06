package com.cauIdiots.mapro.repository.memberRepository;

import com.cauIdiots.mapro.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class JpaMemberRepository implements MemberRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Member join(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        Member findMember = em.find(Member.class,id);
        return findMember;
    }
}
