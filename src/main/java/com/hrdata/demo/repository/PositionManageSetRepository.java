package com.hrdata.demo.repository;

import com.hrdata.demo.entity.PositionManageSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionManageSetRepository extends JpaRepository<PositionManageSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
