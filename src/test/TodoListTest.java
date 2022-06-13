package test;

import entity.Todo;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;

public class TodoListTest {
    public static void main(String[] args) {
        Todo todo1 = new Todo("Membuat Todo 1");
        System.out.println(todo1.toString());

        Todo todo2 = new Todo();
        todo2.setTodo("Membuat todo 2");

        System.out.println(todo2.toString());

        TodoListRepositoryImpl repository = new TodoListRepositoryImpl();

        repository.add("TEST 1");
        repository.add("TEST 2");
        repository.add("TEST 3");
        repository.add("TEST 4");

        System.out.println(repository.isFull());
        System.out.println(repository.length());

        boolean testRemove = repository.remove(1);

        if(!testRemove) {
            System.out.println("gagal");
            System.exit(0);
        }

        var todolist = repository.getAll();
        for (int i = 0; i < repository.length(); i++) {

            System.out.println(todolist[i].toString());
        }

        System.out.println(repository.length());

        TodoListRepositoryImpl repository1 = new TodoListRepositoryImpl();
        TodoListServiceImpl service = new TodoListServiceImpl(repository1);

        service.addTodoList("Todo 1");
        service.addTodoList("Todo 2");
        service.showTodoList();
        service.removeTodoList(2);
        service.showTodoList();

    }
}
