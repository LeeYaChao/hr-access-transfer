package com.hrdata.demo.repository;

import com.hrdata.demo.entity.SpecialtySet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpecialtySetRepository extends JpaRepository<SpecialtySet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
