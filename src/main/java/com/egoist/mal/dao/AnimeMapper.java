package com.egoist.mal.dao;

import com.egoist.mal.pojo.Anime;
import com.egoist.mal.pojo.AnimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeMapper {
    long countByExample(AnimeExample example);

    int deleteByExample(AnimeExample example);

    int deleteByPrimaryKey(Long idx);

    int insert(Anime record);

    int insertSelective(Anime record);

    List<Anime> selectByExample(AnimeExample example);

    Anime selectByPrimaryKey(Long idx);

    int updateByExampleSelective(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByExample(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByPrimaryKeySelective(Anime record);

    int updateByPrimaryKey(Anime record);
}