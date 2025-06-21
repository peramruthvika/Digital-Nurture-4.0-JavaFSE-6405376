package week1.DesignPatternsAndPrinciples.DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier multiNotifier = new SMSNotifierDecorator(new SlackNotifierDecorator(baseNotifier));
        multiNotifier.send("Assignment deadline at 5PM!");
    }
}

