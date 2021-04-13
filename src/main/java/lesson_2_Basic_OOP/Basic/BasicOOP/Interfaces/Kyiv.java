package lesson_2_Basic_OOP.Basic.BasicOOP.Interfaces;

//Multiple implementation of the interface
public class Kyiv implements City, Village{

    @Override
    public void citySound() {
        System.out.println("The main sound is the threes");
    }

    @Override
    public void isCityClear() {
        System.out.println("This city isn't clear");
    }

    @Override
    public void Population() {
        System.out.println("Population is 2 0000 000");
    }

    @Override
    public void Territory() {
        System.out.println("This is very big city");

    }
}
