package Visitor.visitors;

import Visitor.elements.DirectoryImpl;
import Visitor.elements.FileImpl;

public interface IVisitor {
    void visit(FileImpl file);

    void visit(DirectoryImpl directory);
}
