package com.example.demo13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo13.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
