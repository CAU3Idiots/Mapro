package com.cauIdiots.mapro.controller;

import com.cauIdiots.mapro.DAO.feedDAO;
import com.cauIdiots.mapro.DTO.feed;
import com.cauIdiots.mapro.DTO.feed_location;
import com.cauIdiots.mapro.DTO.view_history;
import com.cauIdiots.mapro.service.feedService;
import com.cauIdiots.mapro.service.locationService;
import com.cauIdiots.mapro.service.viewHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Random;

@RestController
public class DbDataInputTest {

    @Autowired
    private feedService feedservice;
    @Autowired
    private locationService locationService;
    @Autowired
    private viewHistoryService historyService;

    @RequestMapping(value="/dataTestInput")
    public void testInput() {
        int userid = 1;

        for (int i = 1; i < 15000; i++) {
            feed feed = new feed();
            feed.setIndex(i);
            feed.setUserid(userid++ % 9 + 1);
            feed.setTitle("feed" + i);
            feed.setContents("contents" + i);
            feed.setFeed_hit(i % 101);
            feed.setLike_hit(i % 501);
            feed.setIs_activated(1);
            feedservice.save(feed);
            System.out.println("inserted" + i + "th row");
        }
    }

    @RequestMapping(value="/locationTestInput")
    public void locationTestInput() {
        Random createRandom = new Random();
        int userid = 6;
        String[] address_array = {"서울", "부산", "경남", "울산", "광주", "대전", "강원", "속초", "간성", "인천"};

        for (int i = 15027; i < 30026; i++) {
            feed_location location = new feed_location();
            location.setIndex(i);
            location.setFeed(i);
            location.setAddress(address_array[i % 10]);
            location.setLatitude(createRandom.nextInt(90) - 90);
            location.setLongitude(createRandom.nextInt(180) - 180);
            locationService.save(location);
            System.out.println("inserted" + i + "th row");
        }
    }

    @RequestMapping(value="/viewhistoryTestInput")
    public void historyTestInput() {
        int viewernum = 1;
        for (int i = 30; i < 13000; i++) {
            view_history view = new view_history();
            view.setFeed(i % 3000 + 15027);
            view.setViewer(viewernum % 9 + 1);
            historyService.save(view);
            viewernum++;
            System.out.println("inserted" + i + "th row");
        }
    }
}
