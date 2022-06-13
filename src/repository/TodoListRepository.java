package repository;

import entity.Todo;

public interface TodoListRepository {

    Todo[] getAll();

    void add(String val);

    boolean remove(int index);

    int length();

    boolean isFull();

    void resizeIfFull();
}
