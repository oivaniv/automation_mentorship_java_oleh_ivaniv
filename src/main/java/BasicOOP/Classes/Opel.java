package BasicOOP.Classes;

public class Opel {
    public static void main(String[] args) {
        createOpelCombo();
        createOpelVivaro();
    }

    //Create instance and print it in console.
    public static void createOpelCombo() {
        Vehicle opelCombo = new Vehicle();
        opelCombo.averageFuel = 4.5;
        opelCombo.maxSpeed = 120;
        opelCombo.color = "Green";
        opelCombo.beepSound("This is Opel Combo");

        System.out.println(opelCombo);
    }


    public static void createOpelVivaro(){
        Vehicle opelVivaro = new Vehicle(100, 18, 7.8, "Yellow");
        opelVivaro.beepSound("This is Opel Vivaro");

        System.out.println(opelVivaro);
    }

    //Can't understand this task
    // create or override method toString() that will print return text representation of instance.

}
