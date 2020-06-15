package com.hrdata.demo.repository;

import com.hrdata.demo.entity.WorkersResumeSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkersResumeSetRepository extends JpaRepository<WorkersResumeSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
