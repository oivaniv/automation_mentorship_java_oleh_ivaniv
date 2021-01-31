package SOLID.SingleResponsibility;

public class BookPrinter {
    void printTextToConsole(String text){
        System.out.println(text);
    }

    void printTextToAnotherConsole(String text){
        System.out.print(text);
    }
}
