package com.song.crud.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.PreparedStatement;
import com.song.crud.bean.Msg;
import com.song.crud.bean.TblEmp;
import com.song.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emps")
public class empsController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/emps")
    public String empList(@RequestParam(value = "page" ,defaultValue = "0") Integer page, Model model){
        PageHelper.startPage(page, 10);
        List<TblEmp> tblEmps = employeeService.getAllEmp();
        //s使用pageInfo 包装tblEmps
        for (int i=0 ;i<tblEmps.size();i++){
            System.out.println(tblEmps.get(i).getTbleDept().getDeptName());
        }
        PageInfo info = new PageInfo(tblEmps,5);
        model.addAttribute("pageinfo",info);
        return "/list";
    }

    @RequestMapping("/empss")
    @ResponseBody
    public Msg emp(@RequestParam(value = "pn" ,defaultValue = "10") Integer page, Model model){
        PageHelper.startPage(page, 10);
        List<TblEmp> tblEmps = employeeService.getAllEmps();
        //s使用pageInfo 包装tblEmps
        for (int i=0 ;i<tblEmps.size();i++){
            System.out.println(tblEmps.get(i).getdId());
        }
        PageInfo info = new PageInfo(tblEmps,5);
        return new Msg().Success().add("infpage",info);
    }
}
