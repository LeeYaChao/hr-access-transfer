package com.hrdata.demo.repository;

import com.hrdata.demo.entity.TrainWaySet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrainWaySetRepository extends JpaRepository<TrainWaySet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
