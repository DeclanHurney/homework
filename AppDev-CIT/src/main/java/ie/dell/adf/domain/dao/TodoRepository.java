package ie.dell.adf.domain.dao;

import ie.dell.adf.domain.Todo;

import java.util.List;

public interface TodoRepository {

	Todo findById(String id);

	List<Todo> getAll();

	void add(Todo todo);

	void delete(String todoId);

	void update(Todo todo);

}
