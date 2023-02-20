package com.testP.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testP.data.model.LoginInfo;

@Repository
public interface LoginInfoRepository extends JpaRepository<LoginInfo, String> {

}
