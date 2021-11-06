package com.cauIdiots.mapro.service.authService;

import com.cauIdiots.mapro.domain.Member;

public interface AuthService {
    void signUpUser(Member member);

    Member loginUser(String id, String password);
}
