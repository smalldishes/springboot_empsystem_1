package com.lora.dao;

import com.lora.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    private static HashMap<Integer, Department> department = null;
    static {
        department=new HashMap<>();
        department.put(1,new Department(1,"前端岗位"));
        department.put(2,new Department(2,"后端岗位"));
        department.put(3,new Department(3,"测开岗位"));
        department.put(4,new Department(4,"算法岗位"));

    }
    public Collection<Department> findAllDepartments(){
        return department.values();
    }
    public Department findDepartmentsById(Integer id){
        return department.get(id);
    }
}
