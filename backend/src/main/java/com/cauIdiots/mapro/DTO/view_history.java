package com.cauIdiots.mapro.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name = "view_history")
public class view_history {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;
    private int feed;
    private int viewer;
}