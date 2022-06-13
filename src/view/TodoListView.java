package view;

import service.TodoListServiceImpl;
import util.InputUtil;

public class TodoListView {

    private final TodoListServiceImpl service;

    public TodoListView(TodoListServiceImpl service) {
        this.service = service;
    }

    public void showTodoList() {
        while (true)
        {
            System.out.println("Todo List : ");
            service.showTodoList();

            System.out.println("Masukan Perintah :");
            System.out.println("(1) Tambah Todo          (2) Hapus Todo       (x) Tutup Aplikasi");

            var choice  = InputUtil.input("Pilih");

            switch (choice) {
                case "1" -> addTodoList();
                case "2" -> removeTodoList();
                case "x" -> {
                    System.out.println("Tutup Aplikasi dipilih");
                    System.exit(0);
                }
                default -> System.out.println("Perintah tidak ditemukan");
            }

        }
    }

    void addTodoList() {
        var value  = InputUtil.input("Todo Baru");
        service.addTodoList(value);
    }

    void removeTodoList() {
        var value = InputUtil.input("Masukan Nomor yang akan di hapus");
        service.removeTodoList(Integer.valueOf(value));
    }
}
