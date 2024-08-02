package com.indusnet.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indusnet.ums.model.Course;
import com.indusnet.ums.model.Progress;
import com.indusnet.ums.repository.CourseRepository;
import com.indusnet.ums.repository.ProgressRepository;
import com.indusnet.ums.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private ProgressRepository progressRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Progress getUserProgress(String userId, String courseId) {
        return progressRepository.findByUserIdAndCourseId(userId, courseId);
    }

    @Override
    public List<Course> getUserRecommendations(String userId) {
        // Implement logic to fetch user recommendations based on user interests or performance
        return courseRepository.findAll(); // Example implementation
    }
}
