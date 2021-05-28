package com.cauIdiots.mapro.DAO;

import com.cauIdiots.mapro.DTO.feed_location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface locationDAO  extends JpaRepository<feed_location, Integer> {

}