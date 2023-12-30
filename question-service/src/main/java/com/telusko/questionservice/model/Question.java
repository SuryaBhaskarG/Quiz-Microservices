package com.telusko.questionservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
//@Table(name="Questiondb_test")
public class Question 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    @Column(name="question_title")
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @Column(name="right_answer")
    private String rightAnswer;
    private String difficultylevel;
    private String category;
}
