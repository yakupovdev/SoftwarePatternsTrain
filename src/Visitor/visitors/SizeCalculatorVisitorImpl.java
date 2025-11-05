package Visitor.visitors;

import Visitor.elements.DirectoryImpl;
import Visitor.elements.FileImpl;
import Visitor.elements.IElement;

public class SizeCalculatorVisitorImpl implements IVisitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(FileImpl file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(DirectoryImpl directory) {
        for (IElement e : directory.getChildren()) {
            e.accept(this);
        }
    }
}

