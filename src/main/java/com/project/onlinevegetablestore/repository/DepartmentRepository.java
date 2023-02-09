package com.project.onlinevegetablestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinevegetablestore.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
