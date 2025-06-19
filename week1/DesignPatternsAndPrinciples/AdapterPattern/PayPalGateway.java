package week1.DesignPatternsAndPrinciples.AdapterPattern;
public class PayPalGateway {
    public void sendMoney(double amount) {
        System.out.println("Paid Rs." + amount + " via PayPal.");
    }
}