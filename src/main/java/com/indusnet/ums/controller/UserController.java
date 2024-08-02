package com.indusnet.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.indusnet.ums.model.Course;
import com.indusnet.ums.model.Progress;
import com.indusnet.ums.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}/progress")
    public Progress getUserProgress(@PathVariable String id, @RequestParam String courseId) {
        return userService.getUserProgress(id, courseId);
    }

    @GetMapping("/{id}/recommendations")
    public List<Course> getUserRecommendations(@PathVariable String id) {
        return userService.getUserRecommendations(id);
    }
}
