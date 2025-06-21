package week1.DesignPatternsAndPrinciples.DecoratorPattern;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        notifier.send(message);
        System.out.println("Slack message sent: " + message);
    }
}