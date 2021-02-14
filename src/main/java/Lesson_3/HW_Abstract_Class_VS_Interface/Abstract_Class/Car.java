package Lesson_3.HW_Abstract_Class_VS_Interface.Abstract_Class;

public class Car extends Vehicle{


    @Override
    public void move() {
        System.out.println("Car move forward");
    }

    @Override
    public void stopMove() {
        System.out.println("Car stops");
    }



    Car(int wheels, String model) {
        super(wheels, model);
    }

}
