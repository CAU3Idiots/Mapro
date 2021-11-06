package com.cauIdiots.mapro.service.memberService;

import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.repository.memberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImplV1 implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member join(Member member) {

        Member savedMember = memberRepository.join(member);
        log.info("saved member id = {}",savedMember.getId());
        log.info("saved member name = {}",savedMember.getName());
        return savedMember;

    }

    @Override
    public Member findById(Long id) {
        Member findMember = memberRepository.findById(id);
        return findMember;
    }
}
