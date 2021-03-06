package com.kamlesh.k8s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamlesh.k8s.entity.Department;
import com.kamlesh.k8s.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService  departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println(department.toString());
		return departmentService.saveDepartment(department);
	}

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
    	Department department=new Department(1L,"Production","Surat","101");
    	return department;
        //return departmentService.findDepartmentById(departmentId);
    }
	
}
