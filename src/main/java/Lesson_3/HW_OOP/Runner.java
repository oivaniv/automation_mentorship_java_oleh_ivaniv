package Lesson_3.HW_OOP;

import Lesson_3.HW_OOP.parkingEmployees.EmloyeeParkingManager;
import Lesson_3.HW_OOP.parkingEmployees.EmploeeSecurity;
import Lesson_3.HW_OOP.parkingEmployees.EmployeeParkingAttendant;
import Lesson_3.HW_OOP.parkingEmployees.IEmployee;
import Lesson_3.HW_OOP.parkingPlace.ParkingLviv;
import Lesson_3.HW_OOP.parkingPlace.ParkingPlace;
import Lesson_3.HW_OOP.parkingUsers.IUsers;
import Lesson_3.HW_OOP.parkingUsers.UserOwner;
import Lesson_3.HW_OOP.parkingUsers.UserTenant;

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
