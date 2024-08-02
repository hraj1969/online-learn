package com.indusnet.ums.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indusnet.ums.model.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
}
