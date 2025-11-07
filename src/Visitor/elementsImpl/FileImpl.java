package Visitor.elementsImpl;

import Visitor.elements.IElement;
import Visitor.visitors.IVisitor;

public class FileImpl implements IElement {
    private final String name;
    private final int size;

    public FileImpl(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
