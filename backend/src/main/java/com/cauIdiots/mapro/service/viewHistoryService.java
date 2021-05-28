package com.cauIdiots.mapro.service;

import com.cauIdiots.mapro.DAO.viewHistoryDAO;
import com.cauIdiots.mapro.DTO.view_history;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class viewHistoryService {
    @Autowired
    private viewHistoryDAO historyRepository;

    public view_history save(view_history target) {
        historyRepository.save(target);
        return target;
    }
}
