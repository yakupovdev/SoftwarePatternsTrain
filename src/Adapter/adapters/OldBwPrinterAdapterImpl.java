package Adapter.adapters;

import Adapter.printers.OldBwPrinter;

public class OldBwPrinterAdapterImpl implements IPrinter {
    private final OldBwPrinter bwPrinter;

    public OldBwPrinterAdapterImpl(OldBwPrinter bwPrinter) {
        this.bwPrinter = bwPrinter;
    }

    @Override
    public void print(String text) {
        bwPrinter.printBw(text);
    }
}
