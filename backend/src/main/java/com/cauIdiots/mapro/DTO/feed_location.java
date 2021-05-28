package com.cauIdiots.mapro.DTO;

import lombok.*;
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
@Table(name = "feed_location")
public class feed_location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    private int feed;

    private String address;

    private double latitude;

    private double longitude;
}
