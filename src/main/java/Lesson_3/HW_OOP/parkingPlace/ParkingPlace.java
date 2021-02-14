package Lesson_3.HW_OOP.parkingPlace;

public abstract class ParkingPlace {

    private int parkingSquare;
    private int parkingPlacesQuantity;
    private int parkingPlacePrise;
    private String parkingName;

    public int getParkingSquare() {
        return parkingSquare;
    }

    public void setParkingSquare(int parkingSquare) {
        this.parkingSquare = parkingSquare;
    }

    public int getParkingPlacesQuantity() {
        return parkingPlacesQuantity;
    }

    public void setParkingPlacesQuantity(int parkingPlacesQuantity) {
        this.parkingPlacesQuantity = parkingPlacesQuantity;
    }

    public int getParkingPlacePrise() {
        return parkingPlacePrise;
    }

    public void setParkingPlacePrise(int parkingPlacePrise) {
        this.parkingPlacePrise = parkingPlacePrise;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public abstract void getParkingInfo();


    public void takeParkingPlace(){
        setParkingPlacesQuantity(getParkingPlacesQuantity()-1);
    }

    public void leaveParkingPlace(){
        setParkingPlacesQuantity(getParkingPlacesQuantity()+1);
    }




}
