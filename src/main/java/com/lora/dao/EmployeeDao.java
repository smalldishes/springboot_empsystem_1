package com.lora.dao;

import com.lora.pojo.Department;
import com.lora.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    DepartmentDao departmentDao;



    static {
        employees = new HashMap<>();
        employees.put(1, new Employee(1, "nzw", "123@qq.com", 0, new Department(1, "前端岗位"), new Date()));
        employees.put(2, new Employee(2, "gy", "163@qq.com", 0, new Department(2, "后端岗位"), new Date()));
        employees.put(3, new Employee(3, "hby", "163@qq.com", 0, new Department(3, "测开岗位"), new Date()));
        employees.put(4, new Employee(4, "ly", "163@qq.com", 0, new Department(4, "算法岗位"), new Date()));
    }

    private static Integer initialID = 5;
//    public void addEmp(){
//        if(employee.getId()==null){
//            employee.setId(initialID);
//            employee.setDepartment(departmentDao.findDepartmentsById(employee.getDepartment().getId()));
//            employees.put(employee.getId(),employee);
//        }
//
//
//    }

    //查
    public Collection<Employee> findAllEmployee() {
        return employees.values();
    }

    //通过id查
    public Employee findEmployeeById(Integer id) {
        return employees.get(id);
    }

    //通过id删除
    public void delEmp(Integer id) {
        employees.remove(id);
    }
}
