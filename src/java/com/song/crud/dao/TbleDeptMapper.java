package com.song.crud.dao;

import com.song.crud.bean.TbleDept;
import com.song.crud.bean.TbleDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbleDeptMapper {
    long countByExample(TbleDeptExample example);

    int deleteByExample(TbleDeptExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(TbleDept record);

    int insertSelective(TbleDept record);

    List<TbleDept> selectByExample(TbleDeptExample example);

    TbleDept selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") TbleDept record, @Param("example") TbleDeptExample example);

    int updateByExample(@Param("record") TbleDept record, @Param("example") TbleDeptExample example);

    int updateByPrimaryKeySelective(TbleDept record);

    int updateByPrimaryKey(TbleDept record);
}