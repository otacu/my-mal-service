package com.egoist.mal.dao;

import com.egoist.mal.pojo.AnimeThemeSong;
import com.egoist.mal.pojo.AnimeThemeSongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeThemeSongMapper {
    long countByExample(AnimeThemeSongExample example);

    int deleteByExample(AnimeThemeSongExample example);

    int deleteByPrimaryKey(Long idx);

    int insert(AnimeThemeSong record);

    int insertSelective(AnimeThemeSong record);

    List<AnimeThemeSong> selectByExample(AnimeThemeSongExample example);

    AnimeThemeSong selectByPrimaryKey(Long idx);

    int updateByExampleSelective(@Param("record") AnimeThemeSong record, @Param("example") AnimeThemeSongExample example);

    int updateByExample(@Param("record") AnimeThemeSong record, @Param("example") AnimeThemeSongExample example);

    int updateByPrimaryKeySelective(AnimeThemeSong record);

    int updateByPrimaryKey(AnimeThemeSong record);
}