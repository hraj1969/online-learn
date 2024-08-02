package com.indusnet.ums.service;

import com.indusnet.ums.model.Quiz;
import java.util.List;

public interface IQuizService {
    // Method to get all quizzes
    List<Quiz> getAllQuizzes();

    // Method to get a quiz by its ID
    Quiz getQuizById(String id);

    // Method to create a new quiz
    Quiz createQuiz(Quiz quiz);

    // Method to submit a quiz
    Quiz submitQuiz(Quiz quiz);
}
