package com.cauIdiots.mapro.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Feed {
    @Id @GeneratedValue
    @Column(name = "feed_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String latitude;
    private String longitude;

    private LocalDateTime create_date;
    private String contents;

    public void setMember(Member member) {
        this.member = member;
        member.getFeeds().add(this);
    }

//    public static Feed createFeed(Member member, String contents) {
//        Feed feed = new Feed();
//        feed.setMember(member);
//        feed.setCreate_date(LocalDateTime.now());
//        feed.setContents(contents);
//        return feed;
//    }

}
