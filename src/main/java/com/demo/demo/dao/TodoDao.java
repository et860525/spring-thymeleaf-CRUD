package com.demo.demo.dao;

import com.demo.demo.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoDao extends CrudRepository<Todo, Integer> {
	
}
