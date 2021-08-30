package com.cauIdiots.mapro.repository.memberRepository;

import com.cauIdiots.mapro.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryMemberRepository implements MemberRepository{

    ConcurrentHashMap<String,Member> memoryRepository = new ConcurrentHashMap<>();

    @Override
    public Member join(Member member) {
        memoryRepository.put(member.getId(),member);
        return memoryRepository.get(member.getId());
    }
}
