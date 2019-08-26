package com.egoist.mal.elasticsearch.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Score;

import java.io.Serializable;

@Document(indexName = "index_mal_anime", type = "doc")
public class AnimeDoc implements Serializable {

    /**
     * 动画的站内id
     */
    @Id
    private Integer animeId;

    /**
     * 英文名
     */
    @Field(type = FieldType.Text)
    private String enName;

    /**
     * 日文名 用日语分词器
     */
    @Field(type = FieldType.Text, analyzer = "kuromoji", searchAnalyzer = "kuromoji")
    private String jpName;

    /**
     * 图片  不需要索引
     */
    @Field(index = false, type = FieldType.Keyword)
    private String pic;

    /**
     * 播出类型
     */
    @Field(type = FieldType.Keyword)
    private String animeType;

    /**
     * 集数
     */
    @Field(index = false, type = FieldType.Integer)
    private Integer episodes;

    /**
     * 首播时间
     */
    @Field(type = FieldType.Text)
    private String premiered;

    /**
     * 制片方
     */
    @Field(type = FieldType.Text)
    private String producers;

    /**
     * 工作室
     */
    @Field(type = FieldType.Text)
    private String studios;

    /**
     * 原作类型
     */
    @Field(type = FieldType.Keyword)
    private String source;

    @Score
    private Float score;

    /**
     * @return animeId
     */
    public Integer getAnimeId() {
        return animeId;
    }

    /**
     * @param animeId animeId
     */
    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    /**
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    /**
     * @param enName enName
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * @return jpName
     */
    public String getJpName() {
        return jpName;
    }

    /**
     * @param jpName jpName
     */
    public void setJpName(String jpName) {
        this.jpName = jpName;
    }

    /**
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * @return animeType
     */
    public String getAnimeType() {
        return animeType;
    }

    /**
     * @param animeType animeType
     */
    public void setAnimeType(String animeType) {
        this.animeType = animeType;
    }

    /**
     * @return episodes
     */
    public Integer getEpisodes() {
        return episodes;
    }

    /**
     * @param episodes episodes
     */
    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    /**
     * @return premiered
     */
    public String getPremiered() {
        return premiered;
    }

    /**
     * @param premiered premiered
     */
    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    /**
     * @return producers
     */
    public String getProducers() {
        return producers;
    }

    /**
     * @param producers producers
     */
    public void setProducers(String producers) {
        this.producers = producers;
    }

    /**
     * @return studios
     */
    public String getStudios() {
        return studios;
    }

    /**
     * @param studios studios
     */
    public void setStudios(String studios) {
        this.studios = studios;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return score;
    }

    /**
     * @param score score
     */
    public void setScore(Float score) {
        this.score = score;
    }
}
