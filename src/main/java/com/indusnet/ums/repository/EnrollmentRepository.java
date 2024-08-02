package com.indusnet.ums.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indusnet.ums.model.Enrollment;

public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {
}
