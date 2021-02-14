package Lesson_3.HW_Polymorphism;

public class Tractor extends Vehicle{
    @Override
    public void move() {
        System.out.println("Start engine");
        System.out.println("Unlock caterpillars");
    }
}
