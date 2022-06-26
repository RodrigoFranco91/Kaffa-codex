package br.com.rodrigo.todolist;

import br.com.rodrigo.todolist.model.Task;
import br.com.rodrigo.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

@EnableJpaRepositories
@SpringBootApplication
public class TodoListApplication implements CommandLineRunner {

	private boolean repetirMenu = true;
	private TaskService taskService;

	public TodoListApplication(TaskService taskService){
		this.taskService = taskService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (repetirMenu){
			System.out.println(" ");
			System.out.println(" ----------------------------------- ");

			System.out.println("Escolha sua opção: ");
			System.out.println("1 - Cadastrar uma Task: ");
			System.out.println("2 - Deletar uma Task: ");
			System.out.println("5 - Fechar o programa: ");
			Integer opcao = Integer.parseInt(sc.nextLine());
			switch(opcao){
				case 1:
					System.out.println("Digite a descrição da task: ");
					String desc = sc.nextLine();
					Task task = new Task(desc);
					taskService.salvarTask(task);
					break;
				case 2:
					List<Task> tasks = taskService.listarTask();
					System.out.println("Veja a listagem de todas as tasks cadastradas: ");
					tasks.forEach(item -> System.out.println("Id - " + item.getId() + " - " + item.getDescricao()));

					System.out.println("Informe o ID da task que desejas deletar: ");
					Long id = Long.parseLong(sc.nextLine());
					taskService.deletaTask(id);
					break;
				case 5:
					System.out.println("Até mais!");
					repetirMenu = false;
			}
		}
	}
}
