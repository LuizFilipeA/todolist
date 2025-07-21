package service;

import entity.Todo;
import org.springframework.data.domain.Sort;
import repository.TodoRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class TodoService {

    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    //Pode melhorar o list... usando ordenação
    public List<Todo> list() {
        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }

}
