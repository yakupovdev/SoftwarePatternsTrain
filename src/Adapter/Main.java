package Adapter;

import Adapter.adapters.*;
import Adapter.printers.*;

public class Main {
    public static void main(String[] args) {
        IPrinter colorPrinter = new OldColorPrinterAdapterImpl(new OldColorPrinter());
        IPrinter bwPrinter = new OldBwPrinterAdapterImpl(new OldBwPrinter());

        colorPrinter.print("Hello World");
        bwPrinter.print("Hello World");
    }
}
