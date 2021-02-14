package Lesson_3.HW_OOP.parkingEmployees;

public class EmployeeParkingAttendant implements IEmployee {
    @Override
    public void startWorkingDay() {
        System.out.println("Working day for parking attendant is started");
    }

    @Override
    public void endWorkingDay() {
        System.out.println("Working day for parking attendant is finished");
    }

    @Override
    public void openParing() {
        System.out.println("Parking attendant opens parking");
    }

    @Override
    public void closeParking() {
        System.out.println("Parking attendant closes parking");
    }

    public void parkCar() {
        System.out.println("Parking attendant park the car");
    }
}
