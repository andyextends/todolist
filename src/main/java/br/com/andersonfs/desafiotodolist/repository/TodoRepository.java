package br.com.andersonfs.desafiotodolist.repository;

import br.com.andersonfs.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
