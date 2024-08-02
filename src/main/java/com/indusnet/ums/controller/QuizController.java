package com.indusnet.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.indusnet.ums.model.Quiz;
import com.indusnet.ums.service.IQuizService;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private IQuizService quizService;

    @PostMapping("/{id}/submissions")
    public Quiz submitQuiz(@PathVariable Long id, @RequestBody Quiz quiz) {
        return quizService.submitQuiz(quiz);
    }
}
