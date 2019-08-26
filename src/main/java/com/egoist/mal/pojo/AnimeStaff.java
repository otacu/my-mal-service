package com.egoist.mal.pojo;

public class AnimeStaff {
    private Long idx;

    private Integer animeId;

    private String animeEnName;

    private String animeJpName;

    private String name;

    private String roles;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getAnimeEnName() {
        return animeEnName;
    }

    public void setAnimeEnName(String animeEnName) {
        this.animeEnName = animeEnName == null ? null : animeEnName.trim();
    }

    public String getAnimeJpName() {
        return animeJpName;
    }

    public void setAnimeJpName(String animeJpName) {
        this.animeJpName = animeJpName == null ? null : animeJpName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }
}