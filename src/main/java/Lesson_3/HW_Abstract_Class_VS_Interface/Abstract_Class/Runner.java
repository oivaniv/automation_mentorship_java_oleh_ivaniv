package Lesson_3.HW_Abstract_Class_VS_Interface.Abstract_Class;

public class Runner {
    static Car car = new Car(100, "Opel");
    static Tractor tractor = new Tractor(0, "CAT");

    public static void main(String[] args) {
        car.startEngine();
        car.stopEngine();
    }
}
