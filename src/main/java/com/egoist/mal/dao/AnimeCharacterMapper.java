package com.egoist.mal.dao;

import com.egoist.mal.pojo.AnimeCharacter;
import com.egoist.mal.pojo.AnimeCharacterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeCharacterMapper {
    long countByExample(AnimeCharacterExample example);

    int deleteByExample(AnimeCharacterExample example);

    int deleteByPrimaryKey(Long idx);

    int insert(AnimeCharacter record);

    int insertSelective(AnimeCharacter record);

    List<AnimeCharacter> selectByExample(AnimeCharacterExample example);

    AnimeCharacter selectByPrimaryKey(Long idx);

    int updateByExampleSelective(@Param("record") AnimeCharacter record, @Param("example") AnimeCharacterExample example);

    int updateByExample(@Param("record") AnimeCharacter record, @Param("example") AnimeCharacterExample example);

    int updateByPrimaryKeySelective(AnimeCharacter record);

    int updateByPrimaryKey(AnimeCharacter record);
}