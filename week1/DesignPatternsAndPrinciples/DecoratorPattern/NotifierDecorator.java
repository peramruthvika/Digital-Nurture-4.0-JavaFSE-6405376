package week1.DesignPatternsAndPrinciples.DecoratorPattern;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}
