package lesson_3_OOP.HW_Abstract_Class_VS_Interface.Abstract_Class;

public class Tractor extends Vehicle {
    Tractor(int wheels, String model) {
        super(wheels, model);
    }

    @Override
    public void move() {
        System.out.println("Tractor move forward");
    }

    @Override
    public void stopMove() {
        System.out.println("Tractor stops");
    }

}
