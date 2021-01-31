package SOLID.InterfaceSegregation;

public class BearCarer implements BearCleaner, BearFeeder{

    @Override
    public void washTheBeer() {
        System.out.println("We will wash him");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Mmmmm, so good");
    }
}
