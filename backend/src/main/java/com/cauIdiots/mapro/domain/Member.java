package com.cauIdiots.mapro.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private String id;
    private String password;
    private String name;

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

}
