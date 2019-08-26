package com.egoist.mal.pojo;

public class Anime {
    private Long idx;

    private Integer animeId;

    private String enName;

    private String jpName;

    private String pic;

    private String type;

    private Integer episodes;

    private String premiered;

    private String producers;

    private String studios;

    private String source;

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

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getJpName() {
        return jpName;
    }

    public void setJpName(String jpName) {
        this.jpName = jpName == null ? null : jpName.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered == null ? null : premiered.trim();
    }

    public String getProducers() {
        return producers;
    }

    public void setProducers(String producers) {
        this.producers = producers == null ? null : producers.trim();
    }

    public String getStudios() {
        return studios;
    }

    public void setStudios(String studios) {
        this.studios = studios == null ? null : studios.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}