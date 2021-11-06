package com.cauIdiots.mapro.controller;

import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.service.memberService.MemberService;
import com.cauIdiots.mapro.service.memberService.MemberServiceImplV1;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("members")
//    @ResponseStatus(value = HttpStatus.CREATED)
    public Member join(@RequestBody Member member, HttpServletResponse httpServletResponse) {
       Member savedMember = memberService.join(member);
       httpServletResponse.setStatus(HttpServletResponse.SC_CREATED);
       return savedMember;
    }

    @GetMapping("members/{memberId}")
    public Member findById(@PathVariable Long memberId) {
        Member findMember = memberService.findById(memberId);
        return findMember;
    }

    //@GetMapping("login")
}
