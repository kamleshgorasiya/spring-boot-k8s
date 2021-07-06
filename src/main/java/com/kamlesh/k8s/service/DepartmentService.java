package com.kamlesh.k8s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamlesh.k8s.entity.Department;
import com.kamlesh.k8s.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}


    public Department findDepartmentById(Long departmentId) {
       
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
