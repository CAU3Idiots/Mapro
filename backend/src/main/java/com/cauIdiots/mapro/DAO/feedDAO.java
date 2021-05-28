package com.cauIdiots.mapro.DAO;

import com.cauIdiots.mapro.DTO.feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface feedDAO  extends JpaRepository<feed, Integer> {

}
