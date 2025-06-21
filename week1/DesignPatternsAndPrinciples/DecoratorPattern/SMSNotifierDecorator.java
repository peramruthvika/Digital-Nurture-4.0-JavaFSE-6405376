package week1.DesignPatternsAndPrinciples.DecoratorPattern;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        notifier.send(message);
        System.out.println("SMS sent: " + message);
    }
}