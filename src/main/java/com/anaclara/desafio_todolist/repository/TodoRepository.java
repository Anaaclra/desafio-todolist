package com.anaclara.desafio_todolist.repository;

import com.anaclara.desafio_todolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
