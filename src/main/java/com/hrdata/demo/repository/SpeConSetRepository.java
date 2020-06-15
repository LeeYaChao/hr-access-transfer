package com.hrdata.demo.repository;

import com.hrdata.demo.entity.SpeConSet;
import com.hrdata.demo.entity.SpecialtySet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeConSetRepository extends JpaRepository<SpeConSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
