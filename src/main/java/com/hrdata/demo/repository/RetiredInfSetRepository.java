package com.hrdata.demo.repository;

import com.hrdata.demo.entity.RetiredInfSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RetiredInfSetRepository extends JpaRepository<RetiredInfSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
