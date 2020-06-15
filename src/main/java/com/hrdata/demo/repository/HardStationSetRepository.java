package com.hrdata.demo.repository;

import com.hrdata.demo.entity.HardStationSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HardStationSetRepository extends JpaRepository<HardStationSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
