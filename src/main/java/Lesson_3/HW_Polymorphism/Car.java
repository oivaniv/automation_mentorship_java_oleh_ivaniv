package Lesson_3.HW_Polymorphism;

public class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("Start engine");
        System.out.println("Choose D on gearbox");
        System.out.println("Press on acceleration");
    }
}
