package com.hrdata.demo.repository;

import com.hrdata.demo.entity.NewWageChangesSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewWageChangesSetRepository extends JpaRepository<NewWageChangesSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
