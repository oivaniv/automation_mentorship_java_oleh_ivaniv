package Lesson_3.HW_Abstract_Class_VS_Interface.Interface;

public class Runner {
    static Car car = new Car();
    static Tractor tractor = new Tractor();

    public static void main(String[] args) {
        useCar();
        //useTractor();

    }

    private static void useCar(){
        car.openDoor();
        car.startEngine();
        car.startMoveByWheels();
        car.stopMoveByWheels();
        car.stopEngine();
        car.closeDoor();
    }

    private static void useTractor(){
        tractor.openDoor();
        tractor.startEngine();
        tractor.startMoveByCaterpillar();
        tractor.stopMoveByCaterpillar();
        tractor.stopEngine();
        tractor.closeDoor();
    }
}
