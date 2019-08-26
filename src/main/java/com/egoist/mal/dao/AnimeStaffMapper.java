package com.egoist.mal.dao;

import com.egoist.mal.pojo.AnimeStaff;
import com.egoist.mal.pojo.AnimeStaffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeStaffMapper {
    long countByExample(AnimeStaffExample example);

    int deleteByExample(AnimeStaffExample example);

    int deleteByPrimaryKey(Long idx);

    int insert(AnimeStaff record);

    int insertSelective(AnimeStaff record);

    List<AnimeStaff> selectByExample(AnimeStaffExample example);

    AnimeStaff selectByPrimaryKey(Long idx);

    int updateByExampleSelective(@Param("record") AnimeStaff record, @Param("example") AnimeStaffExample example);

    int updateByExample(@Param("record") AnimeStaff record, @Param("example") AnimeStaffExample example);

    int updateByPrimaryKeySelective(AnimeStaff record);

    int updateByPrimaryKey(AnimeStaff record);
}