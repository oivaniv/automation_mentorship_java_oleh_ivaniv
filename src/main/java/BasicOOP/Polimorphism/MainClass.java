package BasicOOP.Polimorphism;

public class MainClass {
    public static void main(String[] args) {
        Country newUkraine = new Ukraine();
        Country newPoland = new Poland();
        Country newEngland = new England();

        //We have 3 the same methods, but they are overwritten in their classes
        newUkraine.callCountry();
        newPoland.callCountry();
        newEngland.callCountry();
    }
}
