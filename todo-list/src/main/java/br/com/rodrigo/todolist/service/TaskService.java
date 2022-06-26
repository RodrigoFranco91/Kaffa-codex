package br.com.rodrigo.todolist.service;

import br.com.rodrigo.todolist.model.Task;
import br.com.rodrigo.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void salvarTask(Task task){
        taskRepository.save(task);
    }

    public void deletaTask(Long id){
        taskRepository.deleteById(id);
    }

    public List<Task> listarTask(){
        return taskRepository.findAll();
    }
}
