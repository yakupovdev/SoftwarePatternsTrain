package Visitor;

import Visitor.elementsImpl.DirectoryImpl;
import Visitor.elementsImpl.FileImpl;
import Visitor.visitorsImpl.PrintStructureVisitorImpl;
import Visitor.visitorsImpl.SizeCalculatorVisitorImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileImpl file1 = new FileImpl("readme.txt", 1200);
        FileImpl file2 = new FileImpl("photo.jpg", 204800);
        FileImpl file3 = new FileImpl("notes.md", 800);

        DirectoryImpl images = new DirectoryImpl("images", Arrays.asList(file2));
        DirectoryImpl docs = new DirectoryImpl("docs", Arrays.asList(file3));
        DirectoryImpl root = new DirectoryImpl("root", Arrays.asList(file1, images, docs));

        PrintStructureVisitorImpl printer = new PrintStructureVisitorImpl();
        root.accept(printer);

        SizeCalculatorVisitorImpl sizeCalc = new SizeCalculatorVisitorImpl();
        root.accept(sizeCalc);
        System.out.println("\nTotal size: " + sizeCalc.getTotalSize() + " bytes");
    }
}
