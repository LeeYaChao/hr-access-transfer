package com.hrdata.demo.repository;

import com.hrdata.demo.entity.MyLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<MyLog, String> {
}
