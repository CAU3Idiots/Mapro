package com.cauIdiots.mapro.DAO;

import com.cauIdiots.mapro.DTO.view_history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface viewHistoryDAO extends JpaRepository<view_history, Integer> {
}
