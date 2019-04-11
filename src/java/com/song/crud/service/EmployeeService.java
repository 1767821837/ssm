package com.song.crud.service;

import com.song.crud.bean.TblEmp;
import com.song.crud.dao.TblEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    TblEmpMapper tblEmpMapper;

    public List<TblEmp> getAllEmp() {

        return tblEmpMapper.selectByExamplewheredapt(null);
    }
    public List<TblEmp> getAllEmps() {

        return tblEmpMapper.selectByExample(null);
    }
}
