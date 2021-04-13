package lesson_2_Basic_OOP.Basic.BasicOOP.Interfaces;

public class Lviv implements City{
    @Override
    public void citySound() {
        System.out.println("Main sound is the tram");
    }

    @Override
    public void isCityClear() {
        System.out.println("This city is clear");
    }
}
