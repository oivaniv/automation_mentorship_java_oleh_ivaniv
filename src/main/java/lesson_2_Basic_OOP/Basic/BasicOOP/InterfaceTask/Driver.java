package lesson_2_Basic_OOP.Basic.BasicOOP.InterfaceTask;

//Create an abstract class driver with implementing the interface.
public abstract class Driver implements IDriver {

    @Override
    public void clickOnButton() {
        // Involve them in public methods coming from interface.
        clickOnElement();
    }

    @Override
    public void GetTextOfElement() {
        // Involve them in public methods coming from interface.
        findElement();
    }

    //Add two other methods clickOnElement and findElement.
    //One of them should be visible for child classes only and another one with frames of package.
    private void clickOnElement() {

    }

    void findElement() {

    }

    boolean abstractMethodResult;

}
