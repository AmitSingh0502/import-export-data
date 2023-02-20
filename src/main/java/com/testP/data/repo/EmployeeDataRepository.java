package com.testP.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testP.data.model.EmployeeData;

@Repository
public interface EmployeeDataRepository extends JpaRepository<EmployeeData, String> {

}
