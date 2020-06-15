package com.hrdata.demo.repository;

import com.hrdata.demo.entity.AssessSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssessSetRepository extends JpaRepository<AssessSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
