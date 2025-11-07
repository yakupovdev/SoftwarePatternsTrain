package Visitor.visitors;

import Visitor.elementsImpl.DirectoryImpl;
import Visitor.elementsImpl.FileImpl;

public interface IVisitor {
    void visit(FileImpl file);

    void visit(DirectoryImpl directory);
}
