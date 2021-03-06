package ie.dell.adf.services;

import ie.dell.adf.domain.Todo;

import java.util.List;

public interface TodoService {

	List<Todo> getAllTodos();

	Todo createNewTodo(String text);

	void close(String todoId);

	void open(String todoId);

	Todo get(String todoId);

	void delete(String todoId);

}
