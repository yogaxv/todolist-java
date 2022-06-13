import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import view.TodoListView;

public class Application {
    public static void main(String[] args) {
        TodoListRepositoryImpl repository = new TodoListRepositoryImpl();
        TodoListServiceImpl service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        view.showTodoList();
    }
}
