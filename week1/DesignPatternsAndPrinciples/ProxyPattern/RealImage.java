package week1.DesignPatternsAndPrinciples.ProxyPattern;
public class RealImage implements Image {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }
    public void display() {
        System.out.println("Displaying: " + filename);
    }
}