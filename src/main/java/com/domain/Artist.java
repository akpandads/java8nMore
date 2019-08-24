package com.domain;

import java.util.List;
import java.util.Set;

public class Artist {
    private String name;
    private List<Artist> members;
    private String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Artist> getMembers() {
        return this.members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
