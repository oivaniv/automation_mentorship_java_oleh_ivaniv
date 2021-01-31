package BasicOOP.InterfaceTask;

public class windowsDriver extends Driver {
    //overload another one in another one with involving corresponding driver functions
    @Override
    public void GetTextOfElement() {
        findElement();
        clickOnButton();
    }

    //In the main method, one should create an instance of a driver depending on the external argument.?????
    public static void main(String[] args) {
        Driver driver = new macDriver();

    }

    //Need clarifications????
    // For an abstract class set field which should become true when the method (clickOnButton) is performed at least once.
    // Configure the capabilities and click on some link and get some Text with implemented functions.
    // Almost all methods should be involved  except one which you should point out.
}
