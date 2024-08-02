package com.indusnet.ums.service;

import com.indusnet.ums.model.Course;
import com.indusnet.ums.model.Progress;

import java.util.List;

public interface IUserService {
    Progress getUserProgress(String userId, String courseId);
    List<Course> getUserRecommendations(String userId);
}
