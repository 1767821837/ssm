package com.song.crud.dao;

import com.song.crud.bean.TblEmp;
import com.song.crud.bean.TblEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblEmpMapper {
    long countByExample(TblEmpExample example);

    int deleteByExample(TblEmpExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(TblEmp record);
    int insertdept(TblEmp record);
    int insertSelective(TblEmp record);

    List<TblEmp> selectByExample(TblEmpExample example);

    TblEmp selectByPrimaryKey(Integer empId);

    List<TblEmp> selectByExamplewheredapt(TblEmpExample example);

    TblEmp selectByPrimaryKeywheredapt(Integer empId);

    int updateByExampleSelective(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByExample(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);
}