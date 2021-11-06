package com.cauIdiots.mapro.service.authService;

import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.repository.memberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImplV1 implements AuthService{

    private final MemberRepository memberRepository;

    @Override
    public void signUpUser(Member member) {
    }

    @Override
    public Member loginUser(String id, String password) {
        return null;
    }
}
