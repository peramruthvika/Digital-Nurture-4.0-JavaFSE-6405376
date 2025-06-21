package week1.DesignPatternsAndPrinciples.ProxyPattern;
public class ProxyTest {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo1.png");
        img.display(); // loads and displays
        img.display(); // displays without loading
    }
}