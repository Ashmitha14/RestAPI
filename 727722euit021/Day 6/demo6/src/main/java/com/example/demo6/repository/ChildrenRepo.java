package com.example.demo6.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo6.model.Children;


@Repository
public interface ChildrenRepo extends JpaRepository<Children,Integer>{
}