package com.kamlesh.k8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamlesh.k8s.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
