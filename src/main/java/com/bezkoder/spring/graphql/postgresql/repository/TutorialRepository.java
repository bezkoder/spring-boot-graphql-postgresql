package com.bezkoder.spring.graphql.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.postgresql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
