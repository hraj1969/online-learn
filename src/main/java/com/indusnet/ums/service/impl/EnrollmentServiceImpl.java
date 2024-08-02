package com.indusnet.ums.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indusnet.ums.model.Enrollment;
import com.indusnet.ums.repository.EnrollmentRepository;
import com.indusnet.ums.service.IEnrollmentService;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public Enrollment enrollUser(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}
