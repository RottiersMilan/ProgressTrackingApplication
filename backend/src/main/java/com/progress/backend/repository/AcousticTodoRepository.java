package com.progress.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progress.backend.entity.AcousticTodo;

public interface AcousticTodoRepository extends JpaRepository<AcousticTodo, Long> {
    
}
