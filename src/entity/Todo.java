package entity;

public class Todo {
    private String todo;

    public Todo(){}

    public Todo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        if (this.isNullOrEmpty()) return "";

        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isNullOrEmpty(){
        return todo.isEmpty() | todo.isBlank() | todo.equals(null) ;
    }
}
