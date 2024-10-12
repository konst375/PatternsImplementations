package org.chirko.behavioral.observer.weather;

public interface ChangeManager {
    void registerObserver(Subject subject, Observer observer);
    void removeObserver(Subject subject, Observer observer);
    void notifyObservers(Subject subject);
}
