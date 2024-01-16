package com.varun.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.demo.model.question;

public interface quetionrepo extends JpaRepository<question,Integer>{

}
