package lesson_3_OOP.HW_OOP.parkingEmployees;

public class EmployeeParkingAccountant implements IEmployee {
    @Override
    public void startWorkingDay() {
        System.out.println("Working day for parking accountant is started");
    }

    @Override
    public void endWorkingDay() {
        System.out.println("Working day for parking accountant is finished");
    }

    @Override
    public void openParing() {
        System.out.println("Parking accountant opens parking");
    }

    @Override
    public void closeParking() {
        System.out.println("Parking accountant closes parking");
    }

    public void calculateSalary() {
        System.out.println("Parking accountant calculate the salary");
    }
}
