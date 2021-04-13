package lesson_3_OOP.HW_Polymorphism;

public class Tractor extends Vehicle{
    @Override
    public void move() {
        System.out.println("Start engine");
        System.out.println("Unlock caterpillars");
    }
}
