package Basic;

import java.util.ArrayList;

public class Lists {


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        //.add() - to add value
        colors.add("Black");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);


        colors.remove("Black");

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
