package week1.DesignPatternsAndPrinciples.ObserverPattern;

public interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}