package lesson_3_OOP.HW_OOP.parkingEmployees;

public class EmloyeeParkingManager implements IEmployee {
    @Override
    public void startWorkingDay() {
        System.out.println("Working day for parking manager is started");

    }

    @Override
    public void endWorkingDay() {
        System.out.println("Working day for parking manager is finished");

    }

    @Override
    public void openParing() {
        System.out.println("Parking manager opens parking");

    }

    @Override
    public void closeParking() {
        System.out.println("Parking manager close parking");

    }

    public void fireEmployee() {
        System.out.println("Parking employee fire one of other employee");
    }
}
