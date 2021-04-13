package lesson_2_Basic_OOP.Basic.EqualsInJava;


public class Primitive {

    public static void ValueCompare(){
        int integerOne = 1;
        int intergerTwo = 1;
        System.out.println(integerOne==intergerTwo);

        System.out.println(integerOne!=intergerTwo);
    }

    public static void ObjectCompare(){
        Integer firstValue = new Integer(1);
        Integer secondValue = new Integer(1);

        //The value of firstValue and secondValue are different cause both of them are object with assigned value
        System.out.println(firstValue==secondValue);
        System.out.println(firstValue!=secondValue);
        System.out.println(firstValue);
        System.out.println(secondValue);

        System.out.println(firstValue.equals(secondValue));
    }

    public static void stringCompareAsObject(){
        String helloOne = "Hello";
        String helloTwo = "Hello";

        System.out.println("Hello" == "Hello");
        System.out.println(helloOne==helloTwo);
    }



}
