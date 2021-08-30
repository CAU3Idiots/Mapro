package com.cauIdiots.mapro.service.memberService;

import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.repository.memberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImplV1 implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public Member join(Member member) {
        return memberRepository.join(member);
    }
}
