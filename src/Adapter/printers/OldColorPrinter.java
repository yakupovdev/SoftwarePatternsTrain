package Adapter.printers;

public class OldColorPrinter {
    public void printColor(String text, String colorCode) {
        System.out.println(colorCode + text + "\u001B[0m");
    }
}