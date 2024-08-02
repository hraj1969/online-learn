package com.indusnet.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indusnet.ums.model.Assignment;
import com.indusnet.ums.repository.AssignmentRepository;
import com.indusnet.ums.service.IAssignmentService;

@Service
public class AssignmentServiceImpl implements IAssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Override
    public Assignment submitAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }
}
