package week1.DesignPatternsAndPrinciples.ObserverPattern;
public class ObserverTest {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket();
        Observer mob = new MobileApp();
        Observer web = new WebApp();

        sm.register(mob);
        sm.register(web);
        sm.setStock("AAPL", 225.50);
    }
}
