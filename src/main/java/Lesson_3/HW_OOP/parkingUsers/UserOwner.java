package Lesson_3.HW_OOP.parkingUsers;

public class UserOwner implements IUsers {

    private int parkingSlots;
    private int busyParkingSlots = 0;
    private int emptyParkingSlots = parkingSlots - busyParkingSlots;


    @Override
    public void openParking() {
        System.out.println("Owner open parking");
    }

    @Override
    public void closeParking() {
        System.out.println("Owner close parking");
    }

    public int getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(int parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public int getBusyParkingSlots() {
        return busyParkingSlots;
    }

    public void setBusyParkingSlots(int busyParkingSlots) {
        this.busyParkingSlots = busyParkingSlots;
    }

    public int getEmptyParkingSlots() {
        return emptyParkingSlots;
    }


    public void saleParkingSlot(int slotsToSaleQuantity) {
        setParkingSlots(getParkingSlots() - slotsToSaleQuantity);
    }

    public void buyParkingSlot(int slotsToBuyQuantity) {
        setParkingSlots(getParkingSlots() + slotsToBuyQuantity);
    }

    public void rentParkingSlot() {
        setBusyParkingSlots(getBusyParkingSlots() + 1);
    }

    public void backFromRentParkingPlace() {
        setBusyParkingSlots(getBusyParkingSlots() - 1);
    }


}
