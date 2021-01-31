package SOLID.DependencyInversion;

public class Windows98MachineNew {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98MachineNew(Keyboard keyboard, Monitor monitor){
       this.keyboard= keyboard;
       this.monitor = monitor;
    }
}
