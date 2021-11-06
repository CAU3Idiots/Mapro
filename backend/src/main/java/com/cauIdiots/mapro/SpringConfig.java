package com.cauIdiots.mapro;

import com.cauIdiots.mapro.repository.FeedRepository;
import com.cauIdiots.mapro.repository.JpaFeedRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public FeedRepository FeedRepository(){
        return new JpaFeedRepository(em);
    }
}
