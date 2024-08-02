package com.indusnet.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indusnet.ums.model.Quiz;
import com.indusnet.ums.repository.QuizRepository;
import com.indusnet.ums.service.IQuizService;

import java.util.List;

@Service
public class QuizServiceImpl implements IQuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(String id) {
        return quizRepository.findById(id).orElse(null);
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz submitQuiz(Quiz quiz) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submitQuiz'");
    }
}
