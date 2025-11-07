package Visitor.elementsImpl;

import Visitor.elements.IElement;
import Visitor.visitors.IVisitor;

import java.util.List;

public class DirectoryImpl implements IElement {
    private final String name;
    private final List<IElement> children;

    public DirectoryImpl(String name, List<IElement> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public List<IElement> getChildren() {
        return children;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}