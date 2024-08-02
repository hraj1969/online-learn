package com.indusnet.ums.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indusnet.ums.model.Assignment;

public interface AssignmentRepository extends MongoRepository<Assignment, String> {
}
