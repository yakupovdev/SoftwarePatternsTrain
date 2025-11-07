package Visitor.visitorsImpl;

import Visitor.elementsImpl.DirectoryImpl;
import Visitor.elementsImpl.FileImpl;
import Visitor.visitors.IVisitor;

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
        directory.getChildren().forEach(child -> child.accept(this));
    }
}