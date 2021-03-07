package Lesson_4.fileEditor.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static Lesson_4.fileEditor.java.UserManager.DEFAULT_PATH;

public class TestHelper {

    private File file;
    private FileWriter printWriter;


    public void deleteFileTest() {
        System.out.println();

        File file = new File(DEFAULT_PATH);
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " is deleted");
        } else {
            System.out.println("No such file - " + file.getName());
        }
    }

    public void setDataToFile(int id, String name, String surname) throws IOException {
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        System.out.println(String.format("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s", id, name, surname));
        bw.write(String.format("%1$s,%2$s,%3$s", id, name, surname));
        bw.newLine();
        bw.close();
    }

}
