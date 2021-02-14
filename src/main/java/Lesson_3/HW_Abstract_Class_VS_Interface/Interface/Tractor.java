package Lesson_3.HW_Abstract_Class_VS_Interface.Interface;

public class Tractor implements Vehicle, Caterpillar {
    @Override
    public void startMoveByCaterpillar() {
        System.out.println("Unlock caterpillars");
    }

    @Override
    public void stopMoveByCaterpillar() {
        System.out.println("Lock caterpillars");
    }

    @Override
    public void startEngine() {
        System.out.println("Start tractor engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop tractor engine");
    }

    @Override
    public void openDoor() {
        System.out.println("Open tractor door");

    }

    @Override
    public void closeDoor() {
        System.out.println("Close tractor door");

    }
}
