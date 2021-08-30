package com.cauIdiots.mapro.controller;

import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.service.memberService.MemberServiceImplV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberServiceImplV1 memberServiceImplV1;

    @PostMapping
    public Member join(@RequestBody Member member) {
       Member savedMember = memberServiceImplV1.join(member);
       return savedMember;
    }

}
