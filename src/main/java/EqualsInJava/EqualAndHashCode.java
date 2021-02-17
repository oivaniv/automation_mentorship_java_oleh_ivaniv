package EqualsInJava;

import org.testng.annotations.Test;


public class EqualAndHashCode {
    @Test
    public void primitivesShouldBeEqual(){
        int firstValue = 3;
        int secondValue = 3;
    }

    @Test
    public void stringShouldBeEqual(){
        String firstString = "Hello";
        String secondString = "Hello";
        String thirdString = "H";
        thirdString = thirdString+"ello";

        System.out.println(thirdString);

        //assertTrue(firstString==secondString);
        //assertTrue(firstString==thirdString); - this will fail , cause firstString != thirdString

        //To compare Sting we use equals
        //assertTrue(firstString.equals(thirdString));
    }

    @Test
    public void porscheShouldBeEqual(){
        Car car1= new Car("Oleh", "Opel", "White");
        Car car2= new Car("Oleh", "Opel", "White");
        Car car3= new Car("Petro", "Opel", "White");


        //assertTrue(car1==car2); - will fail cause we compare the instance of object

        //assertTrue(car1.equals(car2)); - by default it will fail cause .equal compare object, and there are 2 different objects

        //When we override the .equal() and .hashCode() due to our class, this method will work correct for us
        //assertTrue(car1.equals(car2));

        //.hashCode() method is unique identifier of object
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());


    }
}
