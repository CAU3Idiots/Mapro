package com.cauIdiots.mapro.controller;

import com.cauIdiots.mapro.domain.Feed;
import com.cauIdiots.mapro.service.feedService.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class FeedController {


    private final FeedService feedService;


    @PostMapping("feeds")
    public Long writeFeed(@RequestBody Feed feed, HttpServletResponse response) {
        Feed saved_feed = feedService.save(feed);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return saved_feed.getId();
    }
}
