package week1.DesignPatternsAndPrinciples.StrategyPattern;
public class PaymentContext {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay(double amount) {
        strategy.pay(amount);
    }
}