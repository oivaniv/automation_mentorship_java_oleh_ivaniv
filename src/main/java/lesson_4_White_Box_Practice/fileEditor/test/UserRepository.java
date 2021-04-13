package lesson_4_White_Box_Practice.fileEditor.test;

import lesson_4_White_Box_Practice.fileEditor.java.User;

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
