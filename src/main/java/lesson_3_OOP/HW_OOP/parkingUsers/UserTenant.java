package lesson_3_OOP.HW_OOP.parkingUsers;

public class UserTenant implements IUsers {

    private int rentedSlots;

    @Override
    public void openParking() {
        System.out.println("Tenant open parking");
    }

    @Override
    public void closeParking() {
        System.out.println("Tenant close parking");
    }

    public int getRentedSlots() {
        return rentedSlots;
    }

    public void setRentedSlots(int rentedSlots) {
        this.rentedSlots = rentedSlots;
    }

    public void rentSlot(int slotsToRent) {
        setRentedSlots(getRentedSlots() + slotsToRent);
    }

    public void backFromRent(int slotsBackFromRent) {
        setRentedSlots(getRentedSlots() - slotsBackFromRent);
    }


}
