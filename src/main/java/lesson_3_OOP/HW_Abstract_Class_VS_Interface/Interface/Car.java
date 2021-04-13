package lesson_3_OOP.HW_Abstract_Class_VS_Interface.Interface;

public class Car implements Vehicle, Wheels{
    @Override
    public void startEngine() {
        System.out.println("Start car engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop car engine");
    }

    @Override
    public void openDoor() {
        System.out.println("Open car door");
    }

    @Override
    public void closeDoor() {
        System.out.println("Close car door");
    }

    @Override
    public void startMoveByWheels() {
        System.out.println("Choose D on gearbox");
        System.out.println("Press acceleration");
    }

    @Override
    public void stopMoveByWheels() {
        System.out.println("Stop acceleration");
        System.out.println("Choose P on gearbox");
    }
}
