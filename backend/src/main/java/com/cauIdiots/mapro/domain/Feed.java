package com.cauIdiots.mapro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Feed {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;
    private String userId;
    private String title;
    private String contents;
    private int feedHit;
    private int likeHit;
    private int feedParent;
    private LocalDateTime createdTime = LocalDateTime.now();
    private LocalDateTime updatedTime;
    private int isActivated;

    public int getFeedHit() {
        return feedHit;
    }

    public void setFeedHit(int feedHit) {
        this.feedHit = feedHit;
    }

    public int getLikeHit() {
        return likeHit;
    }

    public void setLikeHit(int likeHit) {
        this.likeHit = likeHit;
    }

    public int getFeedParent() {
        return feedParent;
    }

    public void setFeedParent(int feedParent) {
        this.feedParent = feedParent;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public int getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(int isActivated) {
        this.isActivated = isActivated;
    }
}
