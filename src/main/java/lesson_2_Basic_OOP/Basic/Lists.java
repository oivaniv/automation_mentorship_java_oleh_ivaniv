package lesson_2_Basic_OOP.Basic;

import java.util.ArrayList;

public class Lists {

    static ArrayList<String> colors = new ArrayList<>();

    public static void createArrayList() {

        //.add() - to add value
        colors.add("Black");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);

    }

    public static void deleteArrayList() {
        colors.remove("Black");
    }

    public static void otherCommandsArrayList() {
        //To show one element by index
        System.out.println(colors.get(1));
        //To show returned bool value
        System.out.println(colors.contains("White"));
        //To show the ArrayList size
        System.out.println(colors.size());

        //.clear - remove all elements
        colors.clear();
    }

}
