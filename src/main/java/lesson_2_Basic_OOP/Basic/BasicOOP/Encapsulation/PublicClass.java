package lesson_2_Basic_OOP.Basic.BasicOOP.Encapsulation;

//For classes we can use 2 access modifiers: default (accessed for classes from this package) and public (access for all classes)
public class PublicClass {

    //There are 4 types of access modifier for attributes
    //default - accessed in the same package
    int defaultA;
    //public - accessed for all classes
    public int publicB;
    //private - accessed only in declared class
    private int privateC;
    //protected - accessed for package and subclasses
    protected int protectedD;

    //There are 4 types of access modifier for methods
    void defaultShowMSG() {
        System.out.println("Default MSG");
    }

    public void publicShowMsg() {
        System.out.println("Public MSG");
    }

    private void privateShowMsg() {
        System.out.println("Private MSG");
    }

    protected void protectedShowMSG() {
        System.out.println("Protected MSG");
    }


    //There are 4 types of access modifier for Constructor
    PublicClass() {

    }

    public PublicClass(String A) {

    }

    private PublicClass(int b) {

    }

    protected PublicClass(double c) {

    }

    public static void main(String[] args) {

    }


}
