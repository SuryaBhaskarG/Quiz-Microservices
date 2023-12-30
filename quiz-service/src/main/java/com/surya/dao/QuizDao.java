package com.surya.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
