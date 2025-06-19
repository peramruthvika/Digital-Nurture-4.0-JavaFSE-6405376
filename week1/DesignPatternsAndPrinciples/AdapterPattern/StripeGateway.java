package week1.DesignPatternsAndPrinciples.AdapterPattern;
public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " via Stripe.");
    }
}