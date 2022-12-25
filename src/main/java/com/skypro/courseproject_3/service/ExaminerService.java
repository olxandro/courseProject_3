package com.skypro.courseproject_3.service;

import com.skypro.courseproject_3.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
