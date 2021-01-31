package BasicOOP.AbstractClasses;

public class MyHome extends House{

    @Override
    public void OpenWindows() {
        System.out.println("Open all windows");
    }

    @Override
    public void OpenDors() {
        System.out.println("Open only 2 doors");
    }

    public static void main(String[] args) {
    }
}
