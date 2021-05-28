package com.cauIdiots.mapro.controller;

import com.cauIdiots.mapro.DTO.feed;
import com.cauIdiots.mapro.service.feedService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class searchController {

    @Autowired
    private feedService feedservice;

    @RequestMapping(value="/dataAreaSearch")
    public String feedAreaSearch(@RequestBody Area inputArea) throws Exception {
        List<feed> resultSet = feedservice.areaSearchFeed(inputArea.x_start,
                        inputArea.x_end, inputArea.y_start, inputArea.y_end);
        ObjectMapper mapper = new ObjectMapper();
        String json_resultSet = mapper.writeValueAsString(resultSet);

        return json_resultSet;
    }

    static class Area {
        float x_start;
        float x_end;
        float y_start;
        float y_end;
    }
}
