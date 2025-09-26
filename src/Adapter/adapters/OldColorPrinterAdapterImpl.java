package Adapter.adapters;

import Adapter.printers.OldColorPrinter;

public class OldColorPrinterAdapterImpl implements IPrinter {
    private final OldColorPrinter colorPrinter;



    private String defaultColor = "\u001B[34m";

    public OldColorPrinterAdapterImpl(OldColorPrinter colorPrinter) {
        this.colorPrinter = colorPrinter;
    }

    @Override
    public void print(String text) {
        colorPrinter.printColor(text, defaultColor);
    }
}
