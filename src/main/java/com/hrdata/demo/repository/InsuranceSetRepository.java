package com.hrdata.demo.repository;

import com.hrdata.demo.entity.InsuranceSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InsuranceSetRepository extends JpaRepository<InsuranceSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
