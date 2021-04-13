package lesson_3_OOP.HW_OOP.parkingEmployees;

public class EmploeeSecurity implements IEmployee {
    @Override
    public void startWorkingDay() {
        System.out.println("Working day for security is started");
    }

    @Override
    public void endWorkingDay() {
        System.out.println("Working day for security is finished");
    }

    @Override
    public void openParing() {
        System.out.println("Security opens parking");
    }

    @Override
    public void closeParking() {
        System.out.println("Security closes parking");
    }
}
