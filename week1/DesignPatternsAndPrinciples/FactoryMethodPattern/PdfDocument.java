package week1.DesignPatternsAndPrinciples.FactoryMethodPattern;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
