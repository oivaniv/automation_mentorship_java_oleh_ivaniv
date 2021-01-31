package SOLID.DependencyInversion;

import java.lang.management.MonitorInfo;

public class Windows98MachineOld {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98MachineOld(){
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}
