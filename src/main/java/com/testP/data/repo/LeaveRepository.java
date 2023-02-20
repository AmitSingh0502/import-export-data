package com.testP.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testP.data.model.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, String> {

}
