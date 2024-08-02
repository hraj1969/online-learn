package com.indusnet.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.indusnet.ums.model.Assignment;
import com.indusnet.ums.service.IAssignmentService;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private IAssignmentService assignmentService;

    @PostMapping("/{id}/submissions")
    public Assignment submitAssignment(@PathVariable Long id, @RequestBody Assignment assignment) {
        return assignmentService.submitAssignment(assignment);
    }
}
