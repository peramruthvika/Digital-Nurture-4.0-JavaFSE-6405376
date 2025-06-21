package week1.DesignPatternsAndPrinciples.StrategyPattern;
public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}