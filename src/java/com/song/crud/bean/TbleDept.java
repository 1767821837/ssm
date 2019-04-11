package com.song.crud.bean;

import org.springframework.stereotype.Component;


public class TbleDept {
    private Integer deptId;

    public TbleDept() {
    }

    @Override
    public String toString() {
        return "TbleDept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public TbleDept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}