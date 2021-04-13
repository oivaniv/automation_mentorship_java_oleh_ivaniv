package lesson_3_OOP.HW_OOP;

import lesson_3_OOP.HW_OOP.parkingEmployees.EmloyeeParkingManager;
import lesson_3_OOP.HW_OOP.parkingEmployees.EmploeeSecurity;
import lesson_3_OOP.HW_OOP.parkingEmployees.EmployeeParkingAttendant;
import lesson_3_OOP.HW_OOP.parkingEmployees.IEmployee;
import lesson_3_OOP.HW_OOP.parkingPlace.ParkingLviv;
import lesson_3_OOP.HW_OOP.parkingPlace.ParkingPlace;
import lesson_3_OOP.HW_OOP.parkingUsers.IUsers;
import lesson_3_OOP.HW_OOP.parkingUsers.UserOwner;
import lesson_3_OOP.HW_OOP.parkingUsers.UserTenant;

public class Runner {


    public static void main(String[] args) {

        IEmployee OlehParkingManager = new EmloyeeParkingManager();
        IEmployee PetroSecurity = new EmploeeSecurity();
        IEmployee StepanAttendant = new EmployeeParkingAttendant();

        ParkingPlace ParkinKingKros = new ParkingLviv(1000, 50, 1, "King Kross");

        IUsers IvanOwner = new UserOwner();
        IUsers IgorTenant = new UserTenant();

        OlehParkingManager.openParing();
        OlehParkingManager.closeParking();
        System.out.println();

        PetroSecurity.startWorkingDay();
        PetroSecurity.endWorkingDay();
        System.out.println();

        StepanAttendant.startWorkingDay();
        StepanAttendant.endWorkingDay();
        System.out.println();

        System.out.println("This is parking info:");
        ParkinKingKros.getParkingInfo();
        System.out.println();

        IvanOwner.openParking();
        IvanOwner.closeParking();
        System.out.println();

        IgorTenant.openParking();
        IgorTenant.closeParking();

    }
}
