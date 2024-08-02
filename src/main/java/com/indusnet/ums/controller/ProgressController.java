package com.indusnet.ums.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.indusnet.ums.model.Progress;
import com.indusnet.ums.service.IProgressService;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private IProgressService progressService;

    @PostMapping
    public Progress postProgress(@RequestBody Progress progress) {
        return progressService.saveProgress(progress);
    }
}

