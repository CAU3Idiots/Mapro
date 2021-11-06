package com.cauIdiots.mapro.service.feedService;


import com.cauIdiots.mapro.domain.Feed;
import com.cauIdiots.mapro.domain.Member;
import com.cauIdiots.mapro.repository.feedRepository.FeedRepository;
import com.cauIdiots.mapro.repository.memberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FeedServiceImplV1 implements FeedService{

    private final FeedRepository feedRepository;
    private final MemberRepository memberRepository;


    @Transactional
    @Override
    public Feed save(Feed feed) {

        Long id = 1L;
        Member member = memberRepository.findById(id);

        feed.setMember(member);
        feed.setCreate_date(LocalDateTime.now());
        Feed saved_feed = feedRepository.save(feed);
        return saved_feed;
    }

}
