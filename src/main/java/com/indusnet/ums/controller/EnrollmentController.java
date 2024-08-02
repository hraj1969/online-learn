package com.indusnet.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.indusnet.ums.model.Enrollment;
import com.indusnet.ums.service.IEnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private IEnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enrollUser(@RequestBody Enrollment enrollment) {
        return enrollmentService.enrollUser(enrollment);
    }
}
