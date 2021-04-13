package lesson_2_Basic_OOP.Basic.BasicOOP.Encapsulation;

public abstract class AbstractClass {
    public static void main(String[] args) {
        //Non-Access modifiers
        //For classes:
        //- final - class can't be inherited by other classes
        //public final class FinalClass(){ }

        //- abstract - class can be used to create objects
        //public abstract AbstractClassNew(){}

        //For attributes (variables, methods)
        //- final - class can't be inherited by other classes
        final int finalIntA;
        //- abstract - can be used to only in abstract class and only to create abstract method

        //- static - attributes belong to the class, not the object
    }
    public abstract void AccessModifierTask();

    public static void StaticClass(){
        System.out.println("This is static class");
    }
}
