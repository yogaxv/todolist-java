package service;

import entity.Todo;
import repository.TodoListRepositoryImpl;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepositoryImpl _repository;

    public TodoListServiceImpl(TodoListRepositoryImpl _repository) {
        this._repository = _repository;
    }

    @Override
    public void showTodoList() {

        for (int i = 0; i < _repository.length(); i++) {
            System.out.println((i + 1) + ". " + _repository.getAll()[i].toString());
        }
    }

    @Override
    public void addTodoList(String todo) {
        _repository.add(todo);
        System.out.println("Sukses menambakan : " +todo);
    }

    @Override
    public void removeTodoList(int number) {
        if(number < 1 || number > _repository.length()) {
            System.out.println("Todo tidak dapat ditemukan");
            return;
        }

        boolean success  = _repository.remove(number-1);
        System.out.println(success ? "Berhasil" : "Gagal" + " menghapus todo no " + number);
    }
}
