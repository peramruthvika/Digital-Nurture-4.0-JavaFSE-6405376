package week1.DesignPatternsAndPrinciples.StrategyPattern;
public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext ctx = new PaymentContext();
        ctx.setPaymentStrategy(new CreditCardPayment());
        ctx.pay(1200);
        ctx.setPaymentStrategy(new PayPalPayment());
        ctx.pay(500);
    }
}
