package com.indusnet.ums.service;

import com.indusnet.ums.model.Course;

import java.util.List;

public interface ICourseService {
    List<Course> getAllCourses();
    Course getCourseById(String id);
    Course createCourse(Course course);
}
