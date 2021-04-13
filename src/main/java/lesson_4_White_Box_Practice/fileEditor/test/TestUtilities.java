package lesson_4_White_Box_Practice.fileEditor.test;

import lesson_4_White_Box_Practice.fileEditor.java.User;
import org.testng.Assert;

public class TestUtilities {

    public static void assertUserData(User actualUser, User expectedUser){
        Assert.assertEquals(actualUser.getId(), expectedUser.getId());
        Assert.assertEquals(actualUser.getName(), expectedUser.getName());
        Assert.assertEquals(actualUser.getSurname(), expectedUser.getSurname());
    }
}
