package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Володя", "Володин", (byte) 20);
        userService.saveUser("Володя1", "Володин1", (byte) 21);
        userService.saveUser("Володя2", "Володин2", (byte) 22);
        userService.saveUser("Володя3", "Володин3", (byte) 23);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
