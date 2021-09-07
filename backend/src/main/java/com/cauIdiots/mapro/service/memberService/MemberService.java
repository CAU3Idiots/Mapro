package com.cauIdiots.mapro.service.memberService;

import com.cauIdiots.mapro.domain.Member;

public interface MemberService {
    Member join(Member member);

    Member findById(Long id);
}
