package Lesson_3.HW_Abstract_Class_VS_Interface.Abstract_Class;

public abstract class Vehicle {

    private int wheels;
    private String model;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void startEngine(){
        System.out.println("Start engine command");
    }

    public abstract void move();

    public abstract void stopMove();

    void stopEngine(){
        System.out.println("Stop engine command");
    }

    Vehicle(int wheels, String model){
        this.wheels = wheels;
        this.model=model;
    }

}
