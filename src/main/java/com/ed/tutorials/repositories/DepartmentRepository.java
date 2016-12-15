package com.ed.tutorials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.tutorials.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
