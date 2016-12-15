package com.ed.tutorials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.tutorials.domain.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long>{

}
