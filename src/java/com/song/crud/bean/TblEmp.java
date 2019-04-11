package com.song.crud.bean;
import org.springframework.stereotype.Component;

public class TblEmp {
    private Integer empId;

    private String empName;

    public TblEmp() {
    }

    private String empGender;

    private String email;

    private Integer dId;
    private TbleDept tbleDept;

    public TbleDept getTbleDept() {
        return tbleDept;
    }

    public void setTbleDept(TbleDept tbleDept) {
        this.tbleDept = tbleDept;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender == null ? null : empGender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "TblEmp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                ", tbleDept=" + tbleDept +
                '}';
    }

    public TblEmp( String empName, String empGender, String email, Integer dId) {

        this.empName = empName;
        this.empGender = empGender;
        this.email = email;
        this.dId = dId;

    }
}