package com.lora.controller;

import com.lora.dao.DepartmentDao;
import com.lora.dao.EmployeeDao;
import com.lora.pojo.Department;
import com.lora.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao  employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.findAllEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    @RequestMapping("/add")
    public String  add(Model model){
        Collection<Department> departments = departmentDao.findAllDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }
}
