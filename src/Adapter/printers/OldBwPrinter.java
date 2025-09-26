package Adapter.printers;

public class OldBwPrinter {
    public void printBw(String text) {
        System.out.println("\u001B[37;40m" + text + "\u001B[0m");
    }
}
