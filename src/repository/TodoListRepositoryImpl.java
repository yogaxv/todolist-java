package repository;

import entity.Todo;

public class TodoListRepositoryImpl implements TodoListRepository {
    private int size;
    private int filled;
    private Todo[] todolist;

    public TodoListRepositoryImpl() {
        size = 5;
        filled = 0;
        todolist = new Todo[size];
    }

    @Override
    public Todo[] getAll() {
        return todolist;
    }

    @Override
    public void add(String val) {
       if( this.isFull() ) this.resizeIfFull();

       todolist[filled++] = new Todo(val);
    }

    @Override
    public boolean remove(int index) {
        if(filled == -1) return false;

        Todo[] temp = new Todo[size];

        for (int i = 0; i < filled; i++) {

            if (i > index) {
                temp[i - 1] = todolist[i];
            }
            else {
                temp[i] = todolist[i];
            }

        }

        filled--;

        todolist = temp;

        return true;
    }

    @Override
    public boolean isFull() {
        return size == filled ;
    }

    @Override
    public void resizeIfFull() {
        size = size * 2;
        Todo[] temp = new Todo[size];
        for (int i = 0; i < todolist.length; i++) {
            temp[i] = todolist[i];
        }

        todolist = temp;
    }

    public int length() {
        return filled;
    }
}
