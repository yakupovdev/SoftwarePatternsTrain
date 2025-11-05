package Visitor;

import Visitor.elements.DirectoryImpl;
import Visitor.elements.FileImpl;
import Visitor.visitors.PrintStructureVisitorImpl;
import Visitor.visitors.SizeCalculatorVisitorImpl;

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
