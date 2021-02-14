package Lesson_3.HW_Polymorphism;

public class Runner {
    static Vehicle vehicle = new Vehicle();
    static Car car = new Car();
    static Tractor tractor = new Tractor();

    public static void main(String[] args) {
        vehicle.move();
        System.out.println();
        car.move();
        System.out.println();
        tractor.move();


    }
}
