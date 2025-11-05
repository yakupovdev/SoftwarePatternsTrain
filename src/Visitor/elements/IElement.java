package Visitor.elements;

import Visitor.visitors.IVisitor;

public interface IElement {
    void accept(IVisitor visitor);
}
