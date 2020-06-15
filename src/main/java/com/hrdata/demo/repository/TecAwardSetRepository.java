package com.hrdata.demo.repository;

import com.hrdata.demo.entity.TecAwardSet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TecAwardSetRepository extends JpaRepository<TecAwardSet,String>/*, JpaSpecificationExecutor<AdmPostSet>, Serializable*/ {
}
