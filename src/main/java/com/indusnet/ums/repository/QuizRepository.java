package com.indusnet.ums.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indusnet.ums.model.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}
