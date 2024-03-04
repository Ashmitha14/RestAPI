package com.example.demo13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo13.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
