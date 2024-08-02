package com.indusnet.ums.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indusnet.ums.model.Progress;

public interface ProgressRepository extends MongoRepository<Progress, String> {
    Progress findByUserIdAndCourseId(String userId, String courseId);
}
