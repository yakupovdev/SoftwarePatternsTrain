package Visitor.visitorsImpl;

import Visitor.elementsImpl.DirectoryImpl;
import Visitor.elementsImpl.FileImpl;
import Visitor.elements.IElement;
import Visitor.visitors.IVisitor;

public class PrintStructureVisitorImpl implements IVisitor {
    private int indent = 0;

    private void printIndent() {
        for (int i = 0; i < indent; i++) System.out.print("  ");
    }

    @Override
    public void visit(FileImpl file) {
        printIndent();
        System.out.println("- " + file.getName() + " (" + file.getSize() + " bytes)");
    }

    @Override
    public void visit(DirectoryImpl directory) {
        printIndent();
        System.out.println("+ " + directory.getName() + "/");
        indent++;
        for (IElement e : directory.getChildren()) {
            e.accept(this);
        }
        indent--;
    }
}