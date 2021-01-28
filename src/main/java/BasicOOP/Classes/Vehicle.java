package BasicOOP.Classes;

public class Vehicle {

    //Create class with 5 variables of different types.
    static int wheelSize;
    int maxSpeed;
    long averageSpeed;
    double averageFuel;
    String color;
    char carSecurity;

    public void beepSound(String carBeepSound){
        System.out.println(carBeepSound);
    }


    Vehicle( int wSize, int mSpeed, double aFuel, String vehicleColor){
        wheelSize=wSize;
        maxSpeed=mSpeed;
        averageFuel = aFuel;
        vehicleColor = color;
    }

    Vehicle(){

    }
}
