package com.hrdata.demo.repository;


import com.hrdata.demo.entity.PersonInfoSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonSetRepository extends JpaRepository<PersonInfoSet,String>{
}
