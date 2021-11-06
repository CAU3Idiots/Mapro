package com.cauIdiots.mapro.repository.memberRepository;

import com.cauIdiots.mapro.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class JpaMemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setName("jaewan");

        Long savedId = memberRepository.join(member);



        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
    }

}