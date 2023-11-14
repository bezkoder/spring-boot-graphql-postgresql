package com.bezkoder.spring.graphql.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.postgresql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}