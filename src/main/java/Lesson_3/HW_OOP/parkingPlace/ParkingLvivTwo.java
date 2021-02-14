package Lesson_3.HW_OOP.parkingPlace;

public class ParkingLvivTwo extends ParkingLviv{
    ParkingLvivTwo(int parkingSquare, int parkingPlacesQuantity, int parkingPlacePrise, String parkingName) {
        super(parkingSquare, parkingPlacesQuantity, parkingPlacePrise, parkingName);
    }

    private int subrentalSquare;

    public int getSubrentalSquare() {
        return subrentalSquare;
    }

    public void setSubrentalSquare(int subrentalSquare) {
        this.subrentalSquare = subrentalSquare;
    }


}
