package com.egoist.mal.pojo;

public class AnimeCharacter {
    private Long idx;

    private Integer animeId;

    private String animeEnName;

    private String animeJpName;

    private String name;

    private String type;

    private String voiceActor;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getVoiceActor() {
        return voiceActor;
    }

    public void setVoiceActor(String voiceActor) {
        this.voiceActor = voiceActor == null ? null : voiceActor.trim();
    }
}