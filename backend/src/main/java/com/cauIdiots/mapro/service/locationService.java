package com.cauIdiots.mapro.service;

import com.cauIdiots.mapro.DAO.locationDAO;
import com.cauIdiots.mapro.DTO.feed_location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class locationService {
    @Autowired
    private locationDAO locationRepository;

    public feed_location save(feed_location target) {
        locationRepository.save(target);
        return target;
    }
}
