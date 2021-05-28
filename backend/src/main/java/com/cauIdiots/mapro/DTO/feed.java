package com.cauIdiots.mapro.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name = "feed")
public class feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    int userid;

    String title;

    String contents;

    int feed_hit;

    int like_hit;

    int feed_parent;

    Date create_date;

    Date modify_date;

    int is_activated;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public int getFeed_hit() {
        return feed_hit;
    }

    public void setFeed_hit(int feed_hit) {
        this.feed_hit = feed_hit;
    }

    public int getLike_hit() {
        return like_hit;
    }

    public void setLike_hit(int like_hit) {
        this.like_hit = like_hit;
    }

    public int getFeed_parent() {
        return feed_parent;
    }

    public void setFeed_parent(int feed_parent) {
        this.feed_parent = feed_parent;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public int getIs_activated() {
        return is_activated;
    }

    public void setIs_activated(int is_activated) {
        this.is_activated = is_activated;
    }
}
