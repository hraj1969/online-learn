package com.indusnet.ums.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indusnet.ums.model.Progress;
import com.indusnet.ums.repository.ProgressRepository;
import com.indusnet.ums.service.IProgressService;

@Service
public class ProgressServiceImpl implements IProgressService {

    @Autowired
    private ProgressRepository progressRepository;

    @Override
    public Progress saveProgress(Progress progress) {
        return progressRepository.save(progress);
    }
}
