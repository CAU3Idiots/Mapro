package com.cauIdiots.mapro.repository.memberRepository;

import com.cauIdiots.mapro.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;

//@Repository
public class MemoryMemberRepository implements MemberRepository{

    ConcurrentHashMap<Long,Member> memoryRepository = new ConcurrentHashMap<>();

    @Override
    public Member join(Member member) {
        memoryRepository.put(member.getId(),member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        return null;
    }
}
