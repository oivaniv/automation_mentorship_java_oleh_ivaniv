package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;

public class UserRepository {
    public static User getDefaultValidUser(){
        User user = new User();
        user.setId(1);
        user.setName("testname");
        user.setSurname("testsurname");
        return user;
    }

    public static User getUserWithCustomId(int id){
        User user = new User();
        user.setId(id);
        user.setName("testname");
        user.setSurname("testsurname");
        return user;
    }

    public static User getDefaultInvalidIdUser(){
        User user = new User();
        user.setId(0);
        user.setName("testname");
        user.setSurname("testsurname");
        return user;
    }

    public static User getEmptyUser(){
        return new User();
    }
}
