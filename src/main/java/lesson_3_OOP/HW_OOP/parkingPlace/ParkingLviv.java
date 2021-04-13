package lesson_3_OOP.HW_OOP.parkingPlace;

public class ParkingLviv extends ParkingPlace {

    private int parkingLvivDiscount;

    public ParkingLviv(int parkingSquare, int parkingPlacesQuantity, int parkingPlacePrise, String parkingName) {
        this.setParkingSquare(parkingSquare);
        this.setParkingPlacesQuantity(parkingPlacesQuantity);
        this.setParkingPlacePrise(parkingPlacePrise);
        this.setParkingName(parkingName);
    }

    public int getParkingLvivDiscount() {
        return parkingLvivDiscount;
    }

    public void setParkingLvivDiscount(int parkingLvivDiscount) {
        this.parkingLvivDiscount = parkingLvivDiscount;
    }

    @Override
    public void getParkingInfo() {
        System.out.println(this.getParkingName());
        System.out.println(this.getParkingPlacePrise());
        System.out.println(this.getParkingSquare());
        System.out.println(this.getParkingPlacesQuantity());
        System.out.println(getParkingLvivDiscount());
    }

    @Override
    public void takeParkingPlace() {
        this.setParkingPlacesQuantity(this.getParkingPlacesQuantity() + 1);
    }

    @Override
    public void leaveParkingPlace() {
        this.setParkingPlacesQuantity(this.getParkingPlacesQuantity() - 1);
    }


}
